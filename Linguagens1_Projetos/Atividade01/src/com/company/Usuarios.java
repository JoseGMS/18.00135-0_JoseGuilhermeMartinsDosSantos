package com.company;
public class Usuarios {
    private String nome;
    private String senha;
    private String mail;
    public Usuarios(String nome, String senha, String mail){
        this.nome = nome;
        this.senha = senha;
        this.mail = mail;
    }
    public String getNome() {
        return nome;
    }


}
