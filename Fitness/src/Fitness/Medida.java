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
public class Medida {
    
    private double estatura;
    private double peso;
    private int triceps;
    private int subescapular;
    private int abdomen;
    private int iliaco;
    private int muslo;
    private int pantorrilla;
    private int pectoral;
    private int espalda;
    private int cintura1;
    private int cintura2;
    private int cintura3;
    private int cadera;
    private int musloDerecho;
    private int musloIzquierdo;
    private int pantorrillaDerecha;
    private int pantorrillaIzquierda;
    private int frecuenciaCardiacaReposo;
    private int presionArterialSistolica;
    private int presionArterialDiastolica;

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

    public int getTriceps() {
        return triceps;
    }

    public void setTriceps(int triceps) {
        this.triceps = triceps;
    }

    public int getSubescapular() {
        return subescapular;
    }

    public void setSubescapular(int subescapular) {
        this.subescapular = subescapular;
    }

    public int getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(int abdomen) {
        this.abdomen = abdomen;
    }

    public int getIliaco() {
        return iliaco;
    }

    public void setIliaco(int iliaco) {
        this.iliaco = iliaco;
    }

    public int getMuslo() {
        return muslo;
    }

    public void setMuslo(int muslo) {
        this.muslo = muslo;
    }

    public int getPantorrilla() {
        return pantorrilla;
    }

    public void setPantorrilla(int pantorrilla) {
        this.pantorrilla = pantorrilla;
    }

    public int getPectoral() {
        return pectoral;
    }

    public void setPectoral(int pectoral) {
        this.pectoral = pectoral;
    }

    public int getEspalda() {
        return espalda;
    }

    public void setEspalda(int espalda) {
        this.espalda = espalda;
    }

    public int getCintura1() {
        return cintura1;
    }

    public void setCintura1(int cintura1) {
        this.cintura1 = cintura1;
    }

    public int getCintura2() {
        return cintura2;
    }

    public void setCintura2(int cintura2) {
        this.cintura2 = cintura2;
    }

    public int getCintura3() {
        return cintura3;
    }

    public void setCintura3(int cintura3) {
        this.cintura3 = cintura3;
    }

    public int getCadera() {
        return cadera;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public int getMusloDerecho() {
        return musloDerecho;
    }

    public void setMusloDerecho(int musloDerecho) {
        this.musloDerecho = musloDerecho;
    }

    public int getMusloIzquierdo() {
        return musloIzquierdo;
    }

    public void setMusloIzquierdo(int musloIzquierdo) {
        this.musloIzquierdo = musloIzquierdo;
    }

    public int getPantorrillaDerecha() {
        return pantorrillaDerecha;
    }

    public void setPantorrillaDerecha(int pantorrillaDerecha) {
        this.pantorrillaDerecha = pantorrillaDerecha;
    }

    public int getPantorrillaIzquierda() {
        return pantorrillaIzquierda;
    }

    public void setPantorrillaIzquierda(int pantorrillaIzquierda) {
        this.pantorrillaIzquierda = pantorrillaIzquierda;
    }

    public int getFrecuenciaCardiacaReposo() {
        return frecuenciaCardiacaReposo;
    }

    public void setFrecuenciaCardiacaReposo(int frecuenciaCardiacaReposo) {
        this.frecuenciaCardiacaReposo = frecuenciaCardiacaReposo;
    }

    public int getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(int presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public int getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(int presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }
    
    
    public double calcPorcentajeMasaCorporal()
    {
        double res = peso * (estatura * estatura);
        
        return res;
        
    }
    
    public double calcPorcentajeMasaMuscular()
    {
        double res = peso * (estatura * estatura);
        
        return res;
        
    }
    
    
}
