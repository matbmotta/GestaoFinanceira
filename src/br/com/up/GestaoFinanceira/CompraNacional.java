package br.com.up.GestaoFinanceira;

import br.com.up.GestaoFinanceira.Compra;

public class CompraNacional extends Compra {
    public double ValorFrete;

    public void CalculaValorFornecedor(){
        this.ValorFrete = 50;
        double valorTotalCompra = this.Preco * this.Quantidade;
        double icms = valorTotalCompra * 0.18;
        double iss = ValorFrete * 0.05;

        System.out.println("O valor da compra é: " + valorTotalCompra);
        System.out.println("O valor do estoque é: " + valorTotalCompra);
        System.out.println("O valor da compra com o frete é:" + valorTotalCompra + ValorFrete);
        System.out.println("O valor dos impostos ICMS e ISS é:" + icms + iss);
    };
}
