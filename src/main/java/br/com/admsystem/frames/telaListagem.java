package br.com.admsystem.frames;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entities.CadastroTransacoes;
import entities.ListaTransacoes;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class telaListagem extends javax.swing.JFrame {

    public telaListagem() {
        initComponents();
        //Inicializa o frame com o Jtable preenchido
        listarTabela();
        
        //Inicializa com o saldo de acordo com os lançamentos
        saldo();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransacoes = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txSaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 750));

        tableTransacoes.setBackground(new java.awt.Color(255, 255, 255));
        tableTransacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableTransacoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableTransacoes.setForeground(new java.awt.Color(0, 0, 0));
        tableTransacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "id_usuario", "categoria", "descrição", "data_entrada", "data_saida", "valor_entrada", "valor_saida", "forma_pagamento"
            }
        ));
        jScrollPane1.setViewportView(tableTransacoes);

        lbTitle.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 0, 153));
        lbTitle.setText("LISTAGEM ENTRADAS/SAÍDAS");

        lbSaldo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lbSaldo.setText("SALDO:");

        btnRelatorio.setBackground(new java.awt.Color(51, 204, 0));
        btnRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setText("Emitir Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
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

        txSaldo.setBackground(new java.awt.Color(255, 255, 255));
        txSaldo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txSaldo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVoltar)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(275, 275, 275))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldo)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        salvarArquivo();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(telaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tableTransacoes;
    private javax.swing.JTextField txSaldo;
    // End of variables declaration//GEN-END:variables

        public void listarTabela() {
        //Define o modelo da tabela, referenciando tableTransacoes
        DefaultTableModel model = (DefaultTableModel) tableTransacoes.getModel();
        model.setRowCount(0);

        //Define o formato da data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        //Adiciona a tabela os objetos criados com seus atributos
        for (CadastroTransacoes u : ListaTransacoes.listar()) {
            //Caso os campos não estejam preenchidos serão colocados N/A
            String dataEntradaFormatada = u.getDataEntrada() != null ? formato.format(u.getDataEntrada()) : "N/A";
            String dataSaidaFormatada = u.getDataSaida() != null ? formato.format(u.getDataSaida()) : "N/A";

            //Caso os campos não estejam preenchidos serão colocados 0.0
            String valorEntradaStr = u.getValorEntrada() != null ? u.getValorEntrada().toString() : "0.0";
            String valorSaidaStr = u.getValorSaida() != null ? u.getValorSaida().toString() : "0.0";

            //Adiciona ao Jtable os atributos
            model.addRow(new Object[]{
                u.getId(),
                u.getIdUsuario(),
                u.getCategoria(),
                u.getDescricao(),
                dataEntradaFormatada,
                dataSaidaFormatada,
                valorEntradaStr,
                valorSaidaStr,
                u.getFormaPagamento()
            });
        }
    }

    public void saldo() {
        //Criacão da variável saldo
        double saldoTotal = 0.0;

        //Captura os valores de entrada e saida da aplicacao
        for (CadastroTransacoes transacao : ListaTransacoes.listar()) {
            if (transacao.getValorEntrada() != null) {
                saldoTotal += transacao.getValorEntrada();
            }
            if (transacao.getValorSaida() != null) {
                saldoTotal -= transacao.getValorSaida();
            }
        }

        //Formatação do saldoTotal 
        txSaldo.setText(String.format("R$ %.2f", saldoTotal));
    }

    public void salvarArquivo(){
        //Instacia a clasee JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        //Define o título da janela de diálogo
        fileChooser.setDialogTitle("Salvar como");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int selecaoUsuario = fileChooser.showSaveDialog(null);

        //Verifica se o usuário confirmou o salvamento do arquivo
        if (selecaoUsuario == JFileChooser.APPROVE_OPTION) {

            //Armazena o caminho completo do arquivo selecionado pelo usuário
            String caminhoArquivo = fileChooser.getSelectedFile().getAbsolutePath();

            //Adiciona a extensão .pdf ao nome do arquivo, caso o usuário não tenha especificado
            if (!caminhoArquivo.toLowerCase().endsWith(".pdf")) {
                caminhoArquivo += ".pdf";
            }

            //Cria um documento PDF com orientação paisagem (A4 rotacionado)
            Document documento = new Document(PageSize.A4.rotate());

            try (FileOutputStream arquivoPDF = new FileOutputStream(caminhoArquivo)) {
                //Cria uma instância do PdfWriter para gerar o arquivo PDF
                PdfWriter.getInstance(documento, arquivoPDF);
                documento.open();

                //Cria uma tabela no PDF com o mesmo número de colunas da JTable
                PdfPTable pdfTable = new PdfPTable(tableTransacoes.getColumnCount());
                pdfTable.setWidthPercentage(100);

                TableModel model = tableTransacoes.getModel();

                //Adiciona os nomes das colunas ao PDF (cabeçalhos da tabela)
                for (int i = 0; i < model.getColumnCount(); i++) {
                    String nomeColuna = model.getColumnName(i);
                    //Se o nome da coluna for nulo, usa um valor padrão
                    if (nomeColuna == null) {
                        nomeColuna = "Coluna " + (i + 1);
                    }
                    pdfTable.addCell(nomeColuna);
                }

                //Adiciona os dados das células da JTable ao PDF
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        Object value = model.getValueAt(i, j);
                        pdfTable.addCell(value != null ? value.toString() : "");
                    }
                }

                // Adiciona a tabela ao documento PDF
                documento.add(pdfTable);

                JOptionPane.showMessageDialog(null, "Dados exportados com sucesso para:\n" + caminhoArquivo);
            } catch (DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao exportar os dados:\n" + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );

                // Fecha o documento para liberar recursos
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao salvar o arquivo:\n" + e.getMessage() + "\nVerifique o caminho e as permissões.",
                        "Erro de I/O",
                        JOptionPane.ERROR_MESSAGE);
                
                // Fecha o documento para liberar recursos
            } finally {
                if (documento != null && documento.isOpen()) {
                    documento.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Exportação cancelada pelo usuário.");
        }
    }
}
