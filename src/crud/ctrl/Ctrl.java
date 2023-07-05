/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.ctrl;

import crud.ui.VistaOpciones;
import crud.ui.VistaPrincipal;
import crud.ui.tablas.TablaPersona;
import data.DataBase;
import java.util.ArrayList;
import java.util.Collections;
/**
 * La clase Ctrl es el controlador del programa,
 * ya que este es el encargado de organizar las
 * funcionalidades de la aplicaion.
 *
 * @author Angel Misael Uscanga Lopez.
 */
public class Ctrl {
    
    public Ctrl (){
        this.visualisarOpciones();
    }
    
    public void visualisarOpciones(){
        VistaOpciones frmOpciones = new VistaOpciones();
        frmOpciones.setControl(this);
        frmOpciones.setVisible(true);
    }
    
    /*
    Cuando se selecciona la carga de datos por memoria, esta se hace de forma
    mas directa, en cambio si se slecciona la obcion con base de datos, esta
    tiene que pasar por las diferente capas de la arquitectura.
    */
    private ArrayList obtenerDatosEnMemoria (){
        ArrayList listaPersona = new ArrayList();
        Collections.addAll(listaPersona, DataBase.dataBase);
        return listaPersona;
    }
    
    public void cargarDatos(String tipoAlmacenamiento,VistaOpciones frmOpciones){
        switch(tipoAlmacenamiento){
            case "Almacenamiento-Memoria":
                VistaPrincipal frmPrincipal = new VistaPrincipal();
                frmPrincipal.cargarDatosTabla(obtenerDatosEnMemoria());
                frmPrincipal.setControl(this);
                frmPrincipal.setTipoAlmacenamiento(tipoAlmacenamiento);
                frmOpciones.dispose();
                frmPrincipal.setVisible(true);
            break;
            case "Almacenamiento-BD":
            break;
        }
    }
    
    public void eliminarDato(String tipoAlmacenamiento,TablaPersona modeloTabla,int indiceFila){
        if ("Almacenamiento-Memoria".equals(tipoAlmacenamiento))
            modeloTabla.eliminarElemento(indiceFila);
    }
    
    public void buscarDatoId(String tipoAlmacenamiento,TablaPersona modeloTabla,String id){
        switch(tipoAlmacenamiento){
            case "Almacenamiento-Memoria":
                
            break;
            case "Almacenamiento-BD":
            break;
        }
    }
}
