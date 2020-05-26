/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import java.awt.Frame;

/**
 *
 * @author braya
 */
public class Interfaz {
    public static void main(String[] args) {
        Frame ventanaRegistro=new Frame();
        ventanaRegistro.setTitle("REgistro");
        ventanaRegistro.setLocation(500, 50);
        ventanaRegistro.setSize(600, 800);
        
        ventanaRegistro.setVisible(true);
    }
}
