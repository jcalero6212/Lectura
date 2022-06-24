/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kernivel.escritura;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivo {
    public static void main (String [] args){
    crearArchivo();
}

    public static File crearArchivo(){
        File Archivos = new File("D:/Archivos/ejemplo.txt");
        try{
            Archivos.createNewFile();
        }catch (IOException ex){
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null,ex);
        }
        return Archivos;  
}
    public static File crearArchivoTxt(){
        String nombreArchivo = LecturaDatos.LeerCadena("Ingrese el nombre del archivo");
        File Archivos = new File("D:/Archivos/"+nombreArchivo+".txt");
        try{
            Archivos.createNewFile();
        }catch (IOException ex){
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null,ex);
        }
        return Archivos;  
}
    public static File crearArchivoTXT(String nombreArchivo){
        File Archivos = new File("D:/Archivos/"+nombreArchivo+".txt");
        try{
            Archivos.createNewFile();
        }catch (IOException ex){
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null,ex);
        }
        return Archivos;  
}
    
    public static File crearArchivoCSV(){
        File Archivos = new File("D:/Archivos/ejemplo.csv");
        try{
            Archivos.createNewFile();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return Archivos;
}
    }