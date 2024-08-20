package br.com.senac.modelos;

public class Professor {
    private String nome;
    private String matricula;
    private String departamento;

    public Professor(String departamento, String matricula, String nome) {
        this.departamento = departamento;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }
}
