package br.com.letscode.turmaitau.calculo;

public class Funcionario extends Object{
    String nome;
    String cpf;
    Double salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double calculaSalario(Integer dias) {
        Double salario_dia;
        salario_dia = this.salario/30;
        return salario_dia * dias;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.nome + "\nCpf: " + this.cpf + "\nSalário: " + this.salario;
    }

    @Override
    public boolean equals(Object obj) {
        Funcionario outro = (Funcionario) obj;
        return this.cpf.equals(outro.getCpf());
    }

    @Override
    public int hashCode() {
        //Definir o hash pela primeira letra do nome
        return this.nome.charAt(0);
    }
}
