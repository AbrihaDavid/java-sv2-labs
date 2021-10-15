package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify the name of the product: ");
        String productName = sc.nextLine();

        System.out.println("Please specify the price of the product: ");
        int productPrice = sc.nextInt();

        Product product = new Product(productName,productPrice);

        System.out.println("The price of the product is currently: " + product.getPrice());

        System.out.println("Please increase the price of the product: ");
        product.increasePrice(sc.nextInt());

        System.out.println("The price of the product is currently: " + product.getPrice());


        System.out.println("Please decrease the price of the product: ");
        product.decreasePrice(sc.nextInt());

        System.out.println("The price of the product is currently: " + product.getPrice());

    }

}
