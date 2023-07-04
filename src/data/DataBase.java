/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import crud.el.Persona;
import crud.el.Usuario;

/**
 *
 * @author misa6
 */
public class DataBase {
    public final static Persona dataBase [] = {
      new Persona (
              "34432",
              "Angel",
              "Uscanga",
              "Lopez",
              new Usuario(
                      "Doromamu",
                      "Misa1234",
                      "Administrador"
              )
      ),
      new Persona(
              "21432",
              "Misa",
              "Uscanga",
              "Lopez",
              new Usuario(
                      "El Michi",
                      "Angel",
                      "Administrador"
              )
      )
    };
    
    public DataBase(){
        
    }
    
}
