package View;

import Controller.CadastroConsumoServico;
import Controller.CadastroServico;
import Controller.LimitaCaracter;
import View.Listas.ListaReservaServico;
import java.math.BigDecimal;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FormConsumo extends javax.swing.JFrame {

    public FormConsumo() {
        initComponents();
        tela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButtonConfirma = new javax.swing.JToggleButton();
        jToggleButtonCancela = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigoServico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldReserva = new javax.swing.JTextField();
        jButtonReserva = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldDataInicio = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldDataFim = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButtonConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok-icon.png"))); // NOI18N
        jToggleButtonConfirma.setText("Confirma");
        jToggleButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConfirmaActionPerformed(evt);
            }
        });

        jToggleButtonCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Close-2-icon.png"))); // NOI18N
        jToggleButtonCancela.setText("Cancela");
        jToggleButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCancelaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit.png"))); // NOI18N
        jButtonEditar.setEnabled(false);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/list.png"))); // NOI18N
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Incluir.png"))); // NOI18N
        jButtonIncluir.setEnabled(false);
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIncluir)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar))
                .addContainerGap())
        );

        jLabel4.setText("Codigo Servico");

        jTextFieldCodigoServico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoServico.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextFieldCodigoServicoComponentShown(evt);
            }
        });
        jTextFieldCodigoServico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoServicoFocusLost(evt);
            }
        });

        jLabel5.setText("Descricao Servico");

        jTextFieldDescricao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDescricao.setEnabled(false);

        jLabel6.setText("Valor R$");

        jTextFieldValor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValor.setEnabled(false);
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Reserva");

        jTextFieldReserva.setEnabled(false);

        jButtonReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchReserva.png"))); // NOI18N
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jTextFieldCPF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCPF.setEnabled(false);
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        jLabel7.setText("Periodo");

        jFormattedTextFieldDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldDataInicio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldDataInicio.setEnabled(false);

        jLabel8.setText("ate");

        jFormattedTextFieldDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldDataFim.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldDataFim.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jToggleButtonCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jToggleButtonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescricao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonCancela)
                    .addComponent(jToggleButtonConfirma))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConfirmaActionPerformed
        try {
            CadastroConsumoServico  cadConsumo = new CadastroConsumoServico();

            if (cadConsumo.inserirConsumo(jTextFieldReserva.getText(), jTextFieldCodigoServico.getText())){
                JOptionPane.showMessageDialog(this, "Consumo registrado com sucesso");
            }else
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos incompletos",JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
       
    }//GEN-LAST:event_jToggleButtonConfirmaActionPerformed

    private void jToggleButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButtonCancelaActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
     /*   int opcao  = JOptionPane.showConfirmDialog(this, "Excluir reserva?","Excluir", JOptionPane.YES_OPTION);
        if(opcao == 0 ){
            try{
                CadastroReserva cadReserva = new CadastroReserva();
                cadReserva.excluirReserva(operacao);
                JOptionPane.showMessageDialog(this, "Reserva excluido com sucesso", "Excluido", JOptionPane.INFORMATION_MESSAGE);

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, e);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
       */
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
      
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
       // habilitaInsercao();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldCodigoServicoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextFieldCodigoServicoComponentShown
 
    }//GEN-LAST:event_jTextFieldCodigoServicoComponentShown

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
        ListaReservaServico lista = new ListaReservaServico(this, true);
        lista.setLocationRelativeTo(null);
        lista.setDefaultCloseOperation(lista.DISPOSE_ON_CLOSE);
        lista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReservaActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jTextFieldCodigoServicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoServicoFocusLost
               try {

            CadastroServico  cadServico = new CadastroServico();
            if(cadServico.buscaServico(jTextFieldCodigoServico.getText()).size() > 0){
                //nome
                jTextFieldDescricao.setText(cadServico.buscaServico(jTextFieldCodigoServico.getText()).get(0).getDescricao());
                //cpf
                BigDecimal valor = cadServico.buscaServico(jTextFieldCodigoServico.getText()).get(0).getValor();
                //BigDecimal.valueOf()
                jTextFieldValor.setText(String.valueOf(valor.doubleValue()));
                jToggleButtonConfirma.setEnabled(true);
               // System.out.println("enviou");
            }else{
                
                jTextFieldDescricao.setText("`Servico não encontrado");
                jTextFieldCodigoServico.setText("");
                jToggleButtonConfirma.setEnabled(false);
            }
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jTextFieldCodigoServicoFocusLost
    
    public void getDadosTabela(String codReserva, String dataIncio, String dataFim, String nome, String cpf){
      jTextFieldReserva.setText(codReserva);
      jTextFieldNome.setText(nome);
      jTextFieldCPF.setText(cpf);
      jFormattedTextFieldDataInicio.setText(dataIncio);
      jFormattedTextFieldDataFim.setText(dataFim);
      jTextFieldCodigoServico.requestFocus();
    }
    
    public void tela(){
        jTextFieldCodigoServico.setDocument(new LimitaCaracter(5));
    }
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
            java.util.logging.Logger.getLogger(FormConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCodigoServico;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldReserva;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JToggleButton jToggleButtonCancela;
    private javax.swing.JToggleButton jToggleButtonConfirma;
    // End of variables declaration//GEN-END:variables
}
