

package View;

import Controller.CadastroCliente;
import Controller.CadastroReserva;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;


public class FormReserva extends javax.swing.JFrame {

    String operacao;
    private ActionEvent ActionEvent;
    public FormReserva() {
        initComponents();
        tela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButtonConfirma = new javax.swing.JToggleButton();
        jToggleButtonCancela = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jFormattedTextFieldDataInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataFim = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo hospede");

        jTextFieldCodigo.setForeground(new java.awt.Color(51, 0, 51));
        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoFocusLost(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldCPF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        jLabel4.setText("Periodo");

        jLabel5.setText("ate");

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

        jFormattedTextFieldDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jFormattedTextFieldDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButtonCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jToggleButtonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonConfirma)
                    .addComponent(jToggleButtonCancela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        ListaReserva lista = new ListaReserva(this, true);
        lista.setLocationRelativeTo(null);
        lista.setDefaultCloseOperation(lista.DISPOSE_ON_CLOSE);
        lista.setVisible(true); 
        this.setVisible(false);

    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        habilitaInsercao();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jToggleButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButtonCancelaActionPerformed
    //ao sair busca hospede
    private void jTextFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoFocusLost
        try {
           
            CadastroCliente  cadCliente = new CadastroCliente();
            if(cadCliente.preencheCampos(jTextFieldCodigo.getText()).size() > 0){
                //nome
                jTextFieldNome.setText(cadCliente.preencheCampos(jTextFieldCodigo.getText()).get(0).getNome());
                 //cpf
                jTextFieldCPF.setText(cadCliente.preencheCampos(jTextFieldCodigo.getText()).get(0).getCpf());
                jToggleButtonConfirma.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "Hospede não encontrado","Veriquife codigo hospede", JOptionPane.ERROR_MESSAGE);
                jTextFieldNome.setText("Hospede não encontrado");
                jTextFieldCPF.setText("");
                jToggleButtonConfirma.setEnabled(false);
            }
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e);
       }catch(SQLException e){
           JOptionPane.showMessageDialog(this, e);
       }
    }//GEN-LAST:event_jTextFieldCodigoFocusLost

    private void jToggleButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConfirmaActionPerformed
        try {
           CadastroReserva  cadReserva = new CadastroReserva();
            
           if (cadReserva.inserirReserva(jTextFieldCodigo.getText(), jFormattedTextFieldDataInicio.getText(), jFormattedTextFieldDataFim.getText())){
               JOptionPane.showMessageDialog(this, "Reserva inserida com sucesso");
           }else
               JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos incompletos",JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e);
        }catch(SQLException e){
           JOptionPane.showMessageDialog(this, e);
        }catch (ParseException e){
            JOptionPane.showMessageDialog(this, "Data preenchida incorretamente.", "Erro no Preenchimento campo Periodo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButtonConfirmaActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int opcao  = JOptionPane.showConfirmDialog(this, "Excluir reserva?","Excluir", JOptionPane.YES_OPTION);
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

    }//GEN-LAST:event_jButtonExcluirActionPerformed
    
    private void habilitaInsercao(){
        jButtonIncluir.setEnabled(false);
        jToggleButtonConfirma.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jFormattedTextFieldDataFim.setEnabled(true);
        jFormattedTextFieldDataInicio.setEnabled(true);
        jFormattedTextFieldDataInicio.setText("");
        jFormattedTextFieldDataFim.setText("");
        jTextFieldCodigo.setText("");
        
    }
    
    private void tela(){
        jButtonIncluir.setEnabled(true);
        jToggleButtonConfirma.setEnabled(false);
        jTextFieldCodigo.setEnabled(false);
        jFormattedTextFieldDataFim.setEnabled(false);
        jFormattedTextFieldDataInicio.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldCPF.setEnabled(false);
        
    }
    public void getCodigoTable(String codigo, String dataInicio, String dataFim, String codCliente, String cpf, String nome){
        operacao = codigo;
        jFormattedTextFieldDataInicio.setText(dataInicio);
        jFormattedTextFieldDataFim.setText(dataFim);
        jTextFieldCodigo.setText(codCliente);
        jTextFieldCPF.setText(cpf);
        jTextFieldNome.setText(nome);
        jButtonExcluir.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JToggleButton jToggleButtonCancela;
    private javax.swing.JToggleButton jToggleButtonConfirma;
    // End of variables declaration//GEN-END:variables
}
