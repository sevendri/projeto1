package br.com.letscode.turmaitau.produtos.service;
import br.com.letscode.turmaitau.produtos.entity.Produto;
import br.com.letscode.turmaitau.produtos.util.TipoPreco;

public class CalculaCesta {

    public static void main(String[] args) {

        CapturarProdutos capturarprodutos = new CapturarProdutos();
        capturarprodutos.capturar();

        for (int i = 0; i < capturarprodutos.getProdutos().size(); i++) {
            System.out.println("Produto [" + capturarprodutos.getProdutos().get(i).getNome() + "] Valor [" + capturarprodutos.getProdutos().get(i).getPreco() + "]");
        }

        CalcularProdutos calcularprodutos = new CalcularProdutos();
        Produto produto = new Produto();
        produto = calcularprodutos.calcular(capturarprodutos.getProdutos(), TipoPreco.BARATO);
        System.out.println("Produto mais barato [" + produto.getNome() + "] valor [" + produto.getPreco() + "]");

        produto = calcularprodutos.calcular(capturarprodutos.getProdutos(), TipoPreco.CARO);
        System.out.println("Produto mais caro [" + produto.getNome() + "] valor [" + produto.getPreco() + "]");

    }

}
