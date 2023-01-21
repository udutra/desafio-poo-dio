package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo, descricao;
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void CalcularXP(){

    }

    @Override
    public String toString() {
        return "Curso {Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Carga Horária: " + getCargaHoraria() + "}";
    }
}