/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espelady.ejemploherencia;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el valor del radio ");
        double radio;
        radio=leer.nextDouble();
        //Crear un objeto de la clase circulo
        Circulo circulo1=new Circulo(radio);
        
      //Imprimir el valor del area  
        System.out.println("El area del circulo es:  " + circulo1.CalcularArea());
        
        
        //Triangulo 
       System.out.println("Ingresar la base ");
       double base;
       base=leer.nextDouble();
       System.out.println("Ingresar la altura ");
       double altura;
       altura=leer.nextDouble();
       //Crear un objeto de la clase rectangulo
       Triangulo triangulo1=new Triangulo(base,altura);
       //Imprimir el valor del area
       System.out.println("El area del triangulo es: " + triangulo1.CalcularArea());
        
     
    }
}
