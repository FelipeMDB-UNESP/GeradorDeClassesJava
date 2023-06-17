/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio04.modelo;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.exercicio04.modelo.Atributo;
/**
 *
 * @author aluno
 */
public class Classe {
    private String nomeClasse;
    private String pacote;
    private List<Atributo> atributos = new ArrayList<>();

    public Classe() {
    }
    
    public Classe(String nomeClasse, String pacote) {
        this.nomeClasse = nomeClasse;
        this.pacote = pacote;
    }
    // Métodos
    public void adicionarAtributo(Atributo atributo){
        atributos.add(atributo);
    }
    

    //Geters and Setters
    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }
    
    
    
}
