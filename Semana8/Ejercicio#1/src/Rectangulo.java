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

public class Rectangulo extends Paralelogramo{
    public double calcularArea(){
        double area;
        area = ladoA * ladoB;
        return area;
    }
}