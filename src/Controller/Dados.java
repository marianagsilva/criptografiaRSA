package Controller;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * @author Mariana de Lourdes Godoy da Silva 
 */
public class Dados {

    private String nome_arquivo;

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    public void novoArquivo() {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String nome = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(timestamp.getTime());
            
            this.setNome_arquivo(
                System.getProperty("user.dir") +
                "/arquivos/" +
                nome +
                ".txt"
            );

            File arquivo = new File(getNome_arquivo());

            if (arquivo.getParentFile() != null) {
                arquivo.getParentFile().mkdirs();
            }
            
            arquivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] lerArquivo() {        
        String[] resultado = {};
        
        try (BufferedReader buffer = new BufferedReader(new FileReader(getNome_arquivo()))) {
            int num_linhas = Integer.parseInt(buffer.readLine());
            resultado = new String[num_linhas];
            for (int i = 0; i < num_linhas; i++) {
                resultado[i] = buffer.readLine();
            }
        }catch(IOException ex){
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;        
    }

    public void gravarArquivo(String[] conteudo) {
        try {
            novoArquivo();

            BufferedWriter buffer = new BufferedWriter(new FileWriter(getNome_arquivo()));

            // Gravo a quantidade de 'blocos'
            buffer.append(conteudo.length + "\n");
            
            for (int i = 0; i < conteudo.length; i++) {
                buffer.append(
                        (i != conteudo.length - 1) ? conteudo[i] + "\n" : conteudo[i]
                );
            }

            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ImageIcon mudarIcone(int largura, int altura, String nome) {
        ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/" + nome));
        Image imagem = icone.getImage().getScaledInstance(
                largura,
                altura,
                Image.SCALE_DEFAULT
        );

        return (new ImageIcon(imagem));
    }
}
