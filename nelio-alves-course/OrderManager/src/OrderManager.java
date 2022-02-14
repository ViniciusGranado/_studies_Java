import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderManager {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("E-mail: ");
    String email = scanner.nextLine();

    System.out.print("Birth date (DD/MM/YYYY): ");
    String dateInput = scanner.nextLine();
    Date birthDate = dateFormat.parse(dateInput);

    System.out.println("\nEnter order data:");
    System.out.print("status: ");
    OrderStatus status = OrderStatus.valueOf(scanner.nextLine());

    System.out.print("How many items to this order: ");
    int numberOfItems = scanner.nextInt();
    scanner.nextLine();

    Client client = new Client(name, email, birthDate);
    Order order = new Order(new Date(), status, client);

    for (int i = 0; i < numberOfItems; i++) {
      System.out.printf("\nEnter #%d item data:", i + 1);

      System.out.print("\nProduct name: ");
      String productName = scanner.nextLine();

      System.out.print("Product price: ");
      double productPrice = scanner.nextDouble();

      System.out.print("Quantity: ");
      int productQuantity = scanner.nextInt();
      scanner.nextLine();

      order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
    }

    System.out.println("\nORDER SUMMARY:");
    System.out.println(order);
  }

}
