package br.com.letscode.turmaitau.chapas;

import java.util.Scanner;

public class Chapa {

    public static void main(String[] args) {

        double m[][] = new double[6][5];

        m[0][0] = 100;
        m[1][0] = 100;
        m[2][0] = 100;
        m[3][0] = 100;
        m[4][0] = 100;
        m[5][0] = 100;
        m[0][4] = 100;
        m[1][4] = -3;
        m[2][4] = -3;
        m[3][4] = -3;
        m[4][4] = -3;
        m[5][4] = -3;

        System.out.println(m[0][0] + "] [" + m[0][1] + "] [" + m[0][2] + "] [" + m[0][3] + "] [" + m[0][4] + "]");
        System.out.println(m[1][0] + "] [" + m[1][1] + "] [" + m[1][2] + "] [" + m[1][3] + "] [" + m[1][4] + "]");
        System.out.println(m[2][0] + "] [" + m[2][1] + "] [" + m[2][2] + "] [" + m[2][3] + "] [" + m[2][4] + "]");
        System.out.println(m[3][0] + "] [" + m[3][1] + "] [" + m[3][2] + "] [" + m[3][3] + "] [" + m[3][4] + "]");
        System.out.println(m[4][0] + "] [" + m[4][1] + "] [" + m[4][2] + "] [" + m[4][3] + "] [" + m[4][4] + "]");
        System.out.println(m[5][0] + "] [" + m[5][1] + "] [" + m[5][2] + "] [" + m[5][3] + "] [" + m[5][4] + "]");

    }
}
