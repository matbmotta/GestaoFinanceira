package br.com.up.GestaoFinanceira;

public class Main {
    public static void main(String[] args) throws Exception {
        Compra compraEstado = FabricaGestaoFinanceira.criarCompra("CompraEstado");
        compraEstado.CalculaValorFornecedor();

        Compra compraNacional = FabricaGestaoFinanceira.criarCompra("CompraNacional");
        compraNacional.CalculaValorFornecedor();

        Compra compraInternacional = FabricaGestaoFinanceira.criarCompra("CompraInternacional");
        compraInternacional.CalculaValorFornecedor();
    }

}