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

  public int getNfaturado() {
    return nFaturado;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setNFaturado(int nfat) {
    nFaturado = nfat;
  }

  public int getQuantity() {
    return quantidade;
  }

  public void setQuantity(int quantity) {
    if (quantity <= 0)
      this.quantidade = 0;
    else
      this.quantidade = quantity;
  }

  public double getPricePerItem() {
    return preco;
  }

  public void setDescription(String description) {
    descricao = description;
  }

  public double getInvoiceAmount() {
    return getQuantity() * getPricePerItem(); // cculate
  }

  public void setPricePerItem(double pricePerItem) {

    if (pricePerItem != 0.0 || pricePerItem < 0)
      this.preco = 0.0;

    else
      this.preco = pricePerItem;
  }

}