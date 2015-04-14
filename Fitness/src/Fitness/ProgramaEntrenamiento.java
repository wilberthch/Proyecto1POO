/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author will
 */
public class ProgramaEntrenamiento {
    
    private Fecha fechaCreacion;
    private String titulo;
    private String objetivo;
    private Fecha fechaInicio;
    private Fecha fechaFinal;
    private int controlAsistencia;
    private ArrayList<ArrayList<Ejercicio>> diasEjercicio;
    
    public ProgramaEntrenamiento()
    {
        fechaCreacion = new Fecha(LocalDate.now());
        diasEjercicio = new ArrayList<>();
        
    }

    /**
     * @return the fechaCreacion
     */
    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the fechaInicio
     */
    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public Fecha getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Fecha fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the controlAsistencia
     */
    public int getControlAsistencia() {
        return controlAsistencia;
    }

    /**
     * @return the diasEjercicio
     */
    public ArrayList<ArrayList<Ejercicio>> getDiasEjercicio() {
        return diasEjercicio;
    }

    /**
     * @param diasEjercicio the diasEjercicio to set
     */
    public void setDiasEjercicio(ArrayList<ArrayList<Ejercicio>> diasEjercicio) {
        this.diasEjercicio = diasEjercicio;
    }

    /**
     * @param controlAsistencia the controlAsistencia to set
     */
    public void setControlAsistencia(int controlAsistencia) {
        this.controlAsistencia = controlAsistencia;
    }
    
    
}
