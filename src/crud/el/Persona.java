/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.el;

import java.util.Date;

/**
 *
 * @author misa6
 */
public class Persona {
    private String  id,
                    nombre,
                    apellidoPaterno,
                    apellidoMaterno;
    private Usuario usuario;

    public Persona(String id, String nombre, String apellidoPaterno, String apellidoMaterno, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;
    }
    
    public Persona(){
        
    }
    
    //Getters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
