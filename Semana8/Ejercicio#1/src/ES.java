/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan_jose.mora
 */
package javaapplication1;
import javax.swing.JOptionPane;
public class ES {//ES es una abreviación de EntradaSalida
    /*
     * Métodos para lectura de datos
     */
    public static int leerEntero(String msg){
        int entrada;
        entrada = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return entrada;
    }

    public static double leerReal(String msg){
        double entrada;
        entrada = Double.parseDouble(JOptionPane.showInputDialog(msg));
        return entrada;
    }

    public static char leerCaracter(String msg){
        char entrada;
        entrada = JOptionPane.showInputDialog(msg).charAt(0);
        return entrada;
    }

    public static String readCadena(String msg){
        String entrada;
        entrada = JOptionPane.showInputDialog(msg);
        return entrada;
    }

    /*
     * Métodos para despliegue de datos
     */
    public static void mostrar(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}