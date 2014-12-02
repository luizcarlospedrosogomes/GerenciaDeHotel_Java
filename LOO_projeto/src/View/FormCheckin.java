/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.Checkin;
import Controller.LimitaCaracter;
import View.Listas.ListaMapaOCupacao;
import View.Listas.ListaReservaCheckin;
import View.Listas.ListaServico;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javassist.CtMethod.ConstParameter.integer;
import javax.swing.JOptionPane;

public class FormCheckin extends javax.swing.JFrame {

   
    public FormCheckin() {
        initComponents();
       tela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldReserva = new javax.swing.JTextField();
        jButtonReserva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldDataInicio = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldDataFim = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuarto = new javax.swing.JTextField();
        jButtonQuarto = new javax.swing.JButton();
        jToggleButtonCancela = new javax.swing.JToggleButton();
        jToggleButtonConfirma = new javax.swing.JToggleButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit.png"))); // NOI18N
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/list.png"))); // NOI18N
        jButtonListar.setEnabled(false);
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Incluir.png"))); // NOI18N
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

        jLabel1.setText("Reserva");

        jTextFieldReserva.setEnabled(false);

        jButtonReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchReserva.png"))); // NOI18N
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel3.setText("CPF");

        jTextFieldCPF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCPF.setEnabled(false);
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        jLabel4.setText("Periodo");

        jFormattedTextFieldDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldDataInicio.setEnabled(false);

        jLabel5.setText("ate");

        jFormattedTextFieldDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldDataFim.setEnabled(false);

        jLabel6.setText("Quarto");

        jTextFieldQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuartoActionPerformed(evt);
            }
        });
        jTextFieldQuarto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldQuartoFocusLost(evt);
            }
        });

        jButtonQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchReserva.png"))); // NOI18N
        jButtonQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuartoActionPerformed(evt);
            }
        });

        jToggleButtonCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Close-2-icon.png"))); // NOI18N
        jToggleButtonCancela.setText("Cancela");
        jToggleButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCancelaActionPerformed(evt);
            }
        });

        jToggleButtonConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok-icon.png"))); // NOI18N
        jToggleButtonConfirma.setText("Confirma");
        jToggleButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButtonCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(jToggleButtonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
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
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonCancela)
                    .addComponent(jToggleButtonConfirma)))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
      //  habilitaEdicao();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        ListaServico lista = new ListaServico(this, true);
        lista.setLocationRelativeTo(null);
        lista.setDefaultCloseOperation(lista.DISPOSE_ON_CLOSE);
        lista.setVisible(true);
      //  this.setVisible(false);
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
       habilitaInsercao();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
        ListaReservaCheckin lista = new ListaReservaCheckin(this, true);
        lista.setLocationRelativeTo(null);
        lista.setDefaultCloseOperation(lista.DISPOSE_ON_CLOSE);
        lista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReservaActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jToggleButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButtonCancelaActionPerformed

    private void jToggleButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConfirmaActionPerformed
        try {
            Checkin checkin = new Checkin();

            if (checkin.inserirCheckin(jTextFieldReserva.getText(), jTextFieldQuarto.getText())){
                JOptionPane.showMessageDialog(this, "Reserva inserida com sucesso");
            }else
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos incompletos",JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e);

        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jToggleButtonConfirmaActionPerformed
    public void getDadosTabela(String codReserva, String dataIncio, String dataFim, String nome, String cpf){
      jTextFieldReserva.setText(codReserva);
      jTextFieldNome.setText(nome);
      jTextFieldCPF.setText(cpf);
      jFormattedTextFieldDataInicio.setText(dataIncio);
      jFormattedTextFieldDataFim.setText(dataFim);
      jTextFieldQuarto.requestFocus();
    }
    
    public void  getQuarto(String numero){
     //   return numero;   
        jTextFieldQuarto.setText(numero);
    }
    private void habilitaInsercao(){
        jButtonReserva.setEnabled(true);
        jButtonQuarto.setEnabled(false);
        jTextFieldQuarto.setEnabled(true);
        jTextFieldCPF.setText("");
        jButtonIncluir.setEnabled(false);
        jFormattedTextFieldDataInicio.setText("");
        jFormattedTextFieldDataFim.setText("");
        jTextFieldQuarto.setText("");
        jTextFieldReserva.setText("");
        jTextFieldNome.setText("");
     
    }
    
    private void tela(){
        jToggleButtonConfirma.setEnabled(false);
        jButtonIncluir.setEnabled(true);
        jTextFieldReserva.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldCPF.setEnabled(false);
        jFormattedTextFieldDataInicio.setEnabled(false);
        jFormattedTextFieldDataFim.setEnabled(false);
        jTextFieldQuarto.setEnabled(true);
        jButtonQuarto.setEnabled(false);
        jButtonReserva.setEnabled(false);
        jButtonQuarto.setEnabled(false);  
        jTextFieldQuarto.setDocument(new LimitaCaracter(4));
        
    }
    private void jButtonQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuartoActionPerformed
        ListaMapaOCupacao lista = new ListaMapaOCupacao(this, true);
        lista.setLocationRelativeTo(null);
      //  lista.setDefaultCloseOperation(lista.DISPOSE_ON_CLOSE);
        lista.setVisible(true);
       // this.setVisible(false);
    }//GEN-LAST:event_jButtonQuartoActionPerformed

    private void jTextFieldQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuartoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
   //  jTextFieldQuarto.setText(getQuarto("999"));
    }//GEN-LAST:event_formComponentShown

    private void jTextFieldQuartoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQuartoFocusLost
        //faz busca pelo codigo inserido
       
        try {
          Checkin  checkin = new Checkin();
             if(checkin.buscaQuarto(jTextFieldQuarto.getText()) == "-1"){
                JOptionPane.showMessageDialog(this, "O quarto encontra-se ocupado ou não existe");
                jTextFieldQuarto.setText("");
                jToggleButtonConfirma.setEnabled(false);
             }else
                 jToggleButtonConfirma.setEnabled(true);
                 
        } catch(SQLException e){
           JOptionPane.showMessageDialog(this, "O quarto encontra-se ocupado ou não existe");
           jToggleButtonConfirma.setEnabled(false);
        } catch(ClassNotFoundException e){
           JOptionPane.showMessageDialog(this, e);
        }       
    }//GEN-LAST:event_jTextFieldQuartoFocusLost

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
            java.util.logging.Logger.getLogger(FormCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCheckin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonQuarto;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuarto;
    private javax.swing.JTextField jTextFieldReserva;
    private javax.swing.JToggleButton jToggleButtonCancela;
    private javax.swing.JToggleButton jToggleButtonConfirma;
    // End of variables declaration//GEN-END:variables
}
