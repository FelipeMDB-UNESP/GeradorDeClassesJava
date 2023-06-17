/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gerador.de.codigo;

import com.mycompany.classes.Campos;
import com.mycompany.classes.CriadorDeClasse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class GeradorDeCodigo {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        String nomeClasse;
        String nomePacote;
        System.out.println("Nome da classe:");
        nomeClasse = scanner.nextLine();
        System.out.println("Nome do pacote:");
        nomePacote = scanner.nextLine();
        
        ArrayList<Campos> listaDeCampos = new ArrayList<Campos>();
        int qtdCampos = 0;
        System.out.println("Quantos atributos deseja inserir?");
        qtdCampos = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Forneça os seguintes dados para criarmos a classe:");
        for(int i = 0; i < qtdCampos; i++){
            
            Campos campos = new Campos();
            System.out.println("Modificador do " + (i+1) + "° campo:");
            campos.setModificadorCampo(scanner.nextLine());
            System.out.println("Tipo do " + (i+1) + "° campo:");
            campos.setTipoCampo(scanner.nextLine());
            System.out.println("Nome do " + (i+1) + "° campo:");
            campos.setNomeCampo(scanner.nextLine());
            listaDeCampos.add(campos);
        }
        
        CriadorDeClasse.criarClasse(nomeClasse, nomePacote, listaDeCampos);
        
    }
}
