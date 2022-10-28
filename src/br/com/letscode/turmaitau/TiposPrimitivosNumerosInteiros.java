package br.com.letscode.turmaitau;

public class TiposPrimitivosNumerosInteiros {

    public static void main(String[] args) {

        long numero1 = 10;
        long numero2 = 5;
        String operacao = "/";
        long resultado = 0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado(+): " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado(-): " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado(*): " + resultado);
                break;
            case "/":
                resultado = numero1 / numero2;
                System.out.println("Resultado(/): " + resultado);
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }
    }



}
