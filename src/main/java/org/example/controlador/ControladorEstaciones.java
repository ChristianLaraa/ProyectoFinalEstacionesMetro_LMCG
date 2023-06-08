package org.example.controlador;

import org.example.modelo.Estaciones;
import org.example.modelo.ModeloTablaEstaciones;
import org.example.vista.VentanaEstaciones;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorEstaciones  extends MouseAdapter {
    private VentanaEstaciones view;
    private ModeloTablaEstaciones modelo;

    public ControladorEstaciones(VentanaEstaciones view) {
        this.view = view;
        modelo = new ModeloTablaEstaciones();
        this.view.getBotonAdd().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        this.view.getTabla().setModel(modelo);

        /*******************************************
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
*/


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBotonAdd()) {
            System.out.println("Evento sobre boton Add");
            Estaciones estaciones = new Estaciones();
            estaciones.setId(Integer.parseInt(this.view.getTxtId().getText()));
            estaciones.setNombre(this.view.getTxtNombre().getText());
            estaciones.setLinea(this.view.getTxtLinea().getText());
            estaciones.setHoraPico(Integer.parseInt(this.view.getTxtHoraPico().getText()));
            estaciones.setTarifa(Integer.parseInt(this.view.getTxtTarifa().getText()));
            estaciones.setLugarEmblematicoDeLaZona(this.view.getTxtLugar().getText());
            estaciones.setUrllFoto(this.view.getTxtUrl().getText());

            modelo.agregarEstaciones((estaciones));
            this.view.getTabla().updateUI();

        }
        {
            if (e.getSource() == view.getTabla()) {
                System.out.println("Evento sobre tabla");

                int index = this.view.getTabla().getSelectedRow();
                Estaciones tmp = modelo.getestacionesAtIndex(index);

                try{
                    this.view.getImagenEstaciones().setIcon(tmp.getImagen());
                    this.view.getImagenEstaciones().setText("");
                }catch(MalformedURLException mfue){
                    System.out.println(e.toString());
                }

            }
        }
    }

}
