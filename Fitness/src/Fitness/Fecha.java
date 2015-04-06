/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;

/**
 *
 * @author admin
 */
public class Fecha {
    
    public Fecha(){
        
    }
    public Fecha(String pDia, String pMes, String pAnio){
        Anio = pAnio;
        Mes = pMes;
        Dia = pDia;
        
    }
    private String Anio;
    private String Mes;
    private String Dia;
    
    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return Mes;
    }

    public String getDia() {
        return Dia;
    }
    
    
    public String getAnio() {
        return Anio;
    }
    
    public void setAnio(String Anio) {
        this.Anio = Anio;
    }
}