import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de python");
        mentoria.setDescricao("descrição mentoria python");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de ui/ux");
        mentoria.setDescricao("descrição mentoria ui/ux");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThalita = new Dev();
        devThalita.setNome("Thalita");
        devThalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thalita:" + devThalita.getConteudosInscritos());
        devThalita.progredir();
        devThalita.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thalita:" + devThalita.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thalita:" + devThalita.getConteudosConcluidos());
        System.out.println("XP:" + devThalita.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
