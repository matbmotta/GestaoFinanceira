package br.com.up.GestaoFinanceira;

import br.com.up.GestaoFinanceira.Compra;

public class CompraInternacional extends Compra {

    public double ImpostoImportacacao = 350;
    public void CalculaValorFornecedor() {
        this.Preco  = this.produto.Valor * this.Quantidade;

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");
        System.out.println("Valores da compra internacional:");
        System.out.println("Os valor em conta de estoque e em conta de valor a pagar é:" + Preco);
        System.out.println("O valor do imposto de importação é de:" + ImpostoImportacacao);
    }
}
