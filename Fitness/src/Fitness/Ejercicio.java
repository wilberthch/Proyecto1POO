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
    
    private String numEjercicio;
    private String descripcion;
    private int numSeries;
    private int numRepeticiones;
    private double peso1;
    private double peso2;
    private double peso3;
    private int tiempoDescanso;
    private Maquina maquina;

    public String getNumEjercicio() {
        return numEjercicio;
    }

    public void setNumEjercicio(String numEjercicio) {
        this.numEjercicio = numEjercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumSeries() {
        return numSeries;
    }

    public void setNumSeries(int numSeries) {
        this.numSeries = numSeries;
    }

    public int getNumRepeticiones() {
        return numRepeticiones;
    }

    public void setNumRepeticiones(int numRepeticiones) {
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
