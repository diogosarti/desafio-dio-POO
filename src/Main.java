import br.com.diogo.desafio.dominio.*;

import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Introcução ao Java", "Curso introdutorio ao Java", 8);
        Curso curso2 = new Curso("Introcução ao POO", "Curso introdutorio ao POO em Java", 10);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descricao Mentoria Java");

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Diogo: "+ devDiogo.getConteudosInscritos());
        System.out.println("XP :" + devDiogo.calcularTotalXp());
        devDiogo.progredir();
        devDiogo.progredir();
        System.out.println("Conteudos Incritos Diogo: "+ devDiogo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Diogo: "+ devDiogo.getConteudosConcluidos());
        System.out.println("XP :" + devDiogo.calcularTotalXp());

        System.out.println("=================");

        Dev devTaina =  new Dev();
        devTaina.setNome("Taina");
        devTaina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Taina: "+ devTaina.getConteudosInscritos());
        devTaina.progredir();
        devTaina.progredir();
        devTaina.progredir();
        System.out.println("Conteudos Incritos Taina: "+ devTaina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Taina: "+ devTaina.getConteudosConcluidos());
        System.out.println("XP: " + devTaina.calcularTotalXp());


    }
}