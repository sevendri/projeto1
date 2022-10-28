package br.com.letscode.turmaitau.produtos.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import br.com.letscode.turmaitau.produtos.entity.*;

public class CapturarProdutos {

    private final static int QTDE_MAX_PRODUTOS = 5;
    private ArrayList<Produto> produtos;

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void capturar() {

        this.produtos = new ArrayList<>();
        Produto produto;
        Scanner scanner = new Scanner(System.in);
        int loop = 0;

        while(loop < QTDE_MAX_PRODUTOS) {
            produto = new Produto();

            System.out.println("Nome do produto ?");
            produto.setNome(scanner.next());

            System.out.println("Preço do produto ?");
            produto.setPreco(Double.parseDouble(scanner.next()));

            produtos.add(produto);
            loop++;
        }

        scanner.close();
    }
}
