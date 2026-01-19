package org.example;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    //Construtor
    public Pessoa(int idade, String nome, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    //Getter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
}

