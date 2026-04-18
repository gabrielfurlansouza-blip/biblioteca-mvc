package controller;

import model.Emprestimo;
import java.util.*;

public class EmprestimoController {
    private List<Emprestimo> lista = new ArrayList<>();

    public void add(Emprestimo e) { lista.add(e); }

    public List<Emprestimo> abertos() {
        List<Emprestimo> r = new ArrayList<>();
        for (Emprestimo e: lista) if (e.aberto()) r.add(e);
        return r;
    }
}
