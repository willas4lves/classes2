package com.classes.classes2;

public class Funcionario extends Pessoa{
    private String login;
    private String senha;
    private double salario;
    public Funcionario(String nome, String cpf, Endereco endereco, String login, String senha, double salario) {
        super(nome, cpf, endereco);
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void imprimeContraCheque() {
        double fgts = salario * 0.08;
        double inss = salario * 0.11;
        double salarioLiquido = salario - inss;

        System.out.println("Contracheque do Funcionário:");
        System.out.println("Salário Bruto: " + salario);
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }



    


}
