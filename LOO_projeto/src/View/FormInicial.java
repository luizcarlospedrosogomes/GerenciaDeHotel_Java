package View;

import static Model.NewHibernateUtil.getSessionFactory;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.hibernate.SessionFactory;

/**
 *
 * @author LuizCarlos
 */
public class FormInicial extends javax.swing.JFrame {

    /**
     * Creates new form FormInicial
     */
    public FormInicial() {
        initComponents();
        tela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadastroServico = new javax.swing.JButton();
        jButtonCadastroQuarto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelStatusBanco = new javax.swing.JLabel();
        jButtonCadastroCliente1 = new javax.swing.JButton();
        jButtonReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCadastroServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Service-icon.png"))); // NOI18N
        jButtonCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroServicoActionPerformed(evt);
            }
        });

        jButtonCadastroQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/room-512.png"))); // NOI18N
        jButtonCadastroQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroQuartoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelStatusBanco.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatusBanco)
                .addContainerGap(875, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelStatusBanco)
                .addContainerGap())
        );

        jButtonCadastroCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clients-icon.png"))); // NOI18N
        jButtonCadastroCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroCliente1ActionPerformed(evt);
            }
        });

        jButtonReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/hotel-icon.png"))); // NOI18N
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButtonCadastroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroServicoActionPerformed
        FormCadastroServico cadastroServico = new FormCadastroServico();
        cadastroServico.setLocationRelativeTo(null);
        cadastroServico.setDefaultCloseOperation(cadastroServico.DISPOSE_ON_CLOSE);
        cadastroServico.setVisible(true);
      
    }//GEN-LAST:event_jButtonCadastroServicoActionPerformed

    private void jButtonCadastroQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroQuartoActionPerformed
       FormCadastroQuarto  cadastroQuarto = new FormCadastroQuarto();
       cadastroQuarto.setLocationRelativeTo(null);
       cadastroQuarto.setDefaultCloseOperation(cadastroQuarto.DISPOSE_ON_CLOSE);
       cadastroQuarto.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroQuartoActionPerformed

    private void jButtonCadastroCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroCliente1ActionPerformed
        FormCadastroCliente cadastroCliente = new FormCadastroCliente();
        cadastroCliente.setLocationRelativeTo(null);
        cadastroCliente.setDefaultCloseOperation(cadastroCliente.DISPOSE_ON_CLOSE);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroCliente1ActionPerformed

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
       FormReserva reserva = new FormReserva();
        reserva.setLocationRelativeTo(null);
        reserva.setDefaultCloseOperation(reserva.DISPOSE_ON_CLOSE);
        reserva.setVisible(true);
    }//GEN-LAST:event_jButtonReservaActionPerformed
    public void tela() {
        if (getSessionFactory().openSession() != null) {
            jLabelStatusBanco.setText("Conectado a base de dados");
        } else {
            jLabelStatusBanco.setText("Não conectado");
        }

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
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroCliente1;
    private javax.swing.JButton jButtonCadastroQuarto;
    private javax.swing.JButton jButtonCadastroServico;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JLabel jLabelStatusBanco;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
