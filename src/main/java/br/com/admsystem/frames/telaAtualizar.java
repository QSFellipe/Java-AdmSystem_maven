package br.com.admsystem.frames;

import br.com.admsystem.persistencia.CadastroTransacoesDAO;
import entities.CadastroTransacoes;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class telaAtualizar extends javax.swing.JFrame {

    public telaAtualizar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbForma = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        lbDataEntrada = new javax.swing.JLabel();
        lbDataSaida = new javax.swing.JLabel();
        txDataEntrada = new javax.swing.JFormattedTextField();
        txDataSaida = new javax.swing.JFormattedTextField();
        lbValorEntrada = new javax.swing.JLabel();
        lbValorSaida = new javax.swing.JLabel();
        txValorSaida = new javax.swing.JFormattedTextField();
        txValorEntrada = new javax.swing.JFormattedTextField();
        lbDescricao = new javax.swing.JLabel();
        txDescricao = new javax.swing.JTextField();
        lbCategoria1 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        lbDescricao1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lbTitle.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 0, 153));
        lbTitle.setText("ATUALIZAR LANÇAMENTO");

        lbForma.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbForma.setForeground(new java.awt.Color(0, 0, 0));
        lbForma.setText("Forma de pagamento");

        cbFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbFormaPagamento.setForeground(new java.awt.Color(0, 0, 0));
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Dinheiro", "PIX", "Transferência (TED/DOC)", "Boleto", "Cartão de crédito (à vista/parcelado)", "Financiamento", "Cheque", "Débito automático", "Vale-alimentação/refeição", "Permuta" }));
        cbFormaPagamento.setBorder(null);

        lbDataEntrada.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbDataEntrada.setForeground(new java.awt.Color(0, 0, 0));
        lbDataEntrada.setText("Data entrada:");

        lbDataSaida.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbDataSaida.setForeground(new java.awt.Color(0, 0, 0));
        lbDataSaida.setText("Data saída:");

        txDataEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txDataEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        txDataSaida.setBackground(new java.awt.Color(255, 255, 255));
        txDataSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lbValorEntrada.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbValorEntrada.setForeground(new java.awt.Color(0, 0, 0));
        lbValorEntrada.setText("Valor entrada:");

        lbValorSaida.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbValorSaida.setForeground(new java.awt.Color(0, 0, 0));
        lbValorSaida.setText("Valor saída:");

        txValorSaida.setBackground(new java.awt.Color(255, 255, 255));
        txValorSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txValorSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txValorEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txValorEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txValorEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        lbDescricao.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(0, 0, 0));
        lbDescricao.setText("Pesquise o ID:");

        txDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCategoria1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbCategoria1.setForeground(new java.awt.Color(0, 0, 0));
        lbCategoria1.setText("Categoria:");

        cbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cbCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Custos Fixos", "Custos Variáveis", "Despesas Operacionais", "Investimentos", "Despesas Financeiras", "Receitas Operacionais", "Receitas Diversas" }));
        cbCategoria.setBorder(null);

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lbDescricao1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbDescricao1.setForeground(new java.awt.Color(0, 0, 0));
        lbDescricao1.setText("Descrição:");

        btnPesquisar.setBackground(new java.awt.Color(51, 204, 0));
        btnPesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(0, 0, 153));
        btnAtualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txID.setBackground(new java.awt.Color(255, 255, 255));
        txID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txID.setForeground(new java.awt.Color(0, 0, 0));
        txID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txValorEntrada)
                                    .addComponent(txDataEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDataEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbValorEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCategoria1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(227, 227, 227)
                                            .addComponent(lbDataSaida)
                                            .addGap(24, 24, 24))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txValorSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbValorSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txDataSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbForma)
                                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lbTitle)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(lbDescricao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(506, 506, 506)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbTitle)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbForma)
                    .addComponent(lbCategoria1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataSaida)
                    .addComponent(lbDataEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorSaida)
                    .addComponent(lbValorEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(txDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(551, Short.MAX_VALUE)
                    .addComponent(lbDescricao1)
                    .addGap(191, 191, 191)))
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

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        limparCampos();
        if (!validaID()) {
            return;
        }

        try {
            Integer id = Integer.parseInt(txID.getText().trim());

            getDados(id);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro, insira somente números no campo id " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(telaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAtualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCategoria1;
    private javax.swing.JLabel lbDataEntrada;
    private javax.swing.JLabel lbDataSaida;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbDescricao1;
    private javax.swing.JLabel lbForma;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValorEntrada;
    private javax.swing.JLabel lbValorSaida;
    private javax.swing.JFormattedTextField txDataEntrada;
    private javax.swing.JFormattedTextField txDataSaida;
    private javax.swing.JTextField txDescricao;
    private javax.swing.JTextField txID;
    private javax.swing.JFormattedTextField txValorEntrada;
    private javax.swing.JFormattedTextField txValorSaida;
    // End of variables declaration//GEN-END:variables
    public void atualizar() {
        // Valida o ID antes de prosseguir
        if (!validaID()) {
            return;
        }

        CadastroTransacoesDAO cDAO = new CadastroTransacoesDAO();

        // Obtém o ID a partir do campo de texto
        Integer id = Integer.parseInt(txID.getText());

        // Obtém a transação com base no ID fornecido
        CadastroTransacoes transacao = cDAO.obter(id);

        // Verifica se a transação foi encontrada
        if (transacao == null) {
            JOptionPane.showMessageDialog(null, "Transação não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Configura o formato de data para validação e conversão
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            // Atualiza os dados da transação com os valores dos campos da interface
            transacao.setCategoria(cbCategoria.getSelectedItem().toString());
            transacao.setDescricao(txDescricao.getText());
            transacao.setFormaPagamento(cbFormaPagamento.getSelectedItem().toString());

            // Verifica e atualiza a data de entrada, se preenchida
            if (!txDataEntrada.getText().trim().isEmpty()) {
                LocalDate dataEntrada = LocalDate.parse(txDataEntrada.getText().trim(), formato);
                transacao.setDataEntrada(dataEntrada);
            } else {
                transacao.setDataEntrada(null);
            }

            // Verifica e atualiza a data de saída, se preenchida
            if (!txDataSaida.getText().trim().isEmpty()) {
                LocalDate dataSaida = LocalDate.parse(txDataSaida.getText().trim(), formato);
                transacao.setDataSaida(dataSaida);
            } else {
                transacao.setDataSaida(null);
            }

            // Verifica e atualiza o valor de entrada, se preenchido
            if (!txValorEntrada.getText().trim().isEmpty()) {
                double valorEntrada = Double.parseDouble(txValorEntrada.getText().trim());
                transacao.setValorEntrada(valorEntrada);
            } else {
                transacao.setValorEntrada(null);
            }

            // Verifica e atualiza o valor de saída, se preenchido
            if (!txValorSaida.getText().trim().isEmpty()) {
                double valorSaida = Double.parseDouble(txValorSaida.getText().trim());
                transacao.setValorSaida(valorSaida);
            } else {
                transacao.setValorSaida(null);
            }

            // Atualiza a lista de transações e limpa os campos
            cDAO.atualizar(transacao);
            limparCampos();
            
            JOptionPane.showMessageDialog(null, "Transação atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor de entrada ou saída inválido. Use um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a transação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void getDados(Integer id) {
        // Obtém a transação com base no ID fornecido
        CadastroTransacoesDAO cadastroTransacoes = new CadastroTransacoesDAO();
        CadastroTransacoes cadastro = cadastroTransacoes.obter(id); 
        
        // Configura o formato de data para exibição
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Verifica se a transação foi encontrada
        if (cadastro != null) {
            try {
                // Preenche os campos da interface com os dados da transação
                cbCategoria.setSelectedItem(cadastro.getCategoria());
                cbFormaPagamento.setSelectedItem(cadastro.getFormaPagamento());

                // Preenche a data de entrada, se existir
                if (cadastro.getDataEntrada() != null) {
                    txDataEntrada.setText(formato.format(cadastro.getDataEntrada()));
                } else {
                    txDataEntrada.setText("");
                }

                // Preenche a data de saída, se existir
                if (cadastro.getDataSaida() != null) {
                    txDataSaida.setText(formato.format(cadastro.getDataSaida()));
                } else {
                    txDataSaida.setText("");
                }

                // Preenche o valor de entrada, se existir
                if (cadastro.getValorEntrada() != null) {
                    txValorEntrada.setText(cadastro.getValorEntrada().toString());
                } else {
                    txValorEntrada.setText("");
                }

                // Preenche o valor de saída, se existir
                if (cadastro.getValorSaida() != null) {
                    txValorSaida.setText(cadastro.getValorSaida().toString());
                } else {
                    txValorSaida.setText("");
                }

                // Preenche a descrição
                txDescricao.setText(cadastro.getDescricao());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher os campos!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum lançamento encontrado com o ID fornecido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void limparCampos() {
        // Limpa todos os campos da interface
        cbCategoria.setSelectedItem("Selecione:");
        cbFormaPagamento.setSelectedItem("Selecione:");
        txDataEntrada.setText("");
        txDataSaida.setText("");
        txValorEntrada.setText("");
        txValorSaida.setText("");
        txDescricao.setText("");
    }

    public boolean validaID() {
        // Obtém o texto do campo ID e remove espaços em branco
        String idText = txID.getText().trim();

        // Verifica se o campo ID está vazio
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo ID não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Verifica se o campo ID contém apenas números
        if (!idText.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "O campo ID deve conter apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
}
