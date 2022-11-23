
package easycareprojeto;

public class TelaLogin extends javax.swing.JFrame {
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    TelaHome home = new TelaHome();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeLogin = new javax.swing.JTextField();
        SenhaLogin = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        visualizaSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoLogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(82, 221, 104));
        jPanel1.setForeground(new java.awt.Color(82, 221, 104));
        jPanel1.setLayout(null);

        NomeLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomeLogin.setBorder(null);
        NomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeLoginActionPerformed(evt);
            }
        });
        jPanel1.add(NomeLogin);
        NomeLogin.setBounds(60, 440, 310, 22);

        SenhaLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SenhaLogin.setBorder(null);
        SenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaLoginActionPerformed(evt);
            }
        });
        jPanel1.add(SenhaLogin);
        SenhaLogin.setBounds(60, 540, 290, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        visualizaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/closed-eyes 1.png"))); // NOI18N
        visualizaSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizaSenhaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                visualizaSenhaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                visualizaSenhaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visualizaSenha)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(visualizaSenha)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, 540, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 120, 490, 472);

        botaoLogar.setBackground(new java.awt.Color(82, 221, 104));
        botaoLogar.setForeground(new java.awt.Color(82, 221, 104));
        botaoLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaoEntrar.png"))); // NOI18N
        botaoLogar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoLogar.setBorderPainted(false);
        botaoLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoLogar);
        botaoLogar.setBounds(110, 610, 235, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeLoginActionPerformed
      
    }//GEN-LAST:event_NomeLoginActionPerformed

    private void SenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaLoginActionPerformed

    private void visualizaSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizaSenhaMousePressed
       
    }//GEN-LAST:event_visualizaSenhaMousePressed

    private void visualizaSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizaSenhaMouseClicked
       SenhaLogin.setEchoChar((char)0);
    }//GEN-LAST:event_visualizaSenhaMouseClicked

    private void visualizaSenhaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizaSenhaMouseReleased
        SenhaLogin.setEchoChar('*');
    }//GEN-LAST:event_visualizaSenhaMouseReleased

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
        home.setVisible(true);
        home.lblNomeHome.setText(NomeLogin.getText());
        this.dispose();
    }//GEN-LAST:event_botaoLogarActionPerformed

 
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField NomeLogin;
    private javax.swing.JPasswordField SenhaLogin;
    public javax.swing.JButton botaoLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel visualizaSenha;
    // End of variables declaration//GEN-END:variables
}
