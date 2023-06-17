/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class CriadorDeClasse {
    
    
    
    public static void criarClasse (String nomeClasse,String nomePacote, ArrayList<Campos> listaDeCampos) throws IOException {
        
        BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeClasse+".java"));
        escritor.write("package " + nomePacote+ ";\n\n");
        escritor.write("public class " + nomeClasse + " {\n\n");
        
        String declaracaoAtributos = "";
        String construtorVazio = "\tpublic " + nomeClasse.substring(0,1).toUpperCase() + nomeClasse.substring(1) + "() {\n\t}\n\n";
        String criacaoConstrutor = "\tpublic " + nomeClasse + "(";
        String parametrosConstrutor = "";
        String dentroDoConstrutor = "";
        String gettersEsetters = "";
        
        for(Campos cam : listaDeCampos){
            
            declaracaoAtributos += "\t"+cam.getModificadorCampo() + " " + cam.getTipoCampo() + " " + cam.getNomeCampo() + ";\n";
            parametrosConstrutor += cam.getTipoCampo() + " " + cam.getNomeCampo() + ", ";
            dentroDoConstrutor += "\t    this." + cam.getNomeCampo() + " = " + cam.getNomeCampo() + ";\n";
            gettersEsetters += "\tpublic " + cam.getTipoCampo() + " get" + cam.getNomeCampo().substring(0,1).toUpperCase() + cam.getNomeCampo().substring(1) + "() {\n" + "\t    return " + cam.getNomeCampo() + ";\n\t}\n\n"
            + "\tpublic void " + "set" 
                    + cam.getNomeCampo().substring(0,1).toUpperCase() + cam.getNomeCampo().substring(1) + "(" 
                    + cam.getTipoCampo() + " " 
                    + cam.getNomeCampo() + ")" 
                    + " {\n" + "\t    this." + cam.getNomeCampo() + " = " + cam.getNomeCampo() + ";\n\t}\n\n";
        }
        parametrosConstrutor = parametrosConstrutor.substring(0, parametrosConstrutor.length()-2) + ")";
        criacaoConstrutor += parametrosConstrutor + " {\n" + dentroDoConstrutor + "\t}\n\n";
        String resultadoFinal = declaracaoAtributos + "\n" + construtorVazio + criacaoConstrutor + gettersEsetters + "}\n";
        escritor.write(resultadoFinal);
        
        escritor.close();
    }
}
