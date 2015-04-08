/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author will
 */

import Fitness.Paciente;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "ListWrapper")
public class ListWrapper {
    
    @ElementList(name="pacientes")
    private List<Paciente> pacientes;
    
    public ListWrapper()
    {
        
    }

    public ListWrapper(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    
    public void setPacientes()
    {
        
    }
    
}
