package view;

import model.Emprestimo;
import java.util.*;

public class EmprestimoView {
    public void show(List<Emprestimo> lista) {
        for (Emprestimo e: lista)
            System.out.println(e.getAluno().getNome()+" com "+e.getLivro().getTitulo());
    }
}
