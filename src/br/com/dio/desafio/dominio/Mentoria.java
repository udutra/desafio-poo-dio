package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo, descricao;
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data){
        setTitulo(titulo);
        setDescricao(descricao);
        setData(data);
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void CalcularXP(){

    }

    @Override
    public String toString() {
        return "Mentoria {Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Data: " + getData() + "}";
    }
}
