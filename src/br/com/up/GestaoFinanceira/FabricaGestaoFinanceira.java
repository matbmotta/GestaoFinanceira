package br.com.up.GestaoFinanceira;

public class FabricaGestaoFinanceira {

    public Compra criarCompra(String tipoCompra) throws Exception{
        Compra compra = null;
        if(tipoCompra == "br.com.up.GestaoFinanceira.CompraEstado"){
            compra = new CompraEstado();
            Produto produto = new Produto();
            produto.Valor = 435.99;
            compra.produto = produto;
            compra.Quantidade = 10;
            compra.CalculaValorFornecedor();
        }
        else if(tipoCompra == "br.com.up.GestaoFinanceira.CompraNacional"){
            compra= new CompraNacional();
            Produto produto = new Produto();
            produto.Valor = 225.99;
            compra.produto = produto;
            compra.Quantidade = 6;
            compra.CalculaValorFornecedor();
        }
        else if(tipoCompra == "br.com.up.GestaoFinanceira.CompraInternacional"){
            compra = new CompraInternacional();
            Produto produto = new Produto();
            produto.Valor = 189.90;
            compra.produto = produto;
            compra.Quantidade = 3;
            compra.CalculaValorFornecedor();
        }
        if(compra == null)
            throw new Exception("Método de compra inválido!!");

        return compra;
    }
}
