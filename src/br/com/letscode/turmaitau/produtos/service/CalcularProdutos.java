package br.com.letscode.turmaitau.produtos.service;

import br.com.letscode.turmaitau.produtos.entity.Produto;
import br.com.letscode.turmaitau.produtos.util.TipoPreco;

import java.util.ArrayList;

public class CalcularProdutos {

    public Produto calcular(ArrayList<Produto> produtos, TipoPreco tipopreco) {

        Produto produtoBarato = new Produto();
        Produto produtoCaro = new Produto();
        produtoBarato.setNome("");
        produtoBarato.setPreco(999999999.0);
        produtoCaro.setNome("");
        produtoCaro.setPreco(0.0);

        for (int i = 0; i < produtos.size(); i++) {

            switch (tipopreco) {
                case CARO:
                    if (produtos.get(i).getPreco().compareTo(produtoCaro.getPreco())>0) {
                        produtoCaro.setNome(produtos.get(i).getNome());
                        produtoCaro.setPreco(produtos.get(i).getPreco());
                    }
                    break;
                case BARATO:
                    if (produtos.get(i).getPreco().compareTo(produtoBarato.getPreco())<0) {
                        produtoBarato.setNome(produtos.get(i).getNome());
                        produtoBarato.setPreco(produtos.get(i).getPreco());
                    }
                    break;
                default:
                    break;
            }
        }

        switch (tipopreco) {
            case CARO:
                return produtoCaro;
            case BARATO:
                return produtoBarato;
            default:
                return null;
        }
    }
}
