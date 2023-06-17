/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author aluno
 */
public class Campos {
    
    private String modificadorCampo;
    private String tipoCampo;
    private String nomeCampo;

    public Campos() {
    }

    public Campos(String modificadorCampo, String tipoCampo, String nomeCampo) {
        this.modificadorCampo = modificadorCampo;
        this.tipoCampo = tipoCampo;
        this.nomeCampo = nomeCampo;
    }

    public String getModificadorCampo() {
        return modificadorCampo;
    }

    public void setModificadorCampo(String modificadorCampo) {
        this.modificadorCampo = modificadorCampo;
    }

    public String getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }
    
}
