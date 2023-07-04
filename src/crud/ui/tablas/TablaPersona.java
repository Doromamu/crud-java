/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.ui.tablas;

import crud.el.Persona;

/**
 *
 * @author misa6
 */
public class TablaPersona extends NuevoModeloTabla{

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int indexColumn) {
        return switch (indexColumn) {
            case 0 -> "id";
            case 1 -> "Nombre";
            case 2 -> "Apellido Paterno";
            case 3 -> "Apellido Materno";
            case 4 -> "Nombre de usuario";
            case 5 -> "Contraseña";
            default -> "Rol";
        };
    }

    @Override
    public Class<?> getColumnClass(int indexColumn) {
        return switch (indexColumn) {
            case 0 -> String.class;
            case 1 -> String.class;
            case 2 -> String.class;
            case 3 -> String.class;
            case 4 -> String.class;
            case 5 -> String.class;
            default -> String.class;
        };
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int indexROW, int indexCOLUMN) {
        Persona persona = (Persona) this.listaDeObjectos.get(indexROW);
        return switch (indexCOLUMN) {
            case 0 -> persona.getId();
            case 1 -> persona.getNombre();
            case 2 -> persona.getApellidoPaterno();
            case 3 -> persona.getApellidoMaterno();
            case 4 -> persona.getUsuario().getNombreUsuario();
            case 5 -> persona.getUsuario().getContrasena();
            default -> persona.getUsuario().getRol();
        };
    }

    @Override
    public void setValueAt(Object nuevoValor, int indexROW, int indexCOLUMN) {
        Persona persona = (Persona) this.listaDeObjectos.get(indexROW);
        switch(indexCOLUMN){
            case 0: persona.setId((String) nuevoValor);
            case 1: persona.setNombre((String) nuevoValor);
            case 2: persona.setApellidoPaterno((String) nuevoValor);
            case 3: persona.setApellidoMaterno((String) nuevoValor);
            case 4: persona.getUsuario().setNombreUsuario((String) nuevoValor);
            case 5: persona.getUsuario().setContrasena((String) nuevoValor);
            case 6: persona.getUsuario().setRol((String) nuevoValor);
        }
    }
    
}
