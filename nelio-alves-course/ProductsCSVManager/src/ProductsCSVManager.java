import entities.Product;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ProductsCSVManager {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    URL url = ProductsCSVManager.class.getResource("source.csv");

    try (BufferedReader br = new BufferedReader(new FileReader(url.getPath()))) {
      String line = br.readLine();
      String productString;

      while (line != null) {
        productString = line;
        String[] productAttributes = productString.split(",");

        String productName = productAttributes[0];
        Double productPrice = Double.parseDouble(productAttributes[1]);
        Integer productQuantity = Integer.parseInt(productAttributes[2]);

        products.add(new Product(productName, productPrice, productQuantity));

        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("Error. The source file was not found.");
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(url.getPath()).getParent() + "\\summary.csv"))) {
      for (Product product : products) {
        bw.write(product.toString());
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
