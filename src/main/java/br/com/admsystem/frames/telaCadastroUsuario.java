package br.com.admsystem.frames;

import entities.ListaUsuario;
import entities.Usuario;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;

public class telaCadastroUsuario extends javax.swing.JFrame {

    public telaCadastroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        txSenha = new javax.swing.JTextField();
        lbCargo = new javax.swing.JLabel();
        comboCargo = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO DE USUÁRIO");

        lbNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Nome de usuário:");

        txNome.setBackground(new java.awt.Color(255, 255, 255));
        txNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txNome.setForeground(new java.awt.Color(0, 0, 0));
        txNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("Email:");

        txEmail.setBackground(new java.awt.Color(255, 255, 255));
        txEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txEmail.setForeground(new java.awt.Color(0, 0, 0));
        txEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(0, 0, 0));
        lbSenha.setText("Senha:");

        txSenha.setBackground(new java.awt.Color(255, 255, 255));
        txSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txSenha.setForeground(new java.awt.Color(0, 0, 0));
        txSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Cargo:");

        comboCargo.setBackground(new java.awt.Color(255, 255, 255));
        comboCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboCargo.setForeground(new java.awt.Color(0, 0, 0));
        comboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analista Financeiro", "Gerente Financeiro", "Diretor Financeiro (CFO)", "Assistente Administrativo", "Operador de Caixa", "Gerente de Vendas", "CEO / Diretor Executivo", " ", "Suporte Técnico (Equipe de Suporte)" }));
        comboCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargoActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 153));
        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCargo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbNome)
                                .addComponent(txNome)
                                .addComponent(lbEmail)
                                .addComponent(txEmail)
                                .addComponent(lbSenha)
                                .addComponent(txSenha)
                                .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lbCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCargoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (cadastrarUser()) {
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txSenha;
    // End of variables declaration//GEN-END:variables
        public boolean cadastrarUser() {
        //Verificacao dos campos
        if (!validarCampos()) {
            return false;
        }

        //Definicao do formato da data
        LocalDate dataAtual = LocalDate.now();
        String email = txEmail.getText();

        //Criacao do Array chamando o metodo listar//
        List<Usuario> listaUsuarios = ListaUsuario.listar();

        //Validaçao de email existente//
        if (emailJaCadastrado(email, listaUsuarios)) {
            JOptionPane.showMessageDialog(null, "E-mail já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            txEmail.setText("");
            return false;
        }

        Usuario usuario = new Usuario();

        //Atribucao de valores dos campos para o objeto//
        try {
            usuario.setId(gerarNovoId());
            usuario.setNomeUsuario(txNome.getText());
            usuario.setEmail(txEmail.getText());
            usuario.setSenha(txSenha.getText());
            usuario.setCargo(comboCargo.getSelectedItem().toString());
            usuario.setDataCriacao(dataAtual);

            ListaUsuario.adicionar(usuario);

            JOptionPane.showMessageDialog(null, "Usuário " + usuario.getNomeUsuario() + " cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        //Limpa os campos
        txEmail.setText("");
        txNome.setText("");
        txSenha.setText("");

        return true;
    }

    public boolean validarCampos() {

        //Valida cada textField se esta preenchido ou nao
        if (txNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o Nome de usuário para continuar!");
            return false;
        } else if (txEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o Email para continuar\nExemplo: exemplo@gmail.com!");
            return false;
        } else if (txSenha.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Crie sua Senha");
            return false;
        }
        return true;
    }

    private int gerarNovoId() {
        List<Usuario> usuario = ListaUsuario.listar();

        if (usuario.isEmpty()) {
            return 1;
        }

        //Incrementação do ID 
        int maiorId = usuario.stream()
                .mapToInt(Usuario::getId)
                .max()
                .orElse(0);

        return maiorId + 1;
    }

    public boolean emailJaCadastrado(String email, List<Usuario> listaUsuarios) {

        //Verifica se o email ja foi cadastrado anteriormente
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(txEmail.getText())) {
                return true;
            }
        }
        return false;
    }
}
