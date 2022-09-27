package br.com.up.GestaoFinanceira;

import br.com.up.GestaoFinanceira.Compra;

public class CompraInternacional extends Compra {

    public void CalculaValorFornecedor() {
        this.Preco  = this.produto.Valor * this.Quantidade;


        System.out.println("O valor da compra é: " + Preco);
        System.out.println("O valor do estoque é: " + Preco);
    }
}
