package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaEstaciones extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblLinea;
    private JLabel lblHoraPico;
    private JLabel lblTarifa;
    private JLabel lblLugar;
    private JLabel lblUrl;

//--------------------
    private JLabel Separacion;
    private JLabel lblNombreEdit;
    private JLabel lblLineaEdit;
    private JLabel lblHoraPicoEdit;
    private JLabel lblTarifaEdit;
    private JLabel lblLugarEmblematicoDeLaZonaEdit;
    private JLabel lblUrlEdit;

  //-----------------------------

    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtLinea;
    private JTextField txtHoraPico;
    private JTextField txtTarifa;
    private JTextField txtLugar;
    private JTextField txtUrl;

    //*****************
    private JTextField txtnombreEdit;
    private JTextField txtlineaEdit;
    private JTextField txthoraPicoEdit;
    private JTextField txttarifaEdit;
    private JTextField txtlugarEmblematicoDeLaZonaEdit;
    private JTextField txturlEdit;

    //***************************

    private JButton botonAdd;
    private JTable tabla;
    private JScrollPane scroll;

    //+++++++++++++++++++++++++++++
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    //++++++++++++++++++++++++++

    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    private JLabel imagenEstaciones;

    public VentanaEstaciones(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(232, 84, 12));
        lblId = new JLabel("Id: ");
        lblNombre = new JLabel("Nombre: ");
        lblLinea = new JLabel("Linea: ");
        lblHoraPico = new JLabel("Hora Pico: ");
        lblTarifa = new JLabel("Tarifa: ");
        lblLugar = new JLabel("Lugar Emblematico de la Zona: ");
        lblUrl = new JLabel("Url: ");

        txtId = new JTextField(5);
        txtId.setText("0");
        txtId.setEnabled(false);


        txtNombre = new JTextField(15);
        txtLinea = new JTextField(10);
        txtHoraPico = new JTextField(6);
        txtTarifa = new JTextField(6);
        txtLugar = new JTextField(30);
        txtUrl = new JTextField(40);

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblLinea);
        panel1.add(txtLinea);
        panel1.add(lblHoraPico);
        panel1.add(txtHoraPico);
        panel1.add(lblTarifa);
        panel1.add(txtTarifa);
        panel1.add(lblLugar);
        panel1.add(txtLugar);
        panel1.add(lblUrl);
        panel1.add(txtUrl);

        botonAdd = new JButton("Agregar");
        panel1.add(botonAdd);


        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(24, 102, 177));
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);



        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(231, 31, 39));
        imagenEstaciones =  new JLabel("....");
        panel3.add(imagenEstaciones);



        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(178, 172, 0));


        Separacion = new JLabel("-----------------------------------------------------------------------------------");
        lblNombreEdit = new JLabel("Escribe el nuevo Nombre: ");
        lblLineaEdit = new JLabel("Escribe la nueva Linea: ");
        lblHoraPicoEdit = new JLabel("Escribe la nueva Hora Pico: ");
        lblTarifaEdit = new JLabel("Escribe la nueva tarfia: ");
        lblLugarEmblematicoDeLaZonaEdit = new JLabel("Escribe el nuevo mlugar emblematico: ");
        lblUrlEdit = new JLabel("Escribe el nuevo URL: ");
        txtnombreEdit = new JTextField(30);
        txtlineaEdit = new JTextField(3);
        txthoraPicoEdit = new JTextField(6);
        txttarifaEdit = new JTextField(40);
        txtlugarEmblematicoDeLaZonaEdit = new JTextField(40);
        txturlEdit = new JTextField(40);
        btnActualizar = new JButton("Actualizar");
        btnBorrar = new JButton("Borrar");
        //Agregar
        panel4.add(btnBorrar);
        panel4.add(Separacion);
        panel4.add(lblNombreEdit);
        panel4.add(txtnombreEdit);
        panel4.add(lblLineaEdit);
        panel4.add(txtlineaEdit);
        panel4.add(lblHoraPicoEdit);
        panel4.add(txthoraPicoEdit);
        panel4.add(lblTarifaEdit);
        panel4.add(txttarifaEdit);
        panel4.add(lblLugarEmblematicoDeLaZonaEdit);
        panel4.add(txtlugarEmblematicoDeLaZonaEdit);
        panel4.add(lblUrlEdit);
        panel4.add(txturlEdit);
        panel4.add(btnActualizar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblLinea() {
        return lblLinea;
    }

    public void setLblLinea(JLabel lblLinea) {
        this.lblLinea = lblLinea;
    }

    public JLabel getLblHoraPico() {
        return lblHoraPico;
    }

    public void setLblHoraPico(JLabel lblHoraPico) {
        this.lblHoraPico = lblHoraPico;
    }

    public JLabel getLblTarifa() {
        return lblTarifa;
    }

    public void setLblTarifa(JLabel lblTarifa) {
        this.lblTarifa = lblTarifa;
    }

    public JLabel getLblLugar() {
        return lblLugar;
    }

    public void setLblLugar(JLabel lblLugar) {
        this.lblLugar = lblLugar;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtLinea() {
        return txtLinea;
    }

    public void setTxtLinea(JTextField txtLinea) {
        this.txtLinea = txtLinea;
    }

    public JTextField getTxtHoraPico() {
        return txtHoraPico;
    }

    public void setTxtHoraPico(JTextField txtHoraPico) {
        this.txtHoraPico = txtHoraPico;
    }

    public JTextField getTxtTarifa() {
        return txtTarifa;
    }

    public void setTxtTarifa(JTextField txtTarifa) {
        this.txtTarifa = txtTarifa;
    }

    public JTextField getTxtLugar() {
        return txtLugar;
    }

    public void setTxtLugar(JTextField txtLugar) {
        this.txtLugar = txtLugar;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBotonAdd() {
        return botonAdd;
    }

    public void setBotonAdd(JButton botonAdd) {
        this.botonAdd = botonAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getImagenEstaciones() {
        return imagenEstaciones;
    }

    public void setImagenEstaciones(JLabel imagenEstaciones) {
        this.imagenEstaciones = imagenEstaciones;
    }
}
