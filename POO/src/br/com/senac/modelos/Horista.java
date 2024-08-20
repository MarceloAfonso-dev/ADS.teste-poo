package br.com.senac.modelos;

import br.com.senac.calculavel.Salario;

public class Horista extends Professor implements Salario {
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(String departamento, String matricula, String nome, double valorHora, int horasTrabalhadas) {
        super(departamento, matricula, nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
