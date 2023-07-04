package crud.ui.tablas;

import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public abstract class NuevoModeloTabla implements TableModel {

    protected ArrayList<Object> listaDeObjectos = new ArrayList();
    protected ArrayList<TableModelListener> listaDeOyentes = new ArrayList<TableModelListener>();

    
    /*
        *********this.avisarOyente(new TableModelEvent(this));*********
        Con esta linea de codigo avisamos al listener que haga un camcio
        en toda la tabla, se hace de esta forma para no estar especificando
        los cambios.
    */
    public void agregarLista(ArrayList nuevaLista) {
        if (nuevaLista != null) {
            this.listaDeObjectos = nuevaLista;
            this.avisarOyente(new TableModelEvent(this)); 
        }
    }
    
    public void eliminarElemento(int indiceFila){
        if(indiceFila >= 0){
            this.listaDeObjectos.remove(indiceFila);
            this.avisarOyente(new TableModelEvent(this));
        }
    }
    
    public void agrgarElemento(Object nuevoElemento){
        if (nuevoElemento != null){
            this.listaDeObjectos.add(nuevoElemento);
            this.avisarOyente(new TableModelEvent(this));
        }
    }
    
    public void limpiarTabla (){
        if(!this.listaDeObjectos.isEmpty())
            this.listaDeObjectos.clear();
    }
            

    @Override
    public int getRowCount() {
        return this.listaDeObjectos.size();
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        this.listaDeOyentes.remove(tl);
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        this.listaDeOyentes.add(tl);
    }

    protected void avisarOyente(TableModelEvent nuevoEvento) {
        this.listaDeOyentes.get(0).tableChanged(nuevoEvento);
    }
}
