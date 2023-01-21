package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data){
        setTitulo(titulo);
        setDescricao(descricao);
        setData(data);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria {Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Data: " + getData() + "}";
    }
}
