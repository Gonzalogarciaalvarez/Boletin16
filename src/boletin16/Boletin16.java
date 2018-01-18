/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;
import Libreria.LibBol16;
import segundopaquete.Persoal;
/**
 *
 * @author ggarciaalvarez
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoal persoa1 = new Persoal ("42442433242","1fefwe@gmail.com");
        Academica alumno1 = new Academica ("Samuel", LibBol16.calcularNotas(),persoa1);
        //Academica alumno1 = new Academica ("Samuel", calcularNotas.calcularNota(3);
        System.out.println(alumno1.toString());
        
    }
    
}
