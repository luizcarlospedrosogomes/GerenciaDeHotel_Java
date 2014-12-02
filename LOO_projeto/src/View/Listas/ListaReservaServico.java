
package View.Listas;

import Controller.CadastroReserva;
import Model.Reserva;
import View.FormCheckin;
import View.FormConsumo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaReservaServico extends javax.swing.JDialog {

    /** Creates new form ListaReserva */
    public ListaReservaServico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tela();
    }
                                  

     private void tela(){
   jTable1.setDefaultEditor(Object.class, null);  // ou usar um TableModel nao  editavel
   jTable1.setAutoscrolls(true);
   jTable1.addMouseListener(new MouseAdapter() {
    public void mousePressed(MouseEvent me) {
        Point p = me.getPoint();
        int row = jTable1.rowAtPoint(p);
        if (me.getClickCount() == 2) {
            FormConsumo formConsumo = new FormConsumo();
            formConsumo.getDadosTabela(String.valueOf(jTable1.getValueAt(row, 0)), String.valueOf(jTable1.getValueAt(row, 1)), String.valueOf(jTable1.getValueAt(row, 2)), String.valueOf(jTable1.getValueAt(row, 4)),String.valueOf(jTable1.getValueAt(row, 5)));
            formConsumo.setVisible(true);
            formConsumo.setLocationRelativeTo(null);
            formConsumo.setDefaultCloseOperation(formConsumo.DISPOSE_ON_CLOSE);
        
            setVisible(false);
          }
    }
});
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data Inicio", "Data Fim", "Código Cliente", "Nome ", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
              
        try {
             CadastroReserva cadReserva = new CadastroReserva();
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Object[] linha = new Object[6];

            ArrayList<Reserva> lista =  cadReserva.listarReserva();
            for(Reserva reserva : lista ){
            linha[0] = reserva.getCodigo();
            linha[1] = reserva.getDataInicio();
            linha[2] = reserva.getDataFim();
            linha[3] = reserva.getHospede().getCodigo();
            linha[4] = reserva.getHospede().getNome();
            linha[5] = reserva.getHospede().getCpf();
            
            modelo.addRow(linha); 
             
            }
           
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(this, e);
       }catch(SQLException e){
           JOptionPane.showMessageDialog(this, e);
       }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ListaReservaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaReservaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaReservaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaReservaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaReservaServico dialog = new ListaReservaServico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
