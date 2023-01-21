import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso Java","Curso de Java",8);
        Mentoria mentoria = new Mentoria("Mentoria Java","Mentoria de Java", LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
