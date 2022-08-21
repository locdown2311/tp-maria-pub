package Exercicio_07;

public class Invoice {
    private int nFaturado;
    private String descricao;
    private int quantidade;
    private double preco;

    public Invoice(int partFaturado, String partDescription, int quantity,
                   double pricePerItem) {
        super();
        this.nFaturado = partFaturado;
        this.descricao = partDescription;

        if (quantity <= 0)
            quantity = 0;
        else
            this.quantidade = quantity;

        if (pricePerItem <= 0)
            pricePerItem = 0.0;
        else
            this.preco = pricePerItem;
    }



    public void setQuantity(int quantity) {
        if (quantity <= 0)
            this.quantidade = 0;
        else
            this.quantidade = quantity;
    }



    public double getInvoiceAmount() {
        return getQuantidade() * getPreco();
    }

    public int getnFaturado() {
        return nFaturado;
    }

    public void setnFaturado(int nFaturado) {
        this.nFaturado = nFaturado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double pricePerItem) {
        if (pricePerItem != 0.0 || pricePerItem < 0)
            this.preco = 0.0;

        else
            this.preco = pricePerItem;
    }
}
