package br.com.letscode.turmaitau;

public class Tabuada {

    public static void main(String[] args) {

        tabuada(2);

    }

    static void tabuada(long numero) {

        long resultado = 0;
        System.out.println("Tabuada do " + numero);

        for (int i = 1; i < 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

    }

}
