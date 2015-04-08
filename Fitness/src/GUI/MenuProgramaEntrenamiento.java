/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Fitness.Fecha;
import Fitness.Paciente;
import Fitness.ProgramaEntrenamiento;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author will
 */
public class MenuProgramaEntrenamiento extends javax.swing.JFrame {

    private Paciente pacienteActual;
    private ProgramaEntrenamiento proEntrenamientoActual;
    private final NonEditableTableModel proEntrenamientoTableModel = new NonEditableTableModel();
    private final String[] proEntrenamientoHeader = {"Titulo", "Fecha Creación"};
    
    /**
     * Creates new form MenuProgramaEntrenamiento
     * @param pPaciente
     */
    public MenuProgramaEntrenamiento(Paciente pPaciente) throws NullPointerException {
        initComponents();
        if(pPaciente == null)
        {
            throw new NullPointerException("No hay paciente seleccionado");
        }
        else
        {
            pacienteActual = pPaciente;
            refreshTblProEntrenamiento();
            cleanForm();
        }
        
        
        
    }
    
    public void cleanForm()
    {
        tf_Titulo.setText("");
        tf_Objetivo.setText("");
        
        cbx_DiaInicio.setSelectedIndex(0);
        cbx_MesInicio.setSelectedIndex(0);
        cbx_AnioInicio.setSelectedIndex(0);
        cbx_DiaFin.setSelectedIndex(0);
        cbx_MesFin.setSelectedIndex(0);
        cbx_AnioFin.setSelectedIndex(0);
        
        spr_ControlAsistencia.setValue((Object)0);
        Fecha fechaCreacion = new Fecha(LocalDate.now());
        lbl_FechaCreacion.setText(fechaCreacion.toString());
        
        
    }
    
    public Paciente getPacienteActual() {
        return pacienteActual;
    }

    public void setPacienteActual(Paciente pacienteActual) {
        this.pacienteActual = pacienteActual;
    }
    
    public void refreshTblProEntrenamiento() throws NullPointerException
    {
        ArrayList<ProgramaEntrenamiento> programasEntrenamiento = pacienteActual.getProgramaEntrenamientoList();
        int rowSize = programasEntrenamiento.size();
        String[][] proEntrenamientoDatos = new String[rowSize][2];
        
        for(int index = 0; index < rowSize; index++)
        {
            ProgramaEntrenamiento proEntrenamiento = programasEntrenamiento.get(index);
            proEntrenamientoDatos[index][0] = proEntrenamiento.getTitulo();
            proEntrenamientoDatos[index][1] = proEntrenamiento.getFechaCreacion().toString();
        }
        
        proEntrenamientoTableModel.setDataVector(proEntrenamientoDatos, proEntrenamientoHeader);
        tbl_programaEntrenamiento.setModel(proEntrenamientoTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_programaEntrenamiento = new javax.swing.JTable();
        cbx_DiaInicio = new javax.swing.JComboBox();
        cbx_MesInicio = new javax.swing.JComboBox();
        cbx_DiaFin = new javax.swing.JComboBox();
        cbx_MesFin = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lbl_FechaCreacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_Titulo = new javax.swing.JTextField();
        tf_Objetivo = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spr_ControlAsistencia = new javax.swing.JSpinner();
        cbx_AnioInicio = new javax.swing.JComboBox();
        cbx_AnioFin = new javax.swing.JComboBox();
        btn_Ejercicios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Programa Entrenamiento");

        tbl_programaEntrenamiento.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_programaEntrenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_programaEntrenamientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_programaEntrenamiento);

        cbx_DiaInicio.setMaximumRowCount(31);
        cbx_DiaInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbx_DiaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_DiaInicioActionPerformed(evt);
            }
        });

        cbx_MesInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbx_MesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_MesInicioActionPerformed(evt);
            }
        });

        cbx_DiaFin.setMaximumRowCount(31);
        cbx_DiaFin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbx_DiaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_DiaFinActionPerformed(evt);
            }
        });

        cbx_MesFin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbx_MesFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_MesFinActionPerformed(evt);
            }
        });

        jLabel1.setLabelFor(lbl_FechaCreacion);
        jLabel1.setText("Fecha Creación");

        lbl_FechaCreacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_FechaCreacion.setText("jLabel1");

        jLabel4.setLabelFor(tf_Titulo);
        jLabel4.setText("Titulo");

        jLabel5.setLabelFor(tf_Objetivo);
        jLabel5.setText("Objetivo");

        jLabel6.setLabelFor(cbx_DiaInicio);
        jLabel6.setText("Fecha Inicio");

        jLabel7.setLabelFor(cbx_DiaFin);
        jLabel7.setText("Fecha Final");

        tf_Titulo.setToolTipText("Titulo");

        tf_Objetivo.setToolTipText("Objetivo");

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Borrar.setText("Borrar");
        btn_Borrar.setToolTipText("");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Control Asistencia");

        spr_ControlAsistencia.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        cbx_AnioInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915" }));
        cbx_AnioInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_AnioInicioActionPerformed(evt);
            }
        });

        cbx_AnioFin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915" }));
        cbx_AnioFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_AnioFinActionPerformed(evt);
            }
        });

        btn_Ejercicios.setText("Ejercicios");
        btn_Ejercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EjerciciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbx_DiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_FechaCreacion)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbx_MesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbx_AnioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_Objetivo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(tf_Titulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_Ejercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Borrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_Cancelar)))
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_DiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spr_ControlAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_MesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_AnioFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_FechaCreacion))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tf_Objetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_DiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_MesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_AnioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_DiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_MesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_AnioFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spr_ControlAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_Borrar))
                .addGap(18, 18, 18)
                .addComponent(btn_Ejercicios)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_DiaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_DiaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_DiaInicioActionPerformed

    private void cbx_MesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_MesInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_MesInicioActionPerformed

    private void cbx_DiaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_DiaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_DiaFinActionPerformed

    private void cbx_MesFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_MesFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_MesFinActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Fecha fechaInicio = 
                new Fecha((String)cbx_DiaInicio.getSelectedItem(), 
                        (String)cbx_MesInicio.getSelectedItem(), 
                        (String)cbx_AnioInicio.getSelectedItem());
        
        Fecha fechaFin = 
                new Fecha((String)cbx_DiaFin.getSelectedItem(), 
                        (String)cbx_MesFin.getSelectedItem(),
                        (String)cbx_AnioFin.getSelectedItem());
        
        String titulo = tf_Titulo.getText();
        String objetivo = tf_Objetivo.getText();
        
        boolean esFormValido = true;
        
        esFormValido &= !titulo.isEmpty();
        esFormValido &= !objetivo.isEmpty();
        esFormValido &= !fechaFin.EsFechaMenor(fechaInicio);
        
        if(esFormValido)
        {
            try
            {
                proEntrenamientoActual.setTitulo(titulo);
                proEntrenamientoActual.setObjetivo(objetivo);
                proEntrenamientoActual.setFechaInicio(fechaInicio);
                proEntrenamientoActual.setFechaFinal(fechaFin);
                proEntrenamientoActual.setControlAsistencia((Integer)spr_ControlAsistencia.getValue());
            }
            catch(NullPointerException ex)
            {
                proEntrenamientoActual = new ProgramaEntrenamiento();
                proEntrenamientoActual.setTitulo(titulo);
                proEntrenamientoActual.setObjetivo(objetivo);
                proEntrenamientoActual.setFechaInicio(fechaInicio);
                proEntrenamientoActual.setFechaFinal(fechaFin);
                proEntrenamientoActual.setControlAsistencia((Integer)spr_ControlAsistencia.getValue());
                pacienteActual.arregarProgramaEntrenamiento(proEntrenamientoActual);
                
            }
            
            
            System.out.println("Paciente: " + pacienteActual.getNombre());
            proEntrenamientoActual = null;
            refreshTblProEntrenamiento();
            cleanForm();
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El formulario contiene datos invalidos, No se pudo guardar la información");
        }
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void cbx_AnioInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_AnioInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_AnioInicioActionPerformed

    private void cbx_AnioFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_AnioFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_AnioFinActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        
        pacienteActual.eliminarProgramaEntrenamiento(proEntrenamientoActual);
        
        cleanForm();
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void tbl_programaEntrenamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_programaEntrenamientoMouseClicked
        int indexRow = tbl_programaEntrenamiento.getSelectedRow();
        String titulo = (String)tbl_programaEntrenamiento.getValueAt(indexRow, 0);
        String fechaString = (String)tbl_programaEntrenamiento.getValueAt(indexRow, 1);
        Fecha fechaCreacion = new Fecha(fechaString);
        
        try
        {
            proEntrenamientoActual = pacienteActual.getProgramaEntrenamiento(titulo, fechaCreacion);
            
            lbl_FechaCreacion.setText(proEntrenamientoActual.getFechaCreacion().toString());
            tf_Titulo.setText(proEntrenamientoActual.getTitulo());
            tf_Objetivo.setText(proEntrenamientoActual.getObjetivo());
            
            Fecha fechaInicio = proEntrenamientoActual.getFechaInicio();
            cbx_DiaInicio.setSelectedItem((Object)fechaInicio.getDia());
            cbx_MesInicio.setSelectedItem((Object)fechaInicio.getMes());
            cbx_AnioInicio.setSelectedItem((Object)fechaInicio.getAnio());
            
            Fecha fechaFin = proEntrenamientoActual.getFechaFinal();
            cbx_DiaFin.setSelectedItem((Object)fechaFin.getDia());
            cbx_MesFin.setSelectedItem((Object)fechaFin.getMes());
            cbx_AnioFin.setSelectedItem((Object)fechaFin.getAnio());
            
            spr_ControlAsistencia.setValue((Object)proEntrenamientoActual.getControlAsistencia());
            
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_tbl_programaEntrenamientoMouseClicked

    private void btn_EjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EjerciciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EjerciciosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProgramaEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProgramaEntrenamiento(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Ejercicios;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JComboBox cbx_AnioFin;
    private javax.swing.JComboBox cbx_AnioInicio;
    private javax.swing.JComboBox cbx_DiaFin;
    private javax.swing.JComboBox cbx_DiaInicio;
    private javax.swing.JComboBox cbx_MesFin;
    private javax.swing.JComboBox cbx_MesInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_FechaCreacion;
    private javax.swing.JSpinner spr_ControlAsistencia;
    private javax.swing.JTable tbl_programaEntrenamiento;
    private javax.swing.JTextField tf_Objetivo;
    private javax.swing.JTextField tf_Titulo;
    // End of variables declaration//GEN-END:variables

    
}
