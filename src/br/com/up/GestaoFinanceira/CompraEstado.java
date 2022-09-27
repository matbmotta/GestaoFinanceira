package br.com.up.GestaoFinanceira;

import br.com.up.GestaoFinanceira.Compra;

public class CompraEstado extends Compra {


    public void CalculaValorFornecedor(){
        this.Preco = this.produto.Valor * this.Quantidade;

        System.out.println("O valor da compra é: " + Preco);
        System.out.println("O valor do estoque é: " + Preco);
    };
}
