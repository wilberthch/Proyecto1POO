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
    private int numMaquina;
    
    private static int canMaquinas;
    
    public Maquina()
    {
        
        numMaquina = ++canMaquinas;
    }
    
}
