/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.descripcion);
        hash = 13 * hash + (int) (this.numMaquina ^ (this.numMaquina >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Maquina other = (Maquina) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (this.numMaquina != other.numMaquina) {
            return false;
        }
        return true;
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
