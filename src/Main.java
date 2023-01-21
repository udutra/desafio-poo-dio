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
        inscreverBootcamp(bootcamp, devGuilherme);
        progredir(devGuilherme);
        progredir(devGuilherme);
        progredir(devGuilherme);
        exibeConteudosInscritos(devGuilherme);

        System.out.println("-------------------------");

        Dev devMaria = new Dev("Maria");
        inscreverBootcamp(bootcamp, devMaria);
        progredir(devMaria);
        progredir(devMaria);
        exibeConteudosInscritos(devMaria);

        System.out.println("-------------------------");

        exibeConteudosConcluidos(devGuilherme);
        exibeConteudosConcluidos(devMaria);
    }

    private static void inscreverBootcamp(Bootcamp bootcamp, Dev dev) {
        dev.inscreverBootcamp(bootcamp);
    }

    private static void exibeConteudosInscritos(Dev dev){
        System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
    }

    private static void exibeConteudosConcluidos(Dev dev){
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
    }

    private static void exibeXp(Dev dev){
        System.out.println("XP do Dev " + dev.getNome() + ": " + dev.calcularXp());
    }

    private static void progredir(Dev dev){
        exibeConteudosInscritos(dev);
        dev.progredir();
        exibeXp(dev);
    }
}
