package br.com.up.GestaoFinanceira;

public class FabricaGestaoFinanceira {

    public static Compra criarCompra(String tipoCompra) throws Exception{
        Compra compra = null;
        if(tipoCompra == "CompraEstado"){
            compra = new CompraEstado();
            Produto produto = new Produto();
            produto.Valor = 435.99;
            compra.produto = produto;
            compra.Quantidade = 10;
        }
        else if(tipoCompra == "CompraNacional"){
            compra= new CompraNacional();
            Produto produto = new Produto();
            produto.Valor = 225.99;
            compra.produto = produto;
            compra.Quantidade = 6;
        }
        else if(tipoCompra == "CompraInternacional"){
            compra = new CompraInternacional();
            Produto produto = new Produto();
            produto.Valor = 189.90;
            compra.produto = produto;
            compra.Quantidade = 3;
        }
        if(compra == null)
            throw new Exception("Método de compra inválido!!");

        return compra;
    }
}
