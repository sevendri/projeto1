package br.com.letscode.turmaitau.calculo;

public class CalculoMain {

    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        func1.setNome("João");
        func1.setCpf("123456789-12");
        func1.setSalario(1234.56);

        Funcionario func2 = new Funcionario();
        func2.setNome("José");
        func2.setCpf("123456789-13");
        func2.setSalario(6543.21);

        System.out.println(func1);
        System.out.println("Salário proporcional: " + func1.calculaSalario(10));

        System.out.println(func2);
        System.out.println("Salário proporcional: " + func1.calculaSalario(10));

        //comparar funcionários
        if (func1.equals(func2)) {
            System.out.println("CPF já cadastrado!");
        }
        else {
            System.out.println("Tudo ok!");
        }
        System.out.println(func1.getSalario().equals(func2.getSalario()));
        System.out.println("Hash1 = " + func1.hashCode() + " Hash2 = " + func2.hashCode());

    }
}