package br.com.fiap.biblioteca.model;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private String editora;
    private int ano;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public Livro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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
