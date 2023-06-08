package org.example.modelo;

import org.example.persistencia.EstacionesDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaEstaciones implements TableModel {
    private ArrayList<Estaciones> datos;
    public static final int COLS=7;
    private EstacionesDAO estaDAO;

    public ModeloTablaEstaciones() {
        datos = new ArrayList<>();
    }

    public ModeloTablaEstaciones(ArrayList<Estaciones> datos) {
        this.datos = datos;
        estaDAO = new EstacionesDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreCol= "";
        switch (columnIndex){
            case 0:
                nombreCol="Id";
                break;
            case 1:
                nombreCol="Nombre";
                break;
            case 2:
                nombreCol="Linea";
                break;
            case 3:
                nombreCol="Hora Pico";
                break;
            case 4:
                nombreCol="Tarifa";
                break;
            case 5:
                nombreCol="Lugar Emblematico";
                break;
            case 6:
                nombreCol="URL";
                break;
            default:
                nombreCol = "";

        }

        return nombreCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estaciones tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getLinea();
            case 3:
                return tmp.getHoraPico();
            case 4:
                return tmp.getTarifa();
            case 5:
                return tmp.getLugarEmblematicoDeLaZona();
            case 6:
                return tmp.getUrllFoto();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setId( (Integer) aValue);
                break;
            case 1:
                datos.get(rowIndex).setNombre( (String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setLinea( (String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setHoraPico( (Integer) aValue);
                break;
            case 4:
                datos.get(rowIndex).setTarifa( (Integer) aValue);
                break;
            case 5:
                datos.get(rowIndex).setLugarEmblematicoDeLaZona( (String) aValue);
                break;
            case 6:
                datos.get(rowIndex).setUrllFoto( (String) aValue);
                break;
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void agregarEstaciones(Estaciones estaciones){
        datos.add(estaciones);
    }
    public Estaciones getestacionesAtIndex(int idx){
         return datos.get(idx);
    }

    public void cargarDatos (){


    }
}
