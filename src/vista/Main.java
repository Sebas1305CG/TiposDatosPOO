/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Lenovo.User
 */
public class Main {
    public static void main(String[] args) {
        //TIPOS DE DATOS
        //1.- ENTEROS
        
         int numeroUno=0;//=>publica
         int numeroDos=0;
         //Sobreescribir 
        numeroUno=8;
        numeroDos=19;         
         //1.- Suma de 2 numeros
         int resultado=numeroUno+numeroDos;
         //IMPRIMIR CADENA 
         System.out.println("El resultado es:"+resultado);
         //3.- Suma de 2 numeros 
         Scanner es=new Scanner(System.in);
                 System.out.println("Ingrese numero 1:");
                 int num1=Integer.parseInt(es.next());
                 System.out.println("Ingrese numero 2:");
            int num2=es.nextInt();
            num1+=num2; 
            System.out.println("El resultado es:"+num1);
         //TRANSFORMAR DE CADENA A UN ENTERO
         String cadena="La suma de 2 numeros enteros es:";
         System.out.println("Ingrese numero 1:");
         double n1=Double.parseDouble(es.next());
         System.out.println("Ingrese numero 2:");
         int n2=es.nextInt();
         double resul=n1+n2;
         //Cualquier tipo de dato a cadena
         cadena+=resul+"";
    }
}
