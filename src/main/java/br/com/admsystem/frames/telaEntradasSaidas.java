package br.com.admsystem.frames;

import br.com.admsystem.persistencia.CadastroTransacoesDAO;
import br.com.admsystem.persistencia.UsuarioDAO;
import entities.CadastroTransacoes;
import entities.ListaTransacoes;
import entities.SessaoUsuario;
import entities.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;

public class telaEntradasSaidas extends javax.swing.JFrame {

    public telaEntradasSaidas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbForma = new javax.swing.JLabel();
        CbFormaPagamento = new javax.swing.JComboBox<>();
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
        CbCategoria1 = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lbTitle.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 0, 153));
        lbTitle.setText("CADASTRO DE ENTRADAS/SAÍDAS");

        lbForma.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbForma.setForeground(new java.awt.Color(0, 0, 0));
        lbForma.setText("Forma de pagamento");

        CbFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        CbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbFormaPagamento.setForeground(new java.awt.Color(0, 0, 0));
        CbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Dinheiro", "PIX", "Transferência (TED/DOC)", "Boleto", "Cartão de crédito (à vista/parcelado)", "Financiamento", "Cheque", "Débito automático", "Vale-alimentação/refeição", "Permuta" }));
        CbFormaPagamento.setBorder(null);

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
        lbDescricao.setText("Descrição:");

        txDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCategoria1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lbCategoria1.setForeground(new java.awt.Color(0, 0, 0));
        lbCategoria1.setText("Categoria:");

        CbCategoria1.setBackground(new java.awt.Color(255, 255, 255));
        CbCategoria1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbCategoria1.setForeground(new java.awt.Color(0, 0, 0));
        CbCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Custos Fixos", "Custos Variáveis", "Despesas Operacionais", "Investimentos", "Despesas Financeiras", "Receitas Operacionais", "Receitas Diversas" }));
        CbCategoria1.setBorder(null);

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 153));
        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbForma))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(90, 90, 90))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txValorEntrada)
                                    .addComponent(txDataEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDataEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbValorEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(227, 227, 227)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbDataSaida)
                                            .addComponent(txDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbCategoria1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbTitle)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbForma)
                    .addComponent(lbCategoria1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataEntrada)
                    .addComponent(lbDataSaida))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorEntrada)
                    .addComponent(lbValorSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        cadastroEntradaseSaidas();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(telaEntradasSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaEntradasSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaEntradasSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaEntradasSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaEntradasSaidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbCategoria1;
    private javax.swing.JComboBox<String> CbFormaPagamento;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCategoria1;
    private javax.swing.JLabel lbDataEntrada;
    private javax.swing.JLabel lbDataSaida;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbForma;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValorEntrada;
    private javax.swing.JLabel lbValorSaida;
    private javax.swing.JFormattedTextField txDataEntrada;
    private javax.swing.JFormattedTextField txDataSaida;
    private javax.swing.JTextField txDescricao;
    private javax.swing.JFormattedTextField txValorEntrada;
    private javax.swing.JFormattedTextField txValorSaida;
    // End of variables declaration//GEN-END:variables

    public void cadastroEntradaseSaidas() {
        // Verifica se os campos obrigatórios estão preenchidos
        if (!validarCampos()) {
            return;
        }

        // Cria um formato de data para validar e converter as datas inseridas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        CadastroTransacoes cadastro = new CadastroTransacoes();
        Usuario user = SessaoUsuario.getIdUsuarioLogado();
        try {
            // Verifica e converte a data de entrada, se preenchida
            if (!txDataEntrada.getText().trim().isEmpty()) {
                LocalDate dataEntrada = LocalDate.parse(txDataEntrada.getText().trim(), formato);
                cadastro.setDataEntrada(dataEntrada);
            } else {
                cadastro.setDataEntrada(null);
            }

            // Verifica e converte a data de saída, se preenchida
            if (!txDataSaida.getText().trim().isEmpty()) {
                LocalDate dataSaida = LocalDate.parse(txDataSaida.getText().trim(), formato);
                cadastro.setDataSaida(dataSaida);
            } else {
                cadastro.setDataSaida(null);
            }

            // Verifica e converte o valor de entrada, se preenchido
            if (!txValorEntrada.getText().trim().isEmpty()) {
                double valorEntrada = Double.parseDouble(txValorEntrada.getText().trim());
                cadastro.setValorEntrada(valorEntrada);
            } else {
                cadastro.setValorEntrada(null);
            }

            // Verifica e converte o valor de saída, se preenchido
            if (!txValorSaida.getText().trim().isEmpty()) {
                double valorSaida = Double.parseDouble(txValorSaida.getText().trim());
                cadastro.setValorSaida(valorSaida);
            } else {
                cadastro.setValorSaida(null);
            }
            
            // Preenche os dados da transação com os valores dos campos da interface
            cadastro.setUsuario(SessaoUsuario.getIdUsuarioLogado());
            cadastro.setCategoria(CbCategoria1.getSelectedItem().toString());
            cadastro.setDescricao(txDescricao.getText());
            cadastro.setFormaPagamento(CbFormaPagamento.getSelectedItem().toString());
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Erro ao insirir a data");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor de entrada ou saída inválido. Use um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        CadastroTransacoesDAO ctDAO = new CadastroTransacoesDAO();
        ctDAO.cadastrar(cadastro);
        limparCampos();

    }

    public boolean validarCampos() {
        // Valida se a categoria foi selecionada
        if (CbCategoria1.getSelectedItem().equals("Selecione:")) {
            JOptionPane.showMessageDialog(null, "O campo 'Categoria' é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Valida se a forma de pagamento foi selecionada
        if (CbFormaPagamento.getSelectedItem().equals("Selecione:")) {
            JOptionPane.showMessageDialog(null, "O campo 'Forma de Pagamento' é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (txDataEntrada.getText().equals("") && txDataSaida.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha um dos campos data.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Valida se a descrição foi preenchida
        if (txDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Descrição' é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void limparCampos() {
        // Limpa todos os campos da interface
        txDataEntrada.setText("");
        txDataSaida.setText("");
        txDescricao.setText("");
        txValorEntrada.setText("");
        txValorSaida.setText("");
        CbCategoria1.setSelectedItem("Selecione:");
        CbFormaPagamento.setSelectedItem("Selecione:");
    }

}
