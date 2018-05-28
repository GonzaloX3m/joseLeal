
package model;

import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TMViviendas implements TableModel{
    private List<Vivienda> viviendas;
    Data d;

    public TMViviendas(List<Vivienda> viviendas) throws ClassNotFoundException, SQLException {
        this.viviendas = viviendas;
        d = new Data();
    }

    public Vivienda getViviendas(int index) {
        return viviendas.get(index);
    }

    @Override
    public int getRowCount() {
         return viviendas.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "num_rol";
            case 1:
                return "Direccion";
            case 2:
                return "Cant_p";
            case 3:
                return "Cant_b";
            case 4:
                return "tipoVivienda";
            case 5:
                return "Precio";
            case 6:
                return "Estado";
                
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
         Vivienda v = viviendas.get(rowIndex);
         switch(columnIndex){
            case 0:
                return v.getNum_rol();
            case 1:
                return v.getDireccion();
            case 2:
                return v.getCant_piezas();
            case 3:
                return v.getCant_banos();
            case 4:
                return v.getPrecio(); 
            case 5:
                return v.getTipoVivienda();
            case 6:
                return v.getNueva();
                
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
