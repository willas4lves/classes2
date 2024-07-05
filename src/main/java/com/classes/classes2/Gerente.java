package com.classes.classes2;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf, Endereco endereco, String login, String senha, double salario) {
        super(nome, cpf, endereco, login, senha, salario);
    }

    

    public void imprimeContraCheque() {
        double fgts = getSalario() * 0.08;
        double inss = getSalario() * 0.11;
        double salarioLiquido = getSalario() - inss;

        System.out.println("Contracheque do Gerente:");
        System.out.println("Salário Bruto: " + getSalario());
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }

}
