/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kernivel.escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;/**
 *
 * @author Roberto Calero
 */
public class Lectura {
    public static void main (String[] args){
            //deberarchivo();
            //deberarchivo2();
            //deberarchivo3();
            //deberarchivo4();
            //deberarchivo5();
            //deberarchivo6();
            //deberarchivo7();
            //deberarchivo8();
            deberarchivo9();
        }
    
    public static void deberarchivo(){
        File archivo = new File ("D:/Archivos/aleatorio2.txt");
        try{
        Scanner leer = new Scanner (archivo);
        int contador=0, contador2=0,contador3=0,contador4=0;
        while(leer.hasNextLine()){
            String valor = leer.nextLine();
            int numero = Integer.parseInt(valor);
            if(numero %21 == 0){
                System.out.println(valor);
                contador++;
            if(numero %32 == 0){
                System.out.println(valor);
                contador2++;
            if(numero %41 == 0){
                System.out.println(valor);
                contador3++;
            if(numero %52 == 0){
                System.out.println(valor);
                contador4++;
            }     
        }
        }
        }
        }
        System.out.println("Hay "+contador+" numeros "+" multiplos de 21");
        System.out.println("Hay "+contador2+" numeros "+" multiplos de 32");
        System.out.println("Hay "+contador3+" numeros "+" multiplos de 41");
        System.out.println("Hay "+contador4+" numeros "+" multiplos de 52");
    }catch (FileNotFoundException ex){
        System.out.println(ex.getMessage());
    }
}
    public static void deberarchivo2(){
   
        File archivo = new File ("D:/Archivos/aleatorio2.txt");
        try{
        Scanner leer = new Scanner (archivo);
        int contador=0,contadorp=1;
        while(leer.hasNextLine()){
            String valor = leer.nextLine();
            int numero = Integer.parseInt(valor);
            if(contadorp %2==0){
                       if(numero %4 == 0){
                System.out.println(valor);
                contador++;
    }   
            }
            contadorp++;
        }
        System.out.println("Hay "+contador+" numeros "+" multiplos de 4");
    }catch (FileNotFoundException ex){
        System.out.println(ex.getMessage());
    }
}
    public static void deberarchivo3(){
        File archivo = new File ("D:/Archivos/Nombres.txt");
        try{
            Scanner leer = new Scanner (archivo);
            int contador=0;
            while(leer.hasNextLine()){
                String palabra = leer.nextLine();
                if(palabra.length()>2){
                    String [] dato = palabra.split(",");
                    for(int x = 0 ; x < dato.length ; x++){
                        char letra = dato[x].charAt(0);
                    if(letra == 'b' || letra == 'B'){
                        contador++;
                    }
                    }
                }
            }
            System.out.println("El total de letras con b es de: "+contador);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
}
    }
    public static void deberarchivo4(){
        File archivo = new File ("D:/Archivos/Nombres.txt");
        try{
            Scanner leer = new Scanner (archivo);
            int contador=0;
            while(leer.hasNextLine()){
                String frase = leer.nextLine();
                    String [] palabras = frase.split(",");
                    for(int x = 0 ; x < palabras.length ; x++){
                        String palabra = palabras[x];
                    if(palabra.length()%2!=0 || palabra.charAt(0) == 'a'){
                       contador++;
                    }
                }
            }
            System.out.println("El total de letras es de: "+contador);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
}
    }
    public static void deberarchivo5(){
        File archivo = new File ("D:/Archivos/Notas.txt");
        try{
        Scanner leer = new Scanner(archivo);
        while(leer.hasNextLine()){
                String cadena = leer.nextLine();
                String [] dato = cadena.split(";");
                double promedio = Double.parseDouble(dato[2]);
                if(promedio>8){
                        if(dato[0].charAt(0)=='c'||dato[0].charAt(0)=='e'){        
                    System.out.println("Nombre: " + dato[0] + " Notas: "+ dato[1] + " Promedio: " + promedio);
                }
                }
        }   
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
    }
    }
    public static void deberarchivo6(){
        File archivo = new File ("D:/Archivos/Productos.txt");
        try{
        Scanner leer = new Scanner(archivo);
        while(leer.hasNextLine()){
            String cadena = leer.nextLine();
            String [] dato = cadena.split("-");
            double total = Double.parseDouble(dato[3]);
            if(total>=10 && 20>=total){
            System.out.println("Producto: "+ dato[0] + " - " + "total: "+ total);
        }
        }
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            
        }
    }
    public static void deberarchivo7(){
        File archivo = new File ("D:/Archivos/TriangulosRectangulos.txt");
        try{
            Scanner leer = new Scanner (archivo);
            while(leer.hasNextLine()){
                String cadena = leer.nextLine();
                String [] dato = cadena.split("-");
                double base = Double.parseDouble(dato[0]);
                double altura = Double.parseDouble(dato[1]);
                double area = Double.parseDouble(dato[2]);                
                if(base>altura || area<altura){
                    System.out.println("Area del triangulo es: " + area);
                }
            }        
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void deberarchivo8(){
        File archivo = new File ("D:/Archivos/RegistroCivil.txt");
        try{
            Scanner leer = new Scanner (archivo);
            while(leer.hasNextLine()){
                String cadena = leer.nextLine();
                String [] dato = cadena.split(";");
               if(dato[1].charAt(0)=='A'||dato[1].charAt(0)=='E'||dato[1].charAt(0)=='I'||dato[1].charAt(0)=='O'||dato[1].charAt(0)=='U'){
                System.out.println("Nombres con vocales: "+dato[1]);
            }
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void deberarchivo9(){
        File archivo = new File ("D:/Archivos/listado-general.txt");
        try{
            Scanner leer = new Scanner (archivo);
            Scanner teclado = new Scanner (System.in); 
            int cont_a=0, cont_b=0, cont_c=0, cont_d=0, cont_e=0,valor;
            String respuesta;
            System.out.println("Ingrese la letra");
            respuesta = teclado.nextLine();
            System.out.println("Ingrese el caracter");
            valor = teclado.nextInt();
            while(leer.hasNextLine()){
                String palabra = leer.nextLine();
                //A
                if(palabra.length() >= 4){
                   char letra = palabra.charAt(3); 
                   if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    cont_a++;
                   }
                }
                //B
                if(palabra.length() >= 5){
                   char letra = palabra.charAt(4); 
                    if(letra == 'M'){
                     cont_b++;   
                    }
                }
                //C
                if(palabra.length() >= 4){
                   char letra_1 = palabra.charAt(0); 
                   char letra_2 = palabra.charAt(3);
                    if(letra_1 == 'a' || letra_2 == 'f'){
                     cont_c++;   
                    }
                }
                //D
                if(palabra.length() >= 6){
                    char letra_1 = palabra.charAt(0); 
                    char letra_2 = palabra.charAt(2); 
                    char letra_3 = palabra.charAt(5); 
                     if(letra_1 == 'g' && letra_1 == 's' && letra_1 == 'o'){
                         cont_d++;
                     }
                }
                //E
                String frase = leer.nextLine();
                if(frase.length()>valor){
                if(frase.charAt(valor) == 'm' ){
                if(frase.charAt(0)== respuesta.charAt(0)){  
                    cont_e++; 
                    }
                    }
            }
            }
            System.out.println("Letras con vocales: "+cont_a);
            System.out.println("Letras que contengan m: "+cont_b);
            System.out.println("Letras que contengan a y f: "+cont_c);
            System.out.println("Letras que contengan g-s-o: "+cont_d);
            System.out.println("Letras que contengan lo solicitado y tengan m: "+cont_e);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
    
