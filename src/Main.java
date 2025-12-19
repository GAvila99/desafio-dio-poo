import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descricao Java");
        curso1.setCargaHoraria(5);

        var curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Descricao Python");
        curso2.setCargaHoraria(3);

        var mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao Mentoria");
        mentoria1.setData(LocalDate.now());



        /*System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        System.out.println("Conteudos Iscritos "+devCamila.getNome() +": "+devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+devCamila.getNome() +": "+devCamila.getConteudosConcluidos());

        System.out.println("\n----------------------------------------------------------\n");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteudos Iscritos "+devGabriel.getNome() +": "+devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+devGabriel.getNome() +": "+devGabriel.getConteudosConcluidos());
    }
}