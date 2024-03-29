package entities;

public class OrderItem {
  private Integer quantity;
  private Double price;
  private Product product;

  public OrderItem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public Double subTotal() {
    return price * quantity;
  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();

    string.append("\n" + product.getName())
            .append(", $" + String.format("%.2f", product.getPrice()))
            .append(", Quantity: " + quantity)
            .append(", Subtotal: $" + String.format("%.2f", subTotal()));

    return string.toString();
  }
}
