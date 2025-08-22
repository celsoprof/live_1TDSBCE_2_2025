package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.model.Livro;

public class BibliotecaApp {
    public static void main(String[] args) {
        System.out.println("Biblioteca!");

        Livro livro = new Livro("Dom Casmurro");
        livro.ano = 2020;
        livro.editora = "Editora Fiap";
        livro.autor = "Machado de Assis";

        Livro livro2 = new Livro("O Alquimista");
        livro2.ano = 2020;
        livro2.editora = "Editora Fiap";
        livro2.autor = "Paulo Coelho";

        Livro livro3 = new Livro( "Meu Livro", 2000);

        Livro livro4 = livro2;
        livro4.titulo = "Mudei o nome";

        Livro livro5 = new Livro();

        System.out.println(livro);
        System.out.println(livro2);

        livro.exibirDadosLivro();
        livro2.exibirDadosLivro();
        livro4.exibirDadosLivro();
        livro3.exibirDadosLivro();

        livro.ano = 2025;
        livro.exibirDadosLivro();
    }
}
