package collectionsequalshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int findHowMany(Product product){
        int sum = 0;

        for (Product p: products){
            if (product.equals(p)){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        WebShop webShop = new WebShop(new ArrayList<>(
                Arrays.asList(
                        new Product("A","1020"),
                        new Product("B","102030"),
                        new Product("C","1020"),
                        new Product("D","10203040")
                )
        ));
        System.out.println(webShop.findHowMany(new Product("E","1020")));
    }
}
