/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.modelo;

/**
 *
 * @author 1614290061
 */
public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private String sexo;

    public Contato() {
    }
    public Contato(String nome, String email, String endereco, String sexo) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
