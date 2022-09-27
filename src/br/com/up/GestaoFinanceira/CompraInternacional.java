package br.com.up.GestaoFinanceira;

import br.com.up.GestaoFinanceira.Compra;

public class CompraInternacional extends Compra {

    public void CalculaValorFornecedor() {
        double valorTotalCompra = this.Preco * this.Quantidade;

        System.out.println("O valor da compra é: " + valorTotalCompra);
        System.out.println("O valor do estoque é: " + valorTotalCompra);
    }
}
