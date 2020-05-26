/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
/**
 *
 * @author braya
 */
public class Interfaz {
    public static void main(String[] args) {
        //Crear la ventana
        Frame ventanaRegistro=new Frame();
        ventanaRegistro.setTitle("Registro");
        ventanaRegistro.setLocation(500, 50);
        ventanaRegistro.setSize(600, 800);
        //Botones
        Button boton1=new Button("Registrar Telefono");
        Button boton2=new Button("Modificar Telefono");
        Button boton3=new Button("Buscar Telefono");
        Button boton4=new Button("Eliminar Telefono");
        Button boton5=new Button("Listar Telefonos");
        //Layouts
        BorderLayout borde=new BorderLayout();
        FlowLayout posicion=new FlowLayout();
        //Panel
        Panel panelPrincipal=new Panel();
        Panel panelsub=new Panel();
        //Label
        Label Titulo=new Label("Registro de telefono");
        //Agregar
        panelsub.add(Titulo);
        panelPrincipal.add(panelsub, BorderLayout.CENTER);
        ventanaRegistro.add(panelPrincipal);
        
        
        ventanaRegistro.setVisible(true);
    }
}
