import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Java","Curso de Java",8);
        Conteudo curso2 = new Curso("Curso Java2","Curso de Java2",8);

        Conteudo mentoria = new Mentoria("Mentoria Java","Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devGuilherme.getNome() + ": " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.println("XP do Dev " + devGuilherme.getNome() + ": " + devGuilherme.calcularXp());
        System.out.println("Conteúdos Inscritos " + devGuilherme.getNome() + ": " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.println("XP do Dev " + devGuilherme.getNome() + ": " + devGuilherme.calcularXp());
        System.out.println("Conteúdos Inscritos " + devGuilherme.getNome() + ": " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.println("XP do Dev " + devGuilherme.getNome() + ": " + devGuilherme.calcularXp());
        System.out.println("Conteúdos Inscritos " + devGuilherme.getNome() + ": " + devGuilherme.getConteudosInscritos());

        System.out.println("-------------------------");

        Dev devMaria = new Dev("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMaria.getNome() + ": " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("XP do Dev " + devMaria.getNome() + ": " + devMaria.calcularXp());
        System.out.println("Conteúdos Inscritos " + devMaria.getNome() + ": " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("XP do Dev " + devMaria.getNome() + ": " + devMaria.calcularXp());
        System.out.println("Conteúdos Inscritos " + devMaria.getNome() + ": " + devMaria.getConteudosInscritos());



        System.out.println("Conteúdos Concluídos: " + devGuilherme.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos: " + devMaria.getConteudosConcluidos());

    }
}
