/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;
import java.util.Scanner;
import segundopaquete.Persoal;
/**
 *
 * @author ggarciaalvarez
 */
public class Academica {
    Scanner sc = new Scanner(System.in);
    private final String numReferencia = "2018";
    private String nome;
    private double nota; //o valor ten que estar entre 1 e 10
    private Persoal alumno;

    public Academica() {
    }

    public Academica(String nome, double nota, Persoal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + "," + alumno.toString();
    }
    
    
}
