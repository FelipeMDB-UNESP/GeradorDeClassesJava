/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio04;

import com.mycompany.exercicio04.modelo.Atributo;
import com.mycompany.exercicio04.modelo.Classe;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author aluno
 */
public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        Classe pessoa = new Classe("Pessoa", "pacote1");
        Atributo nome = new Atributo("nome", Atributo.Modificador.PRIVATE, Atributo.Tipo.STRING);
        Atributo idade = new Atributo("idade", Atributo.Modificador.PRIVATE, Atributo.Tipo.INT);
        pessoa.adicionarAtributo(nome);
        pessoa.adicionarAtributo(idade);
        // Criar um File
        try{   
            File file = new File("Funcao.java");
            if(file.createNewFile()){
                System.out.println("Arquivo criado: "+ file.getName());
            }
        }
        catch(IOException error){
            System.out.println("Ocorreu um erro");
            error.printStackTrace(); // What??
        }
        
        
    }
}
            