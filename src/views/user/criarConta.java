
package views.user;

import java.awt.Color;
import java.awt.Cursor;


public class criarConta extends javax.swing.JFrame {

   
    public criarConta() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        crNome = new javax.swing.JLabel();
        crEmail = new javax.swing.JLabel();
        crSenha = new javax.swing.JLabel();
        fraseMotivacional = new javax.swing.JLabel();
        crCriarConta = new javax.swing.JLabel();
        btnCriarConta = new javax.swing.JLabel();
        cmpSenha = new javax.swing.JPasswordField();
        cmpNome = new javax.swing.JTextField();
        cmpEmail = new javax.swing.JTextField();
        btfkVoltar = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        planoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Painel.setOpaque(false);
        Painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        crNome.setForeground(new java.awt.Color(240, 240, 240));
        crNome.setText("NOME");
        Painel.add(crNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        crEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        crEmail.setForeground(new java.awt.Color(240, 240, 240));
        crEmail.setText("E-MAIL");
        Painel.add(crEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        crSenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        crSenha.setForeground(new java.awt.Color(240, 240, 240));
        crSenha.setText("SENHA");
        Painel.add(crSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        fraseMotivacional.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        fraseMotivacional.setForeground(new java.awt.Color(240, 240, 240));
        fraseMotivacional.setText("<html> MyWorld<br> <font size=\"5\">Entre. Sinta-se em casa.</font> </html>");
        Painel.add(fraseMotivacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        crCriarConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        crCriarConta.setForeground(new java.awt.Color(240, 240, 240));
        crCriarConta.setText("Criar Conta");
        Painel.add(crCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        btnCriarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/btn_login.png"))); // NOI18N
        btnCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriarContaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCriarContaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCriarContaMouseExited(evt);
            }
        });
        Painel.add(btnCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 120, 80));

        cmpSenha.setBackground(new Color(0,0,0,0));
        cmpSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmpSenha.setForeground(new java.awt.Color(102, 102, 102));
        cmpSenha.setText("jPasswordField1");
        cmpSenha.setBorder(null);
        cmpSenha.setOpaque(false);
        Painel.add(cmpSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 220, -1));

        cmpNome.setBackground(new Color(0,0,0,0));
        cmpNome.setForeground(new java.awt.Color(102, 102, 102));
        cmpNome.setText("Nome Completo");
        cmpNome.setBorder(null);
        cmpNome.setOpaque(false);
        Painel.add(cmpNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 230, -1));

        cmpEmail.setBackground(new Color(0,0,0,0));
        cmpEmail.setForeground(new java.awt.Color(102, 102, 102));
        cmpEmail.setText("Digite Seu E-MAIL");
        cmpEmail.setBorder(null);
        cmpEmail.setOpaque(false);
        cmpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpEmailActionPerformed(evt);
            }
        });
        Painel.add(cmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, -1));

        btfkVoltar.setForeground(new Color(0,0,0,0));
        btfkVoltar.setText("jL8");
        btfkVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btfkVoltarMouseClicked(evt);
            }
        });
        Painel.add(btfkVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(240, 240, 240));
        btnLogin.setText("Fazer login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        Painel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        planoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/logup_screen.png"))); // NOI18N
        Painel.add(planoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarContaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarContaMouseEntered
        // TODO add your handling code here:
        btnCriarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/btn_login_hover.png")));
        btnCriarConta.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCriarContaMouseEntered

    private void btnCriarContaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarContaMouseExited
        // TODO add your handling code here:
         btnCriarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/btn_login.png")));
    }//GEN-LAST:event_btnCriarContaMouseExited

    private void cmpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpEmailActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btfkVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btfkVoltarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_btfkVoltarMouseClicked

    private void btnCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarContaMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_btnCriarContaMouseClicked

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
            java.util.logging.Logger.getLogger(criarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(criarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(criarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(criarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new criarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel btfkVoltar;
    private javax.swing.JLabel btnCriarConta;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JTextField cmpEmail;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JPasswordField cmpSenha;
    private javax.swing.JLabel crCriarConta;
    private javax.swing.JLabel crEmail;
    private javax.swing.JLabel crNome;
    private javax.swing.JLabel crSenha;
    private javax.swing.JLabel fraseMotivacional;
    private javax.swing.JLabel planoDeFundo;
    // End of variables declaration//GEN-END:variables
}
