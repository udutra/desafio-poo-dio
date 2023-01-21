package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso {Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Carga Horária: " + getCargaHoraria() + "}";
    }
}