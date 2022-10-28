package br.com.letscode.turmaitau;

public class Consumo {

    public static void main(String[] args) {

        // tempo em minutos
        long tempo = Long.parseLong(args[0]);
        // velocidade em km/h
        long velocidade = Long.parseLong(args[1]);
        // distância da viagem em KM
        double distancia = (tempo * velocidade)/60;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Velocidade média    : " + velocidade + " km/h");
        System.out.println("Tempo gasto         : " + tempo + " minutos");

        // consumo em litros
        double litros_usados = distancia / 12;

        System.out.println("Consumi             : " + litros_usados + " litros de combustível");

    }
}
