package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Math.ceil;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.swing.JOptionPane;

/**
 * @author JavaDigest
 *
 */
public class Encryption {

    private String algoritmo = "RSA";
    private String caminhoChavePrivada;
    private String caminhoChavePublica;

    // Inicio do Encapsulamento    
    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getCaminhoChavePrivada() {
        return caminhoChavePrivada;
    }

    public void setCaminhoChavePrivada(String caminhoChavePrivada) {
        this.caminhoChavePrivada = caminhoChavePrivada;
    }

    public String getCaminhoChavePublica() {
        return caminhoChavePublica;
    }

    public void setCaminhoChavePublica(String caminhoChavePublica) {
        this.caminhoChavePublica = caminhoChavePublica;
    }
    // Fim do Encapsulamento

    /**
     * Generate key which contains a pair of private and public key using 2048
     * bytes.
     *
     * @throws NoSuchAlgorithmException
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void criarChaves() {
        try {
            final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(getAlgoritmo());
            keyGen.initialize(2048);
            final KeyPair key = keyGen.generateKeyPair();

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String data = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(timestamp.getTime());

            setCaminhoChavePublica(System.getProperty("user.dir") + "/chaves/" + data + "_public.key");
            setCaminhoChavePrivada(System.getProperty("user.dir") + "/chaves/" + data + "_private.key");

            File privateKeyFile = new File(getCaminhoChavePrivada()); //Instancio minha chave privada.
            File publicKeyFile = new File(getCaminhoChavePublica()); // Instancio minha chave pública.

            // Cria arquivos para armazenar chaves públicas e privadas.
            if (privateKeyFile.getParentFile() != null) {
                privateKeyFile.getParentFile().mkdirs();
            }
            privateKeyFile.createNewFile();

            if (publicKeyFile.getParentFile() != null) {
                publicKeyFile.getParentFile().mkdirs();
            }
            publicKeyFile.createNewFile();

            // Salvando a chave pública num arquivo.
            ObjectOutputStream publicKeyOS = new ObjectOutputStream(
                    new FileOutputStream(publicKeyFile)
            );
            publicKeyOS.writeObject(key.getPublic());
            publicKeyOS.close();

            // Salvando a chave privada num arquivo.
            ObjectOutputStream privateKeyOS = new ObjectOutputStream(
                    new FileOutputStream(privateKeyFile)
            );
            privateKeyOS.writeObject(key.getPrivate());
            privateKeyOS.close();

        } catch (Exception e) { //Pega os bugs
            e.printStackTrace();
        }
    }

    public boolean verificarChaves() {
        File privateKey = new File(getCaminhoChavePrivada());
        File publicKey = new File(getCaminhoChavePublica());

        return (privateKey.exists() && publicKey.exists()) ? true : false;
    }

    public String[] encriptografar(String texto) {
        int tamanhoArray = (int) ceil((double) texto.length() / 116);
        String[] resultado = new String[tamanhoArray];

        try {
            ObjectInputStream dados = new ObjectInputStream(new FileInputStream(getCaminhoChavePublica()));
            PublicKey chavePublica = (PublicKey) dados.readObject();

            final Cipher cipher = Cipher.getInstance(getAlgoritmo());
            cipher.init(Cipher.ENCRYPT_MODE, chavePublica);

            for (int i = 0, aux = 0; i < tamanhoArray; i++) {
                byte[] cipherText = new byte[0];

                cipherText = cipher.doFinal(
                        texto.substring(
                                aux,
                                Math.min(aux + 116, texto.length())
                        ).getBytes()
                );

                resultado[i] = Arrays.toString(cipherText);
                aux += 116;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public String decriptografar(String[] texto) {
        String segredo = "";

        try {
            ObjectInputStream dados = new ObjectInputStream(new FileInputStream(getCaminhoChavePrivada()));
            PrivateKey chavePrivada = (PrivateKey) dados.readObject();

            final Cipher cipher = Cipher.getInstance(getAlgoritmo());
            cipher.init(Cipher.DECRYPT_MODE, chavePrivada);

            for (int i = 0; i < texto.length; i++) {
                String[] valores_binarios = texto[i].substring(1, texto[i].length() - 1).split(",");
                byte[] audioData = new byte[valores_binarios.length];

                for (int j = 0; j < audioData.length; j++) {
                    audioData[j] = Byte.parseByte(valores_binarios[j].trim());
                }

                byte[] dectyptedText = cipher.doFinal(audioData);
                segredo += new String(dectyptedText);
            }
        } catch (Exception ex) {  // Pega os bugs 
            JOptionPane.showMessageDialog(null,"Erro ao decriptografar a mensagem!\nPor favor, Verifique se selecionou a chave privada correta!");
        }

        return segredo;
    }

}
