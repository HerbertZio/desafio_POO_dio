package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    private static final double BONUS_MENTORIA = 10;

    @Override
    public double calcularXp() {
        return XP_PADRAO + BONUS_MENTORIA;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    public void imprimirDetalhes() {
        System.out.println("Detalhes da Mentoria:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data: " + data);
        System.out.println("XP por Mentoria: " + calcularXp());
    }
}
