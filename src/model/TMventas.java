
package model;

import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TMventas implements TableModel {

   private List<Venta> listaVentas;
    Data d;

    public TMventas(List<Venta> listaVentas) throws ClassNotFoundException, SQLException {
        this.listaVentas = listaVentas;
        d = new Data();
    }

    public Venta getListaVentas(int index) {
        return listaVentas.get(index);
    }

    @Override
    public int getRowCount() {
         return listaVentas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "Cantidad De Casas";
            case 1:
                return "Cantidad De Departamentos";
            case 2:
                return "Cantidad De Ventas";
                default:
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Venta v = listaVentas.get(rowIndex);
         switch(columnIndex){
            case 0:
                return v.getFecha();
                default:
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
       
    }
    
}
