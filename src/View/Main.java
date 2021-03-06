package View;

import Controller.Audio;
import Controller.Encryption;
import Controller.Dados;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * @author Douglas D. Carvalho
 */
public class Main extends javax.swing.JFrame {
    
    private Audio audioEncriptografado;
    private Audio audioDecriptografado;
    
    private Encryption criptografia = new Encryption();
    private Dados I_O = new Dados();
    
    private File arquivo = null;
    
    private JFileChooser menu = new JFileChooser();
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Chaves & Mensagens", "key", "txt");
        
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        menu.setFileFilter(filtro);
        
        imagemEncriptografia.setIcon(
            I_O.mudarIcone(
                imagemEncriptografia.getWidth(),
                imagemEncriptografia.getHeight(),
                "microfone_normal.png"
            )
        );
        imagemDecriptografia.setIcon(
            I_O.mudarIcone(
                imagemDecriptografia.getWidth(),
                imagemDecriptografia.getHeight(),
                "mudo.png"
            )
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paineis = new javax.swing.JTabbedPane();
        PainelChaves = new javax.swing.JPanel();
        botaoGerarChaves = new javax.swing.JButton();
        botaoChavePublica = new javax.swing.JButton();
        campoChavePublica = new javax.swing.JTextField();
        botaoChavePrivada = new javax.swing.JButton();
        campoChavePrivada = new javax.swing.JTextField();
        PainelEncriptografia = new javax.swing.JPanel();
        botaoGravar = new javax.swing.JButton();
        botaoParar = new javax.swing.JButton();
        botaoReproduzir1 = new javax.swing.JButton();
        imagemEncriptografia = new javax.swing.JLabel();
        alertaEncriptografia = new javax.swing.JLabel();
        botaoEncriptografar = new javax.swing.JButton();
        PainelDecriptografia = new javax.swing.JPanel();
        imagemDecriptografia = new javax.swing.JLabel();
        alertaDecriptografia = new javax.swing.JLabel();
        botaoDecriptografar = new javax.swing.JButton();
        botaoReproduzir2 = new javax.swing.JButton();
        botaoArquivo = new javax.swing.JButton();
        campoArquivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensagem Secreta");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(320, 320));
        setMinimumSize(new java.awt.Dimension(320, 320));
        setResizable(false);

        Paineis.setMaximumSize(new java.awt.Dimension(320, 320));
        Paineis.setMinimumSize(new java.awt.Dimension(320, 320));
        Paineis.setPreferredSize(new java.awt.Dimension(320, 320));

        PainelChaves.setMaximumSize(new java.awt.Dimension(320, 350));
        PainelChaves.setMinimumSize(new java.awt.Dimension(320, 350));
        PainelChaves.setPreferredSize(new java.awt.Dimension(320, 320));

        botaoGerarChaves.setText("Gerar chaves aleatórias");
        botaoGerarChaves.setPreferredSize(new java.awt.Dimension(310, 30));
        botaoGerarChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarChavesActionPerformed(evt);
            }
        });

        botaoChavePublica.setText("Selecionar chave pública");
        botaoChavePublica.setAlignmentY(0.0F);
        botaoChavePublica.setPreferredSize(new java.awt.Dimension(310, 30));
        botaoChavePublica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChavePublicaActionPerformed(evt);
            }
        });

        campoChavePublica.setEditable(false);

        botaoChavePrivada.setText("Selecionar chave privada");
        botaoChavePrivada.setAlignmentY(0.0F);
        botaoChavePrivada.setPreferredSize(new java.awt.Dimension(310, 30));
        botaoChavePrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChavePrivadaActionPerformed(evt);
            }
        });

        campoChavePrivada.setEditable(false);

        javax.swing.GroupLayout PainelChavesLayout = new javax.swing.GroupLayout(PainelChaves);
        PainelChaves.setLayout(PainelChavesLayout);
        PainelChavesLayout.setHorizontalGroup(
            PainelChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelChavesLayout.createSequentialGroup()
                .addGroup(PainelChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoChavePublica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoChavePrivada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoChavePrivada, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoChavePublica, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoGerarChaves, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelChavesLayout.setVerticalGroup(
            PainelChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelChavesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(botaoChavePublica, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoChavePublica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoChavePrivada, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoChavePrivada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(botaoGerarChaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Paineis.addTab("Gerenciar Chaves", PainelChaves);

        PainelEncriptografia.setMaximumSize(new java.awt.Dimension(320, 350));
        PainelEncriptografia.setMinimumSize(new java.awt.Dimension(320, 350));
        PainelEncriptografia.setPreferredSize(new java.awt.Dimension(320, 320));

        botaoGravar.setText("Gravar");
        botaoGravar.setPreferredSize(new java.awt.Dimension(140, 30));
        botaoGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGravarActionPerformed(evt);
            }
        });

        botaoParar.setText("Parar");
        botaoParar.setEnabled(false);
        botaoParar.setPreferredSize(new java.awt.Dimension(140, 30));
        botaoParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPararActionPerformed(evt);
            }
        });

        botaoReproduzir1.setText("Reproduzir");
        botaoReproduzir1.setEnabled(false);
        botaoReproduzir1.setPreferredSize(new java.awt.Dimension(140, 30));
        botaoReproduzir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReproduzir1ActionPerformed(evt);
            }
        });

        imagemEncriptografia.setBackground(new java.awt.Color(204, 204, 204));
        imagemEncriptografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemEncriptografia.setToolTipText("");
        imagemEncriptografia.setPreferredSize(new java.awt.Dimension(140, 140));

        alertaEncriptografia.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        alertaEncriptografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoEncriptografar.setText("Encriptografar");
        botaoEncriptografar.setEnabled(false);
        botaoEncriptografar.setPreferredSize(new java.awt.Dimension(310, 30));
        botaoEncriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEncriptografarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelEncriptografiaLayout = new javax.swing.GroupLayout(PainelEncriptografia);
        PainelEncriptografia.setLayout(PainelEncriptografiaLayout);
        PainelEncriptografiaLayout.setHorizontalGroup(
            PainelEncriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEncriptografiaLayout.createSequentialGroup()
                .addGroup(PainelEncriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEncriptografiaLayout.createSequentialGroup()
                        .addGroup(PainelEncriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botaoParar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoReproduzir1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoGravar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(imagemEncriptografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(alertaEncriptografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEncriptografiaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoEncriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PainelEncriptografiaLayout.setVerticalGroup(
            PainelEncriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEncriptografiaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelEncriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelEncriptografiaLayout.createSequentialGroup()
                        .addComponent(botaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoParar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoReproduzir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagemEncriptografia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alertaEncriptografia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botaoEncriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Paineis.addTab("Encriptografar Mensagem", PainelEncriptografia);

        PainelDecriptografia.setMaximumSize(new java.awt.Dimension(320, 350));
        PainelDecriptografia.setMinimumSize(new java.awt.Dimension(320, 350));
        PainelDecriptografia.setPreferredSize(new java.awt.Dimension(320, 320));

        imagemDecriptografia.setBackground(new java.awt.Color(204, 204, 204));
        imagemDecriptografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemDecriptografia.setToolTipText("");
        imagemDecriptografia.setPreferredSize(new java.awt.Dimension(140, 140));

        alertaDecriptografia.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        alertaDecriptografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoDecriptografar.setText("Decriptografar");
        botaoDecriptografar.setEnabled(false);
        botaoDecriptografar.setPreferredSize(new java.awt.Dimension(310, 30));
        botaoDecriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDecriptografarActionPerformed(evt);
            }
        });

        botaoReproduzir2.setText("Reproduzir");
        botaoReproduzir2.setEnabled(false);
        botaoReproduzir2.setPreferredSize(new java.awt.Dimension(140, 30));
        botaoReproduzir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReproduzir2ActionPerformed(evt);
            }
        });

        botaoArquivo.setText("Escolher arquivo");
        botaoArquivo.setAlignmentY(0.0F);
        botaoArquivo.setPreferredSize(new java.awt.Dimension(310, 30));
        botaoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoArquivoActionPerformed(evt);
            }
        });

        campoArquivo.setEditable(false);

        javax.swing.GroupLayout PainelDecriptografiaLayout = new javax.swing.GroupLayout(PainelDecriptografia);
        PainelDecriptografia.setLayout(PainelDecriptografiaLayout);
        PainelDecriptografiaLayout.setHorizontalGroup(
            PainelDecriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDecriptografiaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(PainelDecriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaDecriptografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelDecriptografiaLayout.createSequentialGroup()
                        .addGroup(PainelDecriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoDecriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoReproduzir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(imagemDecriptografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(campoArquivo))
                .addGap(3, 3, 3))
        );
        PainelDecriptografiaLayout.setVerticalGroup(
            PainelDecriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDecriptografiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDecriptografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelDecriptografiaLayout.createSequentialGroup()
                        .addComponent(botaoReproduzir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoDecriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagemDecriptografia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(alertaDecriptografia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        Paineis.addTab("Decriptografar Mensagem", PainelDecriptografia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paineis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paineis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGravarActionPerformed
        botaoGravar.setEnabled(false);
        botaoParar.setEnabled(true);
        botaoReproduzir1.setEnabled(false);
        
        imagemEncriptografia.setIcon(
            I_O.mudarIcone(
                imagemEncriptografia.getWidth(),
                imagemEncriptografia.getHeight(),
                "microfone_gravando.png"
            )
        );
        
        alertaEncriptografia.setText("Gravando...");
        
        audioEncriptografado = new Audio();
        audioEncriptografado.captureAudio();
    }//GEN-LAST:event_botaoGravarActionPerformed

    private void botaoPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPararActionPerformed
        botaoParar.setEnabled(false);
        botaoGravar.setEnabled(true);
        botaoReproduzir1.setEnabled(true);
        
        imagemEncriptografia.setIcon(
            I_O.mudarIcone(
                imagemEncriptografia.getWidth(),
                imagemEncriptografia.getHeight(),
                "microfone_normal.png"
            )
        );
        
        alertaEncriptografia.setText("Gravação concluída.");
        
        audioEncriptografado.stopCapture = true;
    }//GEN-LAST:event_botaoPararActionPerformed

    private void botaoReproduzir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReproduzir1ActionPerformed
        imagemEncriptografia.setIcon(
            I_O.mudarIcone(
                imagemEncriptografia.getWidth(),
                imagemEncriptografia.getHeight(),
                "som.png"
            )
        );
        
        audioEncriptografado.playAudio();        
    }//GEN-LAST:event_botaoReproduzir1ActionPerformed

    private void botaoChavePrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChavePrivadaActionPerformed
        if(menu.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            arquivo = menu.getSelectedFile();
            criptografia.setCaminhoChavePrivada(""+arquivo);
            campoChavePrivada.setText(criptografia.getCaminhoChavePrivada());
            botaoDecriptografar.setEnabled(true);
        }
    }//GEN-LAST:event_botaoChavePrivadaActionPerformed

    private void botaoChavePublicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChavePublicaActionPerformed
        if(menu.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            arquivo = menu.getSelectedFile();
            criptografia.setCaminhoChavePublica(""+arquivo);
            campoChavePublica.setText(criptografia.getCaminhoChavePublica());
            botaoEncriptografar.setEnabled(true);
        }
    }//GEN-LAST:event_botaoChavePublicaActionPerformed

    private void botaoGerarChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarChavesActionPerformed
        criptografia.criarChaves();
    }//GEN-LAST:event_botaoGerarChavesActionPerformed

    private void botaoEncriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEncriptografarActionPerformed
        alertaEncriptografia.setText("Aguarde um momento...");
        
        imagemEncriptografia.setIcon(
            I_O.mudarIcone(
                imagemEncriptografia.getWidth(),
                imagemEncriptografia.getHeight(),
                "loading.gif"
            )
        );
        
        String conteudo = Arrays.toString(audioEncriptografado.getAudio());
        String[] resultado = criptografia.encriptografar(conteudo);
        I_O.gravarArquivo(resultado);
        
        alertaEncriptografia.setText("Áudio encriptografado!");
    }//GEN-LAST:event_botaoEncriptografarActionPerformed

    private void botaoDecriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDecriptografarActionPerformed
        imagemDecriptografia.setIcon(
            I_O.mudarIcone(
                imagemDecriptografia.getWidth(),
                imagemDecriptografia.getHeight(),
                "loading.gif"
            )
        );
        
        audioDecriptografado = new Audio();
        
        String[] texto = I_O.lerArquivo();
        String bytes = criptografia.decriptografar(texto);
        audioDecriptografado.criarAudio(bytes);        
        
        botaoReproduzir2.setEnabled(true);
        alertaDecriptografia.setText("Áudio decriptografado!");
    }//GEN-LAST:event_botaoDecriptografarActionPerformed

    private void botaoReproduzir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReproduzir2ActionPerformed
        imagemDecriptografia.setIcon(
            I_O.mudarIcone(
                imagemDecriptografia.getWidth(),
                imagemDecriptografia.getHeight(),
                "som.png"
            )
        );
        
        audioDecriptografado.reproduzirAudioDecodificado();
    }//GEN-LAST:event_botaoReproduzir2ActionPerformed

    private void botaoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoArquivoActionPerformed
        if(menu.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            arquivo = menu.getSelectedFile();
            I_O.setNome_arquivo(""+arquivo);
            campoArquivo.setText(I_O.getNome_arquivo());
        }
    }//GEN-LAST:event_botaoArquivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Paineis;
    private javax.swing.JPanel PainelChaves;
    private javax.swing.JPanel PainelDecriptografia;
    private javax.swing.JPanel PainelEncriptografia;
    private javax.swing.JLabel alertaDecriptografia;
    private javax.swing.JLabel alertaEncriptografia;
    private javax.swing.JButton botaoArquivo;
    private javax.swing.JButton botaoChavePrivada;
    private javax.swing.JButton botaoChavePublica;
    private javax.swing.JButton botaoDecriptografar;
    private javax.swing.JButton botaoEncriptografar;
    private javax.swing.JButton botaoGerarChaves;
    private javax.swing.JButton botaoGravar;
    private javax.swing.JButton botaoParar;
    private javax.swing.JButton botaoReproduzir1;
    private javax.swing.JButton botaoReproduzir2;
    private javax.swing.JTextField campoArquivo;
    private javax.swing.JTextField campoChavePrivada;
    private javax.swing.JTextField campoChavePublica;
    private javax.swing.JLabel imagemDecriptografia;
    public javax.swing.JLabel imagemEncriptografia;
    // End of variables declaration//GEN-END:variables
}