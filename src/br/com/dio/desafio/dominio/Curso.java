package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    private static final double BONUS_CURSO = 5;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria + BONUS_CURSO;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public void imprimirDetalhes() {
        System.out.println("Detalhes do Curso:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("XP por Curso: " + calcularXp());
    }
}
