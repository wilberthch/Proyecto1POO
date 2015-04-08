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
public class Medida {
    
    private double estatura;
    private double peso;
    private double triceps;
    private double subescapular;
    private double abdomen;
    private double iliaco;
    private double muslo;
    private double pantorrilla;
    private double cuello;
    private double bicepDer;
    private double bicepIzq;
    private double pectoral;
    private double pectoralCircum;

    private double espalda;
    private double cintura1;
    private double cintura2;
    private double cintura3;
    private double cadera;
    private double musloDerecho;
    private double musloIzquierdo;
    private double pantorrillaDerecha;
    private double pantorrillaIzquierda;
    private int frecuenciaCardiacaReposo;
    private double presionArterialSistolica;
    private double presionArterialDiastolica;

    private Fecha fechaMedida;

    
    
    public void setPectoralCircum(double pectoralCircum) {
        this.pectoralCircum = pectoralCircum;
    }

    public double getPectoralCircum() {
        return pectoralCircum;
    }
    public void setCuello(double cuello) {
        this.cuello = cuello;
    }

    public void setBicepDer(double bicepDer) {
        this.bicepDer = bicepDer;
    }

    public void setBicepIzq(double bicepIzq) {
        this.bicepIzq = bicepIzq;
    }

    public double getCuello() {
        return cuello;
    }

    public double getBicepDer() {
        return bicepDer;
    }

    public double getBicepIzq() {
        return bicepIzq;
    }
    


    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTriceps() {
        return triceps;
    }

    public void setTriceps(double triceps) {
        this.triceps = triceps;
    }

    public double getSubescapular() {
        return subescapular;
    }

    public void setSubescapular(double subescapular) {
        this.subescapular = subescapular;
    }

    public double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(double abdomen) {
        this.abdomen = abdomen;
    }

    public double getIliaco() {
        return iliaco;
    }

    public void setIliaco(double iliaco) {
        this.iliaco = iliaco;
    }

    public double getMuslo() {
        return muslo;
    }

    public void setMuslo(double muslo) {
        this.muslo = muslo;
    }

    public double getPantorrilla() {
        return pantorrilla;
    }

    public void setPantorrilla(double pantorrilla) {
        this.pantorrilla = pantorrilla;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.fechaMedida);
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
        final Medida other = (Medida) obj;
        if (!Objects.equals(this.fechaMedida, other.fechaMedida)) {
            return false;
        }
        return true;
    }

    public double getPectoral() {
        return pectoral;
    }

    public void setPectoral(double pectoral) {
        this.pectoral = pectoral;
    }

    public double getEspalda() {
        return espalda;
    }

    public void setEspalda(double espalda) {
        this.espalda = espalda;
    }

    public double getCintura1() {
        return cintura1;
    }

    public void setCintura1(double cintura1) {
        this.cintura1 = cintura1;
    }

    public double getCintura2() {
        return cintura2;
    }

    public void setCintura2(double cintura2) {
        this.cintura2 = cintura2;
    }

    public double getCintura3() {
        return cintura3;
    }

    public void setCintura3(double cintura3) {
        this.cintura3 = cintura3;
    }

    public double getCadera() {
        return cadera;
    }

    public void setCadera(double cadera) {
        this.cadera = cadera;
    }

    public double getMusloDerecho() {
        return musloDerecho;
    }

    public void setMusloDerecho(double musloDerecho) {
        this.musloDerecho = musloDerecho;
    }

    public double getMusloIzquierdo() {
        return musloIzquierdo;
    }

    public void setMusloIzquierdo(double musloIzquierdo) {
        this.musloIzquierdo = musloIzquierdo;
    }

    public double getPantorrillaDerecha() {
        return pantorrillaDerecha;
    }

    public void setPantorrillaDerecha(double pantorrillaDerecha) {
        this.pantorrillaDerecha = pantorrillaDerecha;
    }

    public double getPantorrillaIzquierda() {
        return pantorrillaIzquierda;
    }

    public void setPantorrillaIzquierda(double pantorrillaIzquierda) {
        this.pantorrillaIzquierda = pantorrillaIzquierda;
    }

    public int getFrecuenciaCardiacaReposo() {
        return frecuenciaCardiacaReposo;
    }

    public void setFrecuenciaCardiacaReposo(int frecuenciaCardiacaReposo) {
        this.frecuenciaCardiacaReposo = frecuenciaCardiacaReposo;
    }

    public double getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(double presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public double getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(double presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }
    
    
    public double calcPorcentajeGrasaCorporal(int pEdad, char genero)
    {
        int sexo = 0;
        if (genero == 'M'){
            sexo = 1;
        }
        double IMC = peso / (estatura * estatura);
        double res = (1.20*IMC)+ (0.23*pEdad)-(10.8*sexo)-5.4;
        return res;
        
    }
    
    public double calcPorcentajeMasaMuscular()
    {
        double res = peso / (estatura * estatura);
        
        return res;
        
    }
    public double calcRelacionCinturaCadera(){
        double cintura = (cintura1+cintura2 +cintura3)/3;
        double res = cintura/cadera;
        return res;
    }
    
    public int calcFrecuenciaCard(int pEdad){
        int res = 220 - pEdad;
        return res;
    }


    public Fecha getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(Fecha fechaMedida) {
        this.fechaMedida = fechaMedida;
    }
}
