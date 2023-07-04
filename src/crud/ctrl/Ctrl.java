/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.ctrl;

import crud.el.Persona;
import crud.ui.tablas.TablaPersona;
import data.DataBase;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author misa6
 */
public class Ctrl {
    
    public Ctrl (){
        
    }
    
    /*
    Cuando se selecciona la carga de datos por memoria, esta se hace de forma
    mas directa, en cambio si se slecciona la obcion con base de datos, esta
    tiene que pasar por las diferente capas de la arquitectura.
    */
    private ArrayList obtenerDatos (String tipoAlmacenamiento){
        ArrayList listaPersona = new ArrayList();
        if ("Almacenamiento-Memoria".equals(tipoAlmacenamiento))
            Collections.addAll(listaPersona, DataBase.dataBase);
        return listaPersona;
    }
    
    public void cargarDatos(String tipoAlmacenamiento,TablaPersona modeloTabla){
        modeloTabla.agregarLista(this.obtenerDatos(tipoAlmacenamiento));
    }
    
    public void eliminarDato(String tipoAlmacenamiento,TablaPersona modeloTabla){
        if ("Almacenamiento-Memoria".equals(tipoAlmacenamiento))
            
    }
}
