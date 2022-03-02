import exceptions.EmptyFileException;
import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductAveragePrice {
  public static void main(String[] args) {
    URL url = ProductAveragePrice.class.getResource("in.csv");
    List<Product> products = new ArrayList<>();

    try(BufferedReader br = new BufferedReader(new FileReader(url.getPath()))) {
      String line = br.readLine();

      if (line == null) {
        throw new EmptyFileException("Error: Empty source file");
      }

      String[] productFields;

      while (line != null) {
        productFields = line.split(",");
        String productName = productFields[0];
        Double productPrice = Double.parseDouble(productFields[1]);

        products.add(new Product(productName, productPrice));

        line = br.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch(NullPointerException e) {
      System.out.println("Error: File not found");
    } catch (EmptyFileException e) {
      System.out.println(e.getMessage());
    }

    Double productsPriceSum = products.stream().reduce(0d, (acc, cur) -> acc + cur.getPrice(), Double::sum);
    Double pruductsPriceAverage = productsPriceSum / products.size();

    System.out.printf("Average price: %.2f\n", pruductsPriceAverage);

    List<Product> inferiorPriceProducts = products.stream().filter(product -> product.getPrice() < pruductsPriceAverage).collect(Collectors.toList());
    inferiorPriceProducts.sort((p1, p2) -> -p1.getName().compareTo(p2.getName()));

    for(Product product : inferiorPriceProducts) {
      System.out.println(product.getName());
    }
  }
}
