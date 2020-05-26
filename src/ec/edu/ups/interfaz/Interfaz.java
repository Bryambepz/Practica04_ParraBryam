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
import java.awt.GridLayout;
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
        GridLayout tabla=new GridLayout(5,0);
        BorderLayout borde=new BorderLayout();
        FlowLayout posicion=new FlowLayout(FlowLayout.CENTER);
        //Panel
        Panel panelPrincipal=new Panel(borde);
        Panel panelsub=new Panel(tabla);
        Panel panelsub2=new Panel(posicion);
        //Label
        Label Titulo=new Label("Registro de telefono");
        //Agregamos los botones
        panelsub.add(boton1);
        panelsub.add(boton2);
        panelsub.add(boton3);
        panelsub.add(boton4);
        panelsub.add(boton5);
        panelsub2.add(Titulo, posicion);
        //Agregar subpaneles al panel principal
        panelPrincipal.add(panelsub2,BorderLayout.NORTH);
        panelPrincipal.add(panelsub);
        //Agregar panel principal a la ventana
        ventanaRegistro.add(panelPrincipal,BorderLayout.CENTER);
        
        
        ventanaRegistro.setVisible(true);
    }
}
