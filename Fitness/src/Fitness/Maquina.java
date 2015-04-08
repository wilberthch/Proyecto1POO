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
public class Maquina {
    
    private String descripcion;
    private final long numMaquina;
    
    private static long canMaquinas;

    public Maquina() {
        numMaquina = ++canMaquinas;
    }
    
    
    
    public Maquina(String pDescripcion)
    {
        descripcion = pDescripcion;
        numMaquina = ++canMaquinas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getNumMaquina() {
        return numMaquina;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
}
