package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHorario;

    public Curso() {}


    public double calcularXP() {
        return XP_PADRAO * cargaHorario;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHoraria(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
