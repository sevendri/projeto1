package br.com.letscode.turmaitau.listastring;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Letras {

    public static void main(String[] args) {

        //Dada uma lista de Strings, determine qual a maior sequência de letras em ordem alfabética crescente.
        List<String> strings = new ArrayList<String>();
        List<String> filtrados = new ArrayList<String>();

        //entrada:
        strings.add("acbda");
        strings.add("fasdlkh");
        strings.add("poiwqd");
        strings.add("zxcqwtop");
        strings.add("qfgophl");

        //saída: fgop
        Iterator<String> it = strings.iterator();
        StringBuilder sequencia;

        while (it.hasNext()) {
            sequencia = new StringBuilder();
            String string = it.next();

            List<Integer> ascii = new ArrayList<Integer>();
            //letras 97(a) a 122(z)
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                ascii.add((int) c);
            }

//            Collections.sort(ascii);
//            Iterator<Integer> ordem = ascii.iterator();
//            int seq = 0;
//            while (ordem.hasNext()) {
//                int asc = Integer.parseInt(ordem.next().toString());
//                if(asc >= seq) {
//                    seq = asc;
//                    sequencia.append((char)asc);
//                }
//            }

            int n = ascii.size();
            for (int i = 0; i < n; i++) {
                int asc = Integer.parseInt(ascii.get(i).toString());
                //primeiro
                if (i == 0) {
                    if (ascii.get(i).compareTo(ascii.get(i + 1)) < 0) {
                        sequencia.append((char) asc);
                    }
                } else {
                    //último
                    if (i == (n - 1)) {
                        if (ascii.get(i).compareTo(ascii.get(i - 1)) > 0) {
                            sequencia.append((char) asc);
                        }
                    } else {
                        // meio
                        if (ascii.get(i).compareTo(ascii.get(i + 1)) < 0) {
                            sequencia.append((char) asc);
                        } else {
                            if (ascii.get(i).compareTo(ascii.get(i - 1)) > 0) {
                                sequencia.append((char) asc);
                                break;
                            }
                        }
                    }
                }
            }
            filtrados.add(sequencia.toString());
        }

        it = filtrados.iterator();
        int maior = 0;
        String escolha = new String();
        while (it.hasNext()) {
            String string = it.next();
            if (string.length() > maior) {
                maior = string.length();
                escolha = string;
            }
        }
        System.out.println("A maior sequência é: " + escolha);
    }
}