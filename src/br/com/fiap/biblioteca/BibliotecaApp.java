package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.model.*;

public class BibliotecaApp {
    public static void main(String[] args) {
//        Imc imc = new Imc();
//        imc.setPeso(70);
//        imc.setAltura(1.75);
//        System.out.printf("Se você pesa %s Kgs e tem %s metros, seu IMC é %.2f.\n", imc.getPeso(), imc.getAltura(), imc.getImc());

        System.out.println("Biblioteca!");

        Livro livro = new Livro("Dom Casmurro");
        livro.setAno(2020);
        livro.setEditora("Editora Fiap");
        livro.setAutor("Machado de Assis");

        Exemplar exemplar2 = new Exemplar();
        exemplar2.setTombo(2);
        exemplar2.setLivro(livro);
        exemplar2.setDisponivel(true);

        Exemplar exemplar1 = new Exemplar();
        exemplar1.setTombo(1);
        exemplar1.setLivro(livro);
        exemplar1.setDisponivel(true);

        Livro livro2 = new Livro("O Alquimista");
        livro2.setAno(2020);
        livro2.setEditora("Editora Fiap");
        livro2.setAutor("Paulo Coelho");

        Exemplar exemplar3 = new Exemplar();
        exemplar3.setTombo(100);
        exemplar3.setLivro(livro2);
        exemplar3.setDisponivel(true);

        Exemplar exemplar4 = new Exemplar();
        exemplar4.setTombo(200);
        exemplar4.setLivro(livro2);
        exemplar4.setDisponivel(true);

        // Criação dos Leitores
        Leitor leitor = new Leitor();
        leitor.setNome("Pedro da Silva");

        Leitor leitor2 = new Leitor();
        leitor2.setNome("Ana Maria");

        Emprestimo emprestimo1 = new Emprestimo(1000, leitor);
        emprestimo1.emprestar(exemplar1);
        emprestimo1.emprestar(exemplar3);
        emprestimo1.emprestar(exemplar2);
        emprestimo1.emprestar(exemplar4);
        emprestimo1.mostrarEmprestimo();

        emprestimo1.devolver(exemplar1);

        Emprestimo emprestimo2 = new Emprestimo(2000, leitor2);
        emprestimo2.emprestar(exemplar1);
        emprestimo2.emprestar(exemplar4);
        emprestimo2.mostrarEmprestimo();


    }
}
