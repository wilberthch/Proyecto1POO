/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;

/**
 *
 * @author will
 */
public class Ejercicio {
    /**
     * Representa el número de ejercicio
     */
    private String numEjercicio;
    /**
     * Representa la descripción del ejercicio
     */
    private String descripcion;
    /**
     * Representa el número de series que se deben hacer del ejercicio
     */
    private int numSeries;
    /**
     * Representa el número de repeticiones que deben realizar del ejercicio
     */
    private int numRepeticiones;
    /**
     * el primer peso que se usa ejercicio
     */
    private double peso1;
    /**
     * el segundo peso que se usa en el ejercicio
     */
    private double peso2;
    /**
     * el tercer peso que se usa en el ejercicio
     */
    private double peso3;
    /**
     * el tiempo de espera que se debe tomar en medio de cada serie
     */
    private int tiempoDescanso;
    
    /**
     * la maquina que se utiliza en el ejercicio
     */
    private Maquina maquina;

    /**
     * Obtiene el número de ejercicio
     * @return número de ejercicio
     */
    public String getNumEjercicio() {
        return numEjercicio;
    }

    /**
     * Asigna numero de ejercicio
     * @param numEjercicio número de ejercicio a asignar
     */
    public void setNumEjercicio(String numEjercicio) {
        this.numEjercicio = numEjercicio;
    }

    /**
     * Obtiene la descripción del ejercicio
     * @return descipción del ejercicio
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna la dirección del ejercicio
     * @param descripcion descripción del ejercicio
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    /**
     * Obtiene el número de series del ejercicio
     * @return número de series
     */
    public int getNumSeries() {
        return numSeries;
    }

    /**
     * Asigna el número de series del ejercicio
     * @param numSeries el número de series
     * @throws InternalEjercicioException El número de serie debe ser mayor a 0
     */
    public void setNumSeries(int numSeries) throws InternalEjercicioException {
        if(numSeries < 1)
        {
            throw new InternalEjercicioException("El número de serie debe ser mayor a 0");
        }
        this.numSeries = numSeries;
    }

    /**
     * Obtiene el número de repeticiones
     * @return número de repeticiones
     */
    public int getNumRepeticiones() {
        return numRepeticiones;
    }

    
    public void setNumRepeticiones(int numRepeticiones) throws InternalEjercicioException {
        this.numRepeticiones = numRepeticiones;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public double getPeso3() {
        return peso3;
    }

    public void setPeso3(double peso3) {
        this.peso3 = peso3;
    }

    public int getTiempoDescanso() {
        return tiempoDescanso;
    }

    public void setTiempoDescanso(int tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    
    
}
