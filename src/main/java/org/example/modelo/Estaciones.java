package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Estaciones {

    private int id;
    private String nombre;
    private String linea;
    private int horaPico;
    private int tarifa;
    private String lugarEmblematicoDeLaZona;
    private String urllFoto;

    public Estaciones() {
    }

    public Estaciones(int id, String nombre, String linea, int horaPico, int tarifa, String lugarEmblematicoDeLaZona, String urllFoto) {
        this.id = id;
        this.nombre = nombre;
        this.linea = linea;
        this.horaPico = horaPico;
        this.tarifa = tarifa;
        this.lugarEmblematicoDeLaZona = lugarEmblematicoDeLaZona;
        this.urllFoto = urllFoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {this.linea = linea;}

    public int getHoraPico() {
        return horaPico;
    }

    public void setHoraPico(int horaPico) {
        this.horaPico = horaPico;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa= tarifa;
    }

    public String getLugarEmblematicoDeLaZona() {
        return lugarEmblematicoDeLaZona;
    }

    public void setLugarEmblematicoDeLaZona(String lugarEmblematicoDeLaZona) {
        this.lugarEmblematicoDeLaZona = lugarEmblematicoDeLaZona;
    }

    public String getUrllFoto() {
        return urllFoto;
    }

    public void setUrllFoto(String urllFoto) {
        this.urllFoto = urllFoto;
    }

    @Override
    public String toString() {
        return "Estaciones{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", linea='" + linea + '\'' +
                ", horaPico=" + horaPico +
                ", tarifa=" + tarifa +
                ", lugarEmblematicoDeLaZona='" + lugarEmblematicoDeLaZona + '\'' +
                ", urllFoto='" + urllFoto + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL urlImagen = new URL(this.urllFoto);
        return new ImageIcon(urlImagen);
    }
}
