package org.example.persistencia;

import org.example.modelo.Estaciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EstacionesDAO implements InterfazDAO{


    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO estacionesMetroCDMX(Nombre,Linea,Hora Pico,Tarifa,Lugar Emblematico de la Zona, URL) VALUES(?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("estacionesMetroCDMXDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Estaciones)obj).getNombre());
        pstm.setString(2,((Estaciones)obj).getLinea());
        pstm.setInt(3,((Estaciones)obj).getHoraPico());
        pstm.setInt(4,((Estaciones)obj).getTarifa());
        pstm.setString(5,((Estaciones)obj).getLugarEmblematicoDeLaZona());
        pstm.setString(6,((Estaciones)obj).getUrllFoto());
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE estacionesMetroCDMX SET Nombre = ?, Linea = ?, Hora Pico = ?, Tarifa = ?, Lugar Emblematico de la Zona = ?, URL = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("estacionesMetroCDMXDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Estaciones)obj).getNombre());
        pstm.setString(2,((Estaciones)obj).getLinea());
        pstm.setInt(3,((Estaciones)obj).getHoraPico());
        pstm.setInt(4,((Estaciones)obj).getTarifa());
        pstm.setString(5,((Estaciones)obj).getLugarEmblematicoDeLaZona());
        pstm.setString(6,((Estaciones)obj).getUrllFoto());
        pstm.setInt(7,((Estaciones)obj).getId());
        rowCount = pstm.executeUpdate();
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM estacionesMetroCDMX WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("estacionesMetroCDMXDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenertodo() throws SQLException {
        String sql = "SELECT * FROM estacionesMetroCDMX";
        ArrayList<Estaciones> resultado = new ArrayList<>();

        Statement stm = Conexion.getInstance("estacionesMetroCDMXDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            resultado.add(new Estaciones(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getInt(4),rst.getInt(5),rst.getString(6),rst.getString(7) ));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String Id) throws SQLException {
        String sql = "SELECT * FROM estacionesMetroCDMX WHERE id = ? ;";
        Estaciones estaciones = null;
        PreparedStatement pstm = Conexion.getInstance("estacionesMetroCDMXDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(Id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            estaciones = new Estaciones(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getInt(4),rst.getInt(5),rst.getString(6),rst.getString(7) );
            return estaciones;
        }
        return null;
    }
}





