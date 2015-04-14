/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Fitness.Ejercicio;
import Fitness.Maquina;
import Fitness.Paciente;
import Fitness.ProgramaEntrenamiento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author will
 *
 */
public class MenuConfignMaquina extends javax.swing.JFrame {

    public static final ArrayList<Maquina> maquinas = new ArrayList<>();

    private final NonEditableTableModel maquinaTableModel = new NonEditableTableModel();
    private final String[] maquinaHeader = {"Num Maquina", "Descripción"};

    private long numMaquinaActual = 0;

    /**
     * Creates new form MenuConfiguracion
     */
    public MenuConfignMaquina() {
        initComponents();
        refreshTblMaquina();

    }

    private boolean ExisteMaquina(long pNumMaquina) {
        boolean res = false;

        for (Maquina maquina : maquinas) {
            res |= maquina.getNumMaquina() == pNumMaquina;
        }
        System.out.println(res);
        return res;
    }

    private void refreshTblMaquina() {
        String[][] maquinaDatos = new String[maquinas.size()][2];

        for (int index = 0; index < maquinas.size(); index++) {
            Maquina maquina = maquinas.get(index);

            maquinaDatos[index][0] = Long.toString(maquina.getNumMaquina());
            maquinaDatos[index][1] = maquina.getDescripcion();
        }

        maquinaTableModel.setDataVector(maquinaDatos, maquinaHeader);

        tbl_Maquina.setModel(maquinaTableModel);
    }

    private void clearForm() {
        tf_DescripMaquina.setText("");
        numMaquinaActual = 0;
    }

    private void removeMaquinaFromEverywhere(Maquina pMaquina) {
        for (int indexPaciente = 0; indexPaciente < MenuPaciente.pacientes.size(); indexPaciente++) {
            Paciente paciente = MenuPaciente.pacientes.get(indexPaciente);
            int sizeProEntrenamiento = paciente.getProgramaEntrenamientoList().size();
            for (int indexProEntrenamiento = 0; indexProEntrenamiento < sizeProEntrenamiento; indexProEntrenamiento++) {
                ProgramaEntrenamiento proEntrenamiento
                        = paciente.getProgramaEntrenamientoList().get(indexProEntrenamiento);

                for (int indexDia = 0; indexDia < proEntrenamiento.getDiasEjercicio().size(); indexDia++) {
                    ArrayList<Ejercicio> dia = proEntrenamiento.getDiasEjercicio().get(indexDia);
                    for (int indexEjercicio = 0; indexEjercicio < dia.size(); indexEjercicio++) {
                        Ejercicio ejercicio = dia.get(indexEjercicio);

                        if (ejercicio.getMaquina() != null && pMaquina.equals(ejercicio.getMaquina())) {
                            dia.remove(indexDia);
                        }
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Maquina = new javax.swing.JTable();
        tf_DescripMaquina = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setTitle("Configuración Máquina");

        tbl_Maquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_Maquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MaquinaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Maquina);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Borrar.setText("Borrar");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_DescripMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Salir)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DescripMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Borrar)
                    .addComponent(btn_Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String textoDescripcion = tf_DescripMaquina.getText();
        if (!textoDescripcion.isEmpty() && !ExisteMaquina(numMaquinaActual)) {
            Maquina maquina = new Maquina(textoDescripcion);
            maquinas.add(maquina);

            clearForm();
            
        }
        refreshTblMaquina();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        
        int res = JOptionPane.showConfirmDialog(this, "La máquina que desea borrar puede estar enlazada con programas de entrenamiento, ¿Desea borrar la máquina?");
        if(res == 0)
        {
            Maquina maquinaBorrar = new Maquina();
            for (Maquina maquina : maquinas) {
                if (maquina.getNumMaquina() == numMaquinaActual) {
                    maquinaBorrar = maquina;
                    break;
                }
            }
            removeMaquinaFromEverywhere(maquinaBorrar);
            maquinas.remove(maquinaBorrar);
            clearForm();
            
        }
        refreshTblMaquina();
        
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void tbl_MaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MaquinaMouseClicked
        int indexRow = tbl_Maquina.getSelectedRow();
        Object objetoNumMaquina = tbl_Maquina.getValueAt(indexRow, 0);
        numMaquinaActual = Long.parseLong(objetoNumMaquina.toString());
        String textoDescripcion = (String) tbl_Maquina.getValueAt(indexRow, 1);
        tf_DescripMaquina.setText(textoDescripcion);
    }//GEN-LAST:event_tbl_MaquinaMouseClicked

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConfignMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConfignMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConfignMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConfignMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConfignMaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_Maquina;
    private javax.swing.JTextField tf_DescripMaquina;
    // End of variables declaration//GEN-END:variables
}
