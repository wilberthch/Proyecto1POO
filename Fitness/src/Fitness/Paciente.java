/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import Fitness.Fecha;
/**
 *
 * @author will
 */
@Root
public class Paciente {
    

    public Paciente()
    {
        
    }
    
    public Paciente(String nombre, char sexo, String email, String telefono, String cedula, Medida medida, Fecha fechadenacimiento) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.email = email;
        this.telefono = telefono;
        this.cedula = cedula;
        this.medida = medida;
        this.fechadenacimiento = fechadenacimiento;
    }
    
    @Element(required=false)
    private String nombre;
    
    @Element(required=false)
    private char sexo;
    
    @Element(required=false)
    private String email;
    
    
    @Element(required=false)
    private String telefono;
    
    @Attribute(required=false)
    private String cedula;
    
    @Element(required=false)
    private Medida medida;
    
    @Element(required=false)
    private Fecha fechadenacimiento = new Fecha();
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the medida
     */
    public Medida getMedida() {
        return medida;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida(Medida medida) {
        this.medida = medida;
    }
    /**
     * @param fechadenacimiento the fechadenacimiento to set
     */
    public void setFechadeNacimiento(String pDia,String pMes,String pAnio){
        fechadenacimiento.setDia(pDia);
        fechadenacimiento.setMes(pMes);
        fechadenacimiento.setAnio(pAnio);
    }
    
    /**
     * @return the fechadenacimiento
     */
    public String getDiaFechadeNacimiento(){
        return fechadenacimiento.getDia();
    }
    public String getMesFechadeNacimiento(){
        return fechadenacimiento.getMes();
    }
    public String getAnioFechadeNacimiento(){
        return fechadenacimiento.getAnio();
    }
}
