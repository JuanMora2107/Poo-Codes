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

import javaapplication1.Cuadrado;

public class Menu {
    private Cuadrado unCuadrado;
    private Rectangulo unRectangulo;
    private Rombo unRombo;
    private Romboide unRomboide;

    public Menu(){
        unCuadrado = new Cuadrado();
        unRectangulo = new Rectangulo();
        unRombo = new Rombo();
        unRomboide = new Romboide();
        
               
    }

    public void interactuarConUsuario(){
        int opcion;
        do{
            opcion = mostrarMenuYLeerOpcion();
            ejecutarOperacion(opcion);
        }while(opcion!=5);
    }

    private int mostrarMenuYLeerOpcion(){
        int opcion;
        String msg = "Menu\n"
                + "1. Calcular Área y Perimétro de Cuadrado\n"
                + "2. Calcular Área y Perímetro de Rectángulo\n"
                + "3. Calcular Área y Perímetro de Rombo\n"
                + "4. Calcular Área y Perímetro de Romboide\n"
                + "5. Salir";
        opcion = ES.leerEntero(msg);
        return opcion;
    }

    private void ejecutarOperacion(int opc){
        switch(opc){
            case 1:
                gestionarCuadrado();
            break;
            case 2:
                gestionarRectangulo();
            break;
            case 3:
                gestionarRombo();
            break;
            case 4:
                gestionarRomboide();
            break;
        }
    }

    private void gestionarCuadrado(){
        double lado = ES.leerReal("Digite el lado:");
        unCuadrado.asignarLado(lado);
        double p = unCuadrado.calcularPerimetro();
        double a = unCuadrado.calcularArea();
        ES.mostrar("El perímetro del cuadrado es: "+p+" y su área es: "+a);
    }

    private void gestionarRectangulo(){
        double ladoA = ES.leerReal("Digite la base:");
        double ladoB = ES.leerReal("Digite la altura:");
        unRectangulo.asignarLadoA(ladoA);
        unRectangulo.asignarLadoB(ladoB);
        double p = unRectangulo.calcularPerimetro();
        double a = unRectangulo.calcularArea();
        ES.mostrar("El perímetro del rectangulo es: "+p+" y su área es: "+a);
    }
    private void gestionarRombo(){
        double lado = ES.leerReal("Digite el lado:");
        unRombo.asignarLado(lado);
        double p = unRombo.calcularPerimetro();
        double a = unRombo.calcularArea();
        ES.mostrar("El perímetro del rombo es: "+p+" y su área es: "+a);
    }
    private void gestionarRomboide(){
        double ladoC = ES.leerReal("Digite la base:");
        double ladoD = ES.leerReal("Digite la altura:");
        unRomboide.asignarLadoC(ladoC);
        unRomboide.asignarLadoD(ladoD);
        double p = unRomboide.calcularPerimetro();
        double a = unRomboide.calcularArea();
        ES.mostrar("El perímetro del romboide es: "+p+" y su área es: "+a);
    }   


}