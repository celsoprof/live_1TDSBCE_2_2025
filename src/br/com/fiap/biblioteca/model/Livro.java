package br.com.fiap.biblioteca.model;

public class Livro {

    public String titulo;
    public String autor;
    public String isbn;
    public String editora;
    public int ano;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public Livro(){

    }

    public void exibirDadosLivro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano: " + this.ano);
        System.out.println("-----------------------------");
    }


}
