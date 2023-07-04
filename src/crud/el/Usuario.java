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
public class Usuario {
    private String nombreUsuario,
                   contrasena,
                   rol;
    private Date fechaDeAlta;

    public Usuario(String nombreUsuario, String contrasena, String rol, Date fechaDeAlta) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.fechaDeAlta = fechaDeAlta;
    }
    
    public Usuario(){
        
    }

    //Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }
    
    //Setters

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }
    
}
