package br.com.fiap.biblioteca.model;

public class Leitor {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    // Métodos de acesso
    public void setNome(String nome){
        if (nome.length() < 3){
            System.out.println("O nome deve ter pelo menos 3 caracteres!");
        } else {
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
