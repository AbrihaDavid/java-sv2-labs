package classstructureconstructors;

import java.util.Scanner;

public class Store {
    Scanner sc = new Scanner(System.in);

    private String product;
    private int stock = 0;

    public Store(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void store (){

        System.out.println("Please specify how many " + this.product + " would you like to purchase: ");
        this.stock = sc.nextInt() + this.stock;

    }

    public void dispatch() {

        System.out.println("Please specify how many " + this.product + " would you like to dispatch: ");
        this.stock =  this.stock - sc.nextInt();

    }



}
