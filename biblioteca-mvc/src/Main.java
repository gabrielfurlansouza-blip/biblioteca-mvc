import model.*;
import controller.*;
import view.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Java","Autor",2);
        Aluno a = new Aluno("Ana");

        Emprestimo e = new Emprestimo(a,l);

        EmprestimoController c = new EmprestimoController();
        c.add(e);

        EmprestimoView v = new EmprestimoView();
        v.show(c.abertos());
    }
}
