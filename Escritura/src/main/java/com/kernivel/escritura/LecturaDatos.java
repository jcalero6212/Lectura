/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kernivel.escritura;

import java.util.Scanner;

/**
 *
 * @author Roberto Calero
 */
public class LecturaDatos {
    
    public static String LeerCadena(String cadena){
        String valor;
        Scanner teclado = new Scanner (System.in);
        System.out.println(cadena);
        valor = teclado.nextLine();
        return valor;
    }
    public static String LeerCadena(){
        String valor;
        Scanner teclado = new Scanner (System.in);
        System.out.println();
        valor = teclado.nextLine();
        return valor;
    }
    
    public static int LeerEntero(String v){
        boolean respuesta = true;
        int valor = 0;
        do {
            try{
                Scanner teclado = new Scanner(System.in);
                System.out.println();
                valor = teclado.nextInt();
                respuesta = false;
            }catch (Exception ex){
                System.out.println();
            }
        }while(respuesta);
        return valor;
    }
    
    public static int leerEntero(){
        boolean respuesta=true;
        int valor=0;
        do{
            try{
                Scanner teclado=new Scanner(System.in);
                System.out.println  ("Ingrese un entero");
                valor=teclado.nextInt();
                respuesta = false;
            }catch (Exception ex){
                System.out.println("INGRESE SOLO ENTEROS");
            }
        }while (respuesta);
        return valor;
    
    }
     public static int leerEntero(String cadena){
        boolean respuesta=true;
        int valor=0;
        do{
            try{
                Scanner teclado=new Scanner(System.in);
                System.out.println  (cadena);
                valor=teclado.nextInt();
                respuesta = false;
            }catch (Exception ex){
                System.out.println("INGRESE SOLO ENTEROS");
            }
        }while (respuesta);
        return valor;
}
     
     public static String leerpromedio(){
         boolean respuesta=true;
        double valor1=0,valor2=0;
        String promedio;
            try{
                Scanner teclado=new Scanner(System.in);
                System.out.println ("Ingrese nota primer parcial");
                valor1=teclado.nextDouble();
                System.out.println ("Ingrese nota segundo parcial");
                valor2=teclado.nextDouble();
                respuesta = false;
            }catch (Exception ex){
            }
         promedio = String.valueOf((valor1+valor2)/2);
         promedio = ";"+valor1+","+valor2+";"+promedio;
        return promedio;
     }
     public static String leertotal(){
         boolean respuesta=true;
        double valor1=0,valor2=0;
        String total;
            try{
                Scanner teclado=new Scanner(System.in);
                System.out.println ("Ingrese la cantidad");
                valor1=teclado.nextDouble();
                System.out.println ("Ingrese el precio");
                valor2=teclado.nextDouble();
                respuesta = false;
            }catch (Exception ex){
            }
         total = String.valueOf(valor1*valor2);
         total = "-"+valor1+"-"+valor2+"-"+total;
        return total;
     }
     public static String leerarea(){
         boolean respuesta=true;
        double valor1=0,valor2=0;
        String area;
            try{
                Scanner teclado=new Scanner(System.in);
                System.out.println ("Ingrese la base");
                valor1=teclado.nextDouble();
                System.out.println ("Ingrese la altura");
                valor2=teclado.nextDouble();
                respuesta = false;
            }catch (Exception ex){
            }
         area = String.valueOf((valor1*valor2)/2);
         area = valor1+"|"+valor2+"|"+area;
        return area;
     }
}