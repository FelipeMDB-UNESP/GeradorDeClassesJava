/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio04.modelo;

/**
 *
 * @author aluno
 */
public class Atributo {
    
    public enum Modificador{
        PUBLIC,
        PRIVATE,
        PROTECTED
    }
    public enum Tipo{
        STRING,
        INT,
        FLOAT,
        DOUBLE
    }
    
    private String nome;
    private Modificador modificador;
    private Tipo tipo;
    //Construtor
    public Atributo() {
    }
    
    public Atributo(String nome, Modificador modificador, Tipo tipo) {
        this.nome = nome;
        this.modificador = modificador;
        this.tipo = tipo;
    }
    // Getters and Seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modificador getModificador() {
        return modificador;
    }

    public void setModificador(Modificador modificador) {
        this.modificador = modificador;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
