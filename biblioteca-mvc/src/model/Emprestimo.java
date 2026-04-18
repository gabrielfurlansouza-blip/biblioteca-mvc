package model;

public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private String dataDevolucao;

    public Emprestimo(Aluno a, Livro l) {
        aluno = a;
        livro = l;
        livro.emprestar();
    }

    public void devolver() {
        livro.devolver();
        dataDevolucao = "ok";
    }

    public boolean aberto() { return dataDevolucao == null; }

    public Livro getLivro() { return livro; }
    public Aluno getAluno() { return aluno; }
}
