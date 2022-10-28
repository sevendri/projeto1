package br.com.letscode.turmaitau.cotacao;

import java.util.Scanner;

public class Cotacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a cotação?");
        String cotacao = scanner.next();

        System.out.println("Qual o valor recebido?");
        String valor = scanner.next();

        Double resultado = Double.parseDouble(cotacao) * Double.parseDouble(valor);

        System.out.println("Resultado em reais:" + resultado.toString());
        scanner.close();
    }
}
