package br.com.admsystem.frames;

import br.com.admsystem.persistencia.UsuarioDAO;
import entities.SessaoUsuario;
import entities.Usuario;
import javax.swing.JOptionPane;

public class telaInicial extends javax.swing.JFrame {

    

    public telaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        textEmail = new javax.swing.JLabel();
        textEmail1 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        txSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        textMessage2 = new javax.swing.JLabel();
        textMessage = new javax.swing.JLabel();
        textAutorais = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 750));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        text1.setBackground(new java.awt.Color(255, 255, 255));
        text1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("FAÇA SEU LOGIN");

        textEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textEmail.setForeground(new java.awt.Color(255, 255, 255));
        textEmail.setText("Digite sua senha:");

        textEmail1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textEmail1.setForeground(new java.awt.Color(255, 255, 255));
        textEmail1.setText("Digite seu email:");

        txEmail.setBackground(new java.awt.Color(255, 255, 255));
        txEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txEmail.setForeground(new java.awt.Color(0, 0, 0));
        txEmail.setAlignmentX(0.0F);
        txEmail.setAlignmentY(0.0F);
        txEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txSenha.setBackground(new java.awt.Color(255, 255, 255));
        txSenha.setForeground(new java.awt.Color(0, 0, 0));
        txSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txSenha.setMinimumSize(new java.awt.Dimension(64, 17));

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 153));
        btnEntrar.setText("Acessar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEmail1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text1)
                                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textEmail))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(text1)
                .addGap(75, 75, 75)
                .addComponent(textEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(textEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textMessage2.setBackground(new java.awt.Color(0, 0, 0));
        textMessage2.setFont(new java.awt.Font("Cambria", 0, 28)); // NOI18N
        textMessage2.setForeground(new java.awt.Color(0, 0, 0));
        textMessage2.setText("BEM-VINDO DE VOLTA! ");

        textMessage.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        textMessage.setForeground(new java.awt.Color(0, 0, 0));
        textMessage.setText("Gerencie suas finanças com eficiência.");

        textAutorais.setBackground(new java.awt.Color(0, 0, 0));
        textAutorais.setForeground(new java.awt.Color(0, 0, 0));
        textAutorais.setText("© 2024 Financial ADM System. Todos os direitos reservados. www.financialadmsystem.com.br");

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 153));
        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar usuário");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(textAutorais)
                        .addGap(37, 37, 37))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(logo)
                                .addGap(18, 18, 18)
                                .addComponent(lbLogo))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMessage)
                                    .addComponent(textMessage2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addComponent(textMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMessage)
                .addGap(130, 130, 130)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(textAutorais)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String email = txEmail.getText();
        String senha = txSenha.getText();

        // Valida os campos antes de tentar autenticar
        if (!validarCampos()) {
            return;
        }

        try {
            AutenticacaoUser(email, senha);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        telaCadastroUsuario tCUser = new telaCadastroUsuario();
        tCUser.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel textAutorais;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textEmail1;
    private javax.swing.JLabel textMessage;
    private javax.swing.JLabel textMessage2;
    private javax.swing.JTextField txEmail;
    private javax.swing.JPasswordField txSenha;
    // End of variables declaration//GEN-END:variables
    
    public void AutenticacaoUser(String email, String senha) {
        // Obtém a lista completa de usuários cadastrados
        UsuarioDAO usuarioDAO = new UsuarioDAO();
  
        try {
            Usuario userAutenticado = usuarioDAO.autenticar(email, senha);

            if (userAutenticado != null) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso! Bem-vindo(a) " + userAutenticado.getNomeUsuario());
                
                SessaoUsuario.setIdUsuarioLogado(userAutenticado);
                SessaoUsuario.setNomeUsuario(userAutenticado.getNomeUsuario());
                SessaoUsuario.setCargo(userAutenticado.getCargo());
                
                telaSistema ts = new telaSistema();
                ts.setVisible(true);
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                LimparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public boolean validarCampos() {
        // Verifica se os campos de email e senha estão vazios
        if (txEmail.getText().isEmpty() || txSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite Email e Senha para acessar o sistema!");
            return false;
        }
        return true;
    }

    public void LimparCampos() {
        // Limpa os campos de email e senha
        txEmail.setText("");
        txSenha.setText("");
    }
}
