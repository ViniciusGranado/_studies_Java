package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
  private Date moment;
  private OrderStatus status;
  private List<OrderItem> items;
  private Client client;

  public Order(Date moment, OrderStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;

    this.items = new ArrayList<>();
  }

  public Date getMoment() {
    return moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public Client getClient() {
    return client;
  }

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public void removeItem(OrderItem item) {
    items.remove(item);
  }

  public double total() {
    double total = 0;

    for (OrderItem item : items) {
      total += item.subTotal();
    }

    return total;
  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    string.append("Order moment: ").append(moment)
            .append("\nOrder status: ").append(status)
            .append(client)
            .append("\nOrder items:");

    for(OrderItem item : items) {
      string.append(item);
    };

    string.append("\nTotal price: $").append(String.format("%.2f", total()));

    return string.toString();
  }
}
