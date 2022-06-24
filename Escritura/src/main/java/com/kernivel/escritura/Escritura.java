/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.escritura;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Escritura {

    public static void main(String[] args) {
        //Deber();
        //Deber2();
        Deber3();
        //Deber4();
        //Deber5();
        //Deber6();
    }
        public static void Deber(){
        File Archivos = archivo.crearArchivoTxt();
        try{
        Random aleatorio = new Random();
        PrintWriter escribir = new PrintWriter(Archivos);
        for(int x = 1 ; x <= 1001 ; x++){
            int valor = aleatorio.nextInt(500)+0;
            escribir.println(valor);}
        escribir.close();
        }catch (IOException ex){
}
}
        public static void Deber2(){
        String nombreArchivo = LecturaDatos.LeerCadena("Ingrese el nombre del archivo");
        File Archivos = archivo.crearArchivoTXT(nombreArchivo);
        Scanner teclado = new Scanner (System.in);
        String respuesta, aux="";
        try {
           PrintWriter escribir = new PrintWriter(Archivos);
           do{
           String nombre = LecturaDatos.LeerCadena("Ingrese un nombre");
           nombre = nombre.toLowerCase();
           System.out.println("Quiere ingresar otro nombre");
           respuesta = teclado.next();
           aux = nombre + "," + aux;
           }while(respuesta.equals("si"));
           aux = aux.substring(0, aux.length()-1);
           escribir.println(aux);
           escribir.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
    }
    }
        public static void Deber3(){
        String nombreArchivo = LecturaDatos.LeerCadena("Ingrese el nombre del archivo");
        File Archivos = archivo.crearArchivoTXT(nombreArchivo);
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantos alumnos va a ingresar");
        int alumnos=teclado.nextInt(); 
        try {
           PrintWriter escribir = new PrintWriter(Archivos);
           for(int x=0;x<alumnos;x++){           
           String nombre = LecturaDatos.LeerCadena("Ingrese un nombre");
           String promedio = LecturaDatos.leerpromedio();
           escribir.println(nombre+promedio);           
        }
        escribir.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
    }
    }
        public static void Deber4(){
        String nombreArchivo = LecturaDatos.LeerCadena("Ingrese el nombre del archivo");
        File Archivos = archivo.crearArchivoTXT(nombreArchivo);
        Scanner teclado = new Scanner (System.in);
        try {
           PrintWriter escribir = new PrintWriter(Archivos);
           for(int x=0;x<10;x++){           
           String nombre = LecturaDatos.LeerCadena("Ingrese un nombre del producto");
           String total = LecturaDatos.leertotal();
           escribir.println(nombre+total);           
        }
        escribir.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
    }
}
        public static void Deber5(){
        String nombreArchivo = LecturaDatos.LeerCadena("Ingrese el nombre del archivo");
        File Archivos = archivo.crearArchivoTXT(nombreArchivo);
        Scanner teclado = new Scanner (System.in);
        String respuesta;
        try {
           PrintWriter escribir = new PrintWriter(Archivos);
           do{
           String area = LecturaDatos.leerarea();
           System.out.println("Quiere seguir ingresando datos");
           respuesta = teclado.next();
           escribir.println(area);
           }while(respuesta.equals("si"));
           escribir.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
    }
}
       public static void Deber6(){
        String nombreArchivo = LecturaDatos.LeerCadena("Ingrese el nombre del archivo");
        File Archivos = archivo.crearArchivoTXT(nombreArchivo);
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantos personas va a ingresar");
        int personas=teclado.nextInt(); 
        try {
           PrintWriter escribir = new PrintWriter(Archivos);
           for(int x=0;x<personas;x++){           
           String cedula = LecturaDatos.LeerCadena("Ingrese numero de cedula");
           String nombre = LecturaDatos.LeerCadena("Ingrese el nombre");
           nombre = nombre.toUpperCase();
           String apellido = LecturaDatos.LeerCadena("Ingrese el apellido");
           apellido = apellido.toUpperCase();
           String estadocivil = LecturaDatos.LeerCadena("Ingrese el estado civil");
           estadocivil = estadocivil.toUpperCase();
           String telefono = LecturaDatos.LeerCadena("Ingrese numero de telefono");
           String genero = LecturaDatos.LeerCadena("Ingrese el genero");
           genero = genero.toUpperCase();
           String tipodesangre = LecturaDatos.LeerCadena("Ingrese el tipo de sangre");
           tipodesangre = tipodesangre.toUpperCase();
           String fechadenacimiento = LecturaDatos.LeerCadena("Ingrese la fecha de nacimiento");
           fechadenacimiento = fechadenacimiento.toUpperCase();
           String edad = LecturaDatos.LeerCadena("Ingrese la edad");
           escribir.println(cedula+";"+nombre+";"+apellido+";"+estadocivil+";"+telefono+";"+genero+";"+tipodesangre+";"+fechadenacimiento+";"+edad);           
        }
        escribir.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
    } 
}
}