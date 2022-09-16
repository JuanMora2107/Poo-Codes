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
public class Paralelogramo {
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double ladoD;
    public Paralelogramo(){
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
        ladoD = 0;
    }

    public void asignarLadoA(double lA){
        ladoA = lA;
    }

    public void asignarLadoB(double lB){
        ladoB = lB;
    }
    
    public void asignarLadoC(double lC){
        ladoC = lC;
    }
    
    public void asignarLadoD(double lD){
        ladoD = lD;
    }
    
    public double obtenerLadoA(){
        return ladoA;
    }

    public double obtenerLadoB(){
        return ladoB;
    }
    
    public double obtenerLadoC(){
        return ladoC;
    }
   
    public double obtenerLadoD(){
        return ladoD;
    }
    
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 2*ladoA + 2*ladoB;
        perimetro = 2*ladoC + 2*ladoD;
        return perimetro;
    }


}
