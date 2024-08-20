package br.com.senac.modelos;

import br.com.senac.calculavel.Salario;

public class Mensalista extends Professor implements Salario {
    private double salarioFixo;

    public Mensalista(String departamento, String matricula, String nome, double salarioFixo) {
        super(departamento, matricula, nome);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return this.salarioFixo;
    }
}
