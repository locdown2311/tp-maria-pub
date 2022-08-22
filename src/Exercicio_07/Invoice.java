package Exercicio_07;

public class Invoice {
    private int idFaturado;
    private String descricao;
    private int quantidade;
    private double preco;

    public Invoice(int partFaturado, String partDescription, int quantity,
                   double pricePerItem) {
        super();
        this.idFaturado = partFaturado;
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

    public int getIdFaturado() {
        return idFaturado;
    }

    public void setIdFaturado(int idFaturado) {
        this.idFaturado = idFaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantity) {
        if (quantity <= 0)
            this.quantidade = 0;
        else
            this.quantidade = quantity;
    }



    public double getInvoiceAmount() {
        return getQuantidade() * getPreco();
    }

    public void setPreco(double pricePerItem) {
        if (pricePerItem != 0.0 || pricePerItem < 0)
            this.preco = 0.0;

        else
            this.preco = pricePerItem;
    }
}
