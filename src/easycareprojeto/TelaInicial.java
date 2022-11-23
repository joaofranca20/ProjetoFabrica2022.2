/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package easycareprojeto;

/**
 *
 * @author João
 */
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    TelaLogin login1 = new TelaLogin();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        botaoLogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(82, 221, 104));
        jPanel2.setForeground(new java.awt.Color(82, 221, 104));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoCadastrar.setBackground(new java.awt.Color(82, 221, 104));
        botaoCadastrar.setForeground(new java.awt.Color(82, 221, 104));
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preciso me cadastrar.png"))); // NOI18N
        botaoCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCadastrar.setBorderPainted(false);
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 240, 90));

        botaoLogar.setBackground(new java.awt.Color(82, 221, 104));
        botaoLogar.setForeground(new java.awt.Color(82, 221, 104));
        botaoLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tenho uma conta!.png"))); // NOI18N
        botaoLogar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoLogar.setBorderPainted(false);
        botaoLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 240, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inicial2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/© 2022 2João.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        this.dispose();
        TelaCadastroUsuario cadU = new TelaCadastroUsuario();
        cadU.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
        login1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoLogarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoCadastrar;
    public javax.swing.JButton botaoLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
