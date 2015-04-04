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

import java.io.File;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class PersistenciaDatos
{
    private final File archivo;
    private final Serializer serializador;
    
    public PersistenciaDatos(String pFileName)
    {
        archivo = new File(pFileName + ".xml");
        serializador = new Persister();
    }
    public void guardar(Object pDato) throws Exception
    {
        serializador.write(pDato, archivo);
        
        
    }
    
    public <T> T restaurarObjecto(T pTipo) throws Exception
    {
        T res = serializador.read(pTipo, archivo);
        return res;
    }
    
    public <T> T restaurarObjecto(Class<? extends T> pTipo) throws Exception
    {
        T res = serializador.read(pTipo, archivo);
        return res;
    }
}
