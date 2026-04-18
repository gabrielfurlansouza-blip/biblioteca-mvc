package model;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException();
        this.nome = nome;
    }

    public String getNome() { return nome; }
}
