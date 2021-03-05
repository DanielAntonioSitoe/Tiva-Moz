/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.CardLayout;

/**
 *
 * @author danny
 */
public class Ajuda extends javax.swing.JFrame {
java.awt.event.MouseEvent evt;
    /**
     * Creates new form ajuda
     */
    public Ajuda() {
        initComponents();
        jLblNovoJogoMousePressed( evt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLblNovoJogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLblJogarADois = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLblContraTempo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLblSobreOJogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLblNovoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/graduation-hat-and-diploma.png"))); // NOI18N
        jLblNovoJogo.setText("Novo Jogo");
        jLblNovoJogo.setToolTipText("Clientes");
        jLblNovoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblNovoJogoMousePressed(evt);
            }
        });
        jPanel3.add(jLblNovoJogo, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLblJogarADois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/friends.png"))); // NOI18N
        jLblJogarADois.setText("Jogar a Dois");
        jLblJogarADois.setToolTipText("Pagamentos");
        jLblJogarADois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblJogarADoisMousePressed(evt);
            }
        });
        jPanel4.add(jLblJogarADois, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLblContraTempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/time.png"))); // NOI18N
        jLblContraTempo.setText("Contra Tempo");
        jLblContraTempo.setToolTipText("Relatorios");
        jLblContraTempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblContraTempoMousePressed(evt);
            }
        });
        jPanel5.add(jLblContraTempo, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLblSobreOJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings-work-tool.png"))); // NOI18N
        jLblSobreOJogo.setText("Sobre o Jogo");
        jLblSobreOJogo.setToolTipText("Relatorios");
        jLblSobreOJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblSobreOJogoMousePressed(evt);
            }
        });
        jPanel6.add(jLblSobreOJogo, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel9.setLayout(new java.awt.CardLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel10.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10, "card2");

        jPanel11.setLayout(new java.awt.BorderLayout());

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel11.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, "card3");

        jPanel12.setLayout(new java.awt.BorderLayout());

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel12.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel12, "card4");

        jPanel13.setLayout(new java.awt.BorderLayout());

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        jPanel13.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel13, "card5");

        jPanel14.setLayout(new java.awt.BorderLayout());

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        jPanel14.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel14, "card6");

        jScrollPane1.setViewportView(jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLblNovoJogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblNovoJogoMousePressed
        // TODO add your handling code here:
         CardLayout ver = (CardLayout)jPanel9.getLayout();
        ver.show(jPanel9, "card2");
        jTextArea1.setText("           \n"
                            + "                   Ajudas -  Novo Jogo!\n"
                            + "\n"                
                            + "              Dica 1 - Escolha uma categoria que voce gosta!\n"
                + "\n"
                
                            + "              Dica 2 - concentra-te na questao e clique na alinea Certa!\n"
                + "\n"
                            + "              Dica 3 - Para cada nivel voce devera acertar 10 questoes!\n"
                + "\n"                
                            + "              Dica 4 - Ao errar uma questao sera diminuido um acerto!\n"
                + "\n"
                            + "              Dica 5 - Utilize o butao 'Proxima Pergunrta' para pular a questao!\n "
                + "\n"
                            + "              Dica 6 - So podera pular no maximo 2 questoes por cada nivel\n!"
                
                                     
                           );
    }//GEN-LAST:event_jLblNovoJogoMousePressed

    private void jLblJogarADoisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblJogarADoisMousePressed
        // TODO add your handling code here:
        CardLayout ver = (CardLayout)jPanel9.getLayout();
        ver.show(jPanel9, "card3");
        jTextArea2.setText("           \n"
                            + "                   Ajudas -  Jogar a Dois!\n"
                            + "\n"                
                            + "          Dica 1 - Escolham uma categoria que voces gostam !\n"
                + "\n"
                
                            + "          Dica 2 - concentrem-se na questao 'cada um na sua' e cliquem na alinea Certa!\n"
                + "\n"
                            + "          Dica 3 - Para cada acerto ganha um ponto cujo o mesmo ser diminuido do adversario!\n"
                + "\n"                
                            + "          Dica 4 - Ao errar uma questao sera diminuido um acerto e aumentado no adiversario!\n"
                + "\n"
                            + "          Dica 5 - Utilize o butao 'Proxima Pergunrta' para pular a questao!\n "
                + "\n"
                            + "          Dica 6 - Quem tiver 100% de acertos ganha o jogo!\n"
                            );
    
    }//GEN-LAST:event_jLblJogarADoisMousePressed

    private void jLblContraTempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblContraTempoMousePressed
        // TODO add your handling code here:
        CardLayout ver = (CardLayout)jPanel9.getLayout();
        ver.show(jPanel9, "card4");
        jTextArea3.setText("           \n"
                            + "                   Ajudas -  Jogar contra te !\n"
                            + "\n"                
                            + "              Dica 1 - Escolha uma categoria que voce gosta!\n"
                + "\n"
                
                            + "              Dica 2 - concentra-te na questao e clique na alinea Certa!\n"
                + "\n"
                            + "              Dica 3 - O tempo inicial sera de 4 minutos !\n"
                + "\n"                
                            + "              Dica 4 - Ao errar uma questao sera diminuido um minuto!\n"
                + "\n"
                            + "              Dica 5 - Ao acertar a Questao aumenta um minuto!\n "
                + "\n"
                            + "              Dica 6 - So podera pular no maximo 4 questoes por nivel\n!"
                + "\n"
                            + "              Dica 7 - se Conseguir chegar a 10 minutos Ganha o Jogo\n"
                
        );
    }//GEN-LAST:event_jLblContraTempoMousePressed

    private void jLblSobreOJogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblSobreOJogoMousePressed
         CardLayout ver = (CardLayout)jPanel9.getLayout();
        ver.show(jPanel9, "card5");
        jTextArea4.setText("      \n"
                + "                             Sobre o Jogo"
                + "\n"
                + "                              TIVA-MOZ \n"
                + "              Um jogo educativo  Desenvolvido por: Daniel Sitoe\n"
                + "              com a finalidade de passar pequenos conhecimentos \n"
                + "              sobre Mozambique e sobre a cultura em Geral. \n"
                + "              Para mais Informacoes visite a \n"
                + "              Pagina Oficial do Programador: SitoeDaniel.hit.ng \n"
                + "              Contacto : 847464965 \n"
                + "              Email: SitoeDaniel20@gmail.com \n"
                + "              \n"
                + "                                GOSTOU DO TIVA-MOZ?\n"
                + "              Visite a Minha pagina e deixe seu comentario\n"
                + "              ou mande seu comentario directamente para o meu email\n "
                + "              com assunto 'TIVA-MOZ' \n"
                + "              \n");
    }//GEN-LAST:event_jLblSobreOJogoMousePressed

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
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new telaAjuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblContraTempo;
    private javax.swing.JLabel jLblJogarADois;
    private javax.swing.JLabel jLblNovoJogo;
    private javax.swing.JLabel jLblSobreOJogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
