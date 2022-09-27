package br.com.up.GestaoFinanceira;

public abstract class Compra {
    public Produto produto;
    public int Quantidade;
    public double Preco;


    public abstract void CalculaValorFornecedor();
}
