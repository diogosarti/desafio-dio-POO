import br.com.diogo.desafio.dominio.Curso;
import br.com.diogo.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descricao curso java", 8);
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "descricao mentoria Java");

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}