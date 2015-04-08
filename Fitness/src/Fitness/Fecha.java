/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class Fecha {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Anio);
        hash = 97 * hash + Objects.hashCode(this.Mes);
        hash = 97 * hash + Objects.hashCode(this.Dia);
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
        final Fecha other = (Fecha) obj;
        if (!Objects.equals(this.Anio, other.Anio)) {
            return false;
        }
        if (!Objects.equals(this.Mes, other.Mes)) {
            return false;
        }
        if (!Objects.equals(this.Dia, other.Dia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Anio+"-"+Mes+"-"+Dia;
    }
    
    public Fecha(){
        
    }
    public Fecha(LocalDate pFecha){
        Anio = Integer.toString(pFecha.getYear());
        Mes = Integer.toString(pFecha.getMonthValue());
        Mes = Mes.length() < 2 ? "0" + Mes : Mes;
        Dia = Integer.toString(pFecha.getDayOfMonth());
        Dia = Dia.length() < 2 ? "0" + Dia : Dia;
    }
    
    public Fecha(String pDia, String pMes, String pAnio){
        Anio = pAnio;
        Mes = pMes;
        Dia = pDia;
        
    }
    
    public Fecha(String pFechaString)
    {
        String[] fechaArray = pFechaString.split("-");
        Anio = fechaArray[0];
        Mes = fechaArray[1];
        Dia = fechaArray[2];
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
    
    public boolean EsFechaMenor(Fecha pFecha)
    {
        boolean res = false;
        
        LocalDate fechaBase = LocalDate.parse(this.toString());
        LocalDate fechaAComparar = LocalDate.parse(pFecha.toString());
        
        res = fechaBase.isBefore(fechaAComparar);
        
        return res;
    }
}