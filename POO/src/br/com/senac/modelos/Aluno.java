package br.com.senac.modelos;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double media;
    private double[] notas = new double[3];

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double getMedia() {
        return media;
    }

    public double[] getNotas() {
        return notas;
    }

    private void setNotasInterno(double[] notas) {
        this.notas = notas;
    }

    public void atribuirNotas(Professor professor, double[] notas) {
        if (professor != null) {
            setNotasInterno(notas);
        } else {
            throw new IllegalArgumentException("Apenas um professor pode atribuir notas.");
        }
    }

    public void calcularMedia() {
        for (double nota : notas) {
            media += nota;
        }
        this.media = media/4;
    }
}
