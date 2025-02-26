package br.com.admsystem.frames;

import entities.ListaUsuario;
import entities.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class telaUsuario extends javax.swing.JFrame {

    public telaUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lbDescricao = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnPesquisar1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        lbCargo = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        txId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        tableUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tableUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome_usuario", "email", "cargo", "senha"
            }
        ));
        jScrollPane1.setViewportView(tableUsuarios);

        lbTitle.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 0, 153));
        lbTitle.setText("LISTA DE USUÁRIOS");

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lbDescricao.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(0, 0, 0));
        lbDescricao.setText("Pesquise o ID:");

        btnAtualizar.setBackground(new java.awt.Color(0, 0, 153));
        btnAtualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnPesquisar1.setBackground(new java.awt.Color(51, 204, 0));
        btnPesquisar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar1.setText("Pesquisar");
        btnPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar1ActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(153, 153, 153));
        btnExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Nome de Usuário:");

        txNome.setBackground(new java.awt.Color(255, 255, 255));
        txNome.setForeground(new java.awt.Color(0, 0, 0));
        txNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("Email:");

        txEmail.setBackground(new java.awt.Color(255, 255, 255));
        txEmail.setForeground(new java.awt.Color(0, 0, 0));
        txEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });

        lbCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Cargo:");

        cbCargo.setBackground(new java.awt.Color(255, 255, 255));
        cbCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCargo.setForeground(new java.awt.Color(0, 0, 0));
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Analista Financeiro", "Gerente Financeiro", "Diretor Financeiro (CFO)", "Assistente Administrativo", "Operador de Caixa", "Gerente de Vendas", "CEO / Diretor Executivo", " ", "Suporte Técnico (Equipe de Suporte)" }));
        cbCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });

        txId.setBackground(new java.awt.Color(255, 255, 255));
        txId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txId.setForeground(new java.awt.Color(0, 0, 0));
        txId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTitle)
                        .addGap(164, 164, 164)
                        .addComponent(btnVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txNome)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPesquisar1)
                                .addGap(29, 29, 29)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbTitle)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(btnPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNome)
                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmail)
                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCargo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar1ActionPerformed
        limparCampos();

        //Faz a validação do ID e retorna se o ID é válido ou não
        if (!validaID()) {
            return;
        }

        try {
            int id = Integer.parseInt(txId.getText().trim());
            //Chama o método getDados usando o id solicitado como parâmetro
            getDados(id);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro, insira somente números no campo id " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisar1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirRegistro();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed

    }//GEN-LAST:event_txEmailActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed

    }//GEN-LAST:event_cbCargoActionPerformed

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
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    // End of variables declaration//GEN-END:variables
    
      public void listarTabela() {
      // Obtém o modelo da tabela e limpa todas as linhas existentes
        DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();
        model.setRowCount(0);
        
        //Obtem os dados cadastrados com base no método listar()
        for (Usuario u : ListaUsuario.listar()) {
            model.addRow(new Object[]{u.getId(), u.getNomeUsuario(), u.getEmail(), u.getCargo(), u.getSenha()});
        }
    }

    public Usuario getId(Integer id) { 
        // Obtém a lista de usuários
        List<Usuario> usuario = ListaUsuario.listar();

        System.out.println("Lista de usuários: " + usuario);

        try {
            // Verifica se a lista de usuários não é nula e não está vazia
            if (usuario != null && !usuario.isEmpty()) {
                // Percorre a lista para encontrar o usuário com o ID correspondente
                for (Usuario user : usuario) {
                    // Usa equals para comparação de objetos
                    if (user.getId() == id) {
                        return user;
                    }
                }
            }
        } catch (NullPointerException e) {
            
            JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void atualizar() {
        //Faz a validação do ID e retorna se o ID é válido ou não
        if (!validaID()) {
            return;
        }

        Integer id = Integer.valueOf(txId.getText().trim());
        Usuario usuario = getId(id);
        
         // Verifica se o usuário foi encontrado
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuário(a) não encontrado(a)!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Atualiza os dados do usuário com os valores dos campos de texto      
            usuario.setEmail(txEmail.getText());
            usuario.setNomeUsuario(txNome.getText());
            usuario.setCargo(cbCargo.getSelectedItem().toString());

            JOptionPane.showMessageDialog(null, "Dados do usuário atualizados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Atualiza a lista de usuários e limpa os campos
            ListaUsuario.listar();
            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limparCampos() {
        // Limpa os campos de texto e redefine o combobox para o valor padrão
        txNome.setText("");
        txEmail.setText("");
        cbCargo.setSelectedItem("Selecione:");
    }

    public void getDados(Integer id) {
        // Obtém o usuário pelo ID
        Usuario usuario = getId(id);

        if (usuario != null) {
            try {
                // Preenche os campos de texto com os dados do usuário
                txNome.setText(usuario.getNomeUsuario());
                txEmail.setText(usuario.getEmail());
                cbCargo.setSelectedItem(usuario.getCargo());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher os campos!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Exibe uma mensagem de erro se o usuário não for encontrado
            JOptionPane.showMessageDialog(null, "Nenhum usuário com ID fornecido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean validaID() {
        // Obtém o texto do campo ID e remove espaços em branco
        String idText = txId.getText().trim();

        // Verifica se o campo está vazio
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo ID não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Verifica se o campo contém apenas números
        if (!idText.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "O campo ID deve conter apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;
        }
        // Retorna true se o ID for válido
        return true;
    }

    public void excluirRegistro() {
        // Obtém a linha selecionada na tabela
        int linhaSelecionada = tableUsuarios.getSelectedRow();

        if (linhaSelecionada != -1) {// Verifica se uma linha foi selecionada
            
            // Solicita confirmação do usuário para excluir o registro
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta transação?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                // Obtém o ID do usuário da linha selecionada
                int idUser = (int) tableUsuarios.getValueAt(linhaSelecionada, 0);
                
                // Remove o usuário da lista
                List<Usuario> usuario = ListaUsuario.listar();
                usuario.removeIf(transacao -> transacao.getId() == idUser);
                
                // Remove a linha da tabela
                DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();
                model.removeRow(linhaSelecionada);
                
                // Notifica a tabela que os dados foram alterados
                model.fireTableDataChanged();

                JOptionPane.showMessageDialog(null, "Transação removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
