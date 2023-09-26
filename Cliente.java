/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duda
 */

package com.mycompany.dlavas;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String genero;
    private String dataNascimento;
    private String endereço;
    private Carro carro;
    private plano plano;
    
    public Cliente(String nome,String sobrenome, String genero, String dataNascimento, String endereço) {
        this.nome = nome;
        this.sobrenome= sobrenome;
        this.genero= genero;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.carro = null;
        this.plano = null;
    }
    
        public Cliente() {
        this.nome = "";
        this.sobrenome= "";
        this.genero= "";
        this.dataNascimento = "";
        this.endereço = "";

    }
    
    public String getNome (){ //retorna o valor atual do atributo no caso aq é o nome
        return nome;
    }
    
    public void setNome (String nome) {//atualiza o valor do atributo nome, para o valor passado cm argumento
        this.nome = nome;
    }
    
    public String getSobrenome () {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getGenero () {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
     public String getDataNascimento () {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEndereço () {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
   
    }

    

