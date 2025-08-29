package br.com.fiap.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private int id;
    private Leitor leitor;
    private List<Exemplar> exemplares;

    public Emprestimo(int id, Leitor leitor) {
        this.id = id;
        this.leitor = leitor;
        this.exemplares = new ArrayList<>();
    }

    public void emprestar(Exemplar exemplar) {
        if (exemplar.isDisponivel() && exemplares.size() < 3){
            exemplares.add(exemplar);
            exemplar.setDisponivel(false);
        } else {
            System.out.printf("Livro %s não está disponível.\n", exemplar.getLivro().getTitulo());
        }
    }

    public void devolver(Exemplar exemplar) {
        System.out.printf("Devolvendo o livro %s.\n", exemplar.getLivro().getTitulo());
        exemplares.remove(exemplar);
        exemplar.setDisponivel(true);
    }

    public void mostrarEmprestimo(){
        System.out.println("**************************");
        System.out.println("Id:" + id);
        System.out.println("Leitor:" + leitor.getNome());
        for (Exemplar exemplar : exemplares) {
            System.out.println("Exemplar: " + exemplar.getLivro().getTitulo());
        }
        System.out.println("***************************************");
    }

}
