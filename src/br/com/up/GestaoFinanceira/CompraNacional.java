package br.com.up.GestaoFinanceira;

import br.com.up.GestaoFinanceira.Compra;

public class CompraNacional extends Compra {

    public void CalculaValorFornecedor(){
        double valorFrete = 50;
        this.Preco = this.produto.Valor * this.Quantidade;
        double icms = Preco * 0.18;
        double iss = valorFrete * 0.05;

        System.out.println("O valor da compra é: " + Preco);
        System.out.println("O valor do estoque é: " + Preco);
        System.out.println("O valor da compra com o frete é:" + Preco + valorFrete);
        System.out.println("O valor dos impostos ICMS e ISS é:" + icms + iss);
    };
}
