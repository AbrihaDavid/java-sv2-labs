package classstructureintegrate;

public class Product {

    private String name;
    private int price;

    public Product (String name, int price) {

        this.name = name;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void increasePrice (int increase) {

        this.price = this.price + increase;

    }

    public void decreasePrice (int decrease) {

        this.price = this.price - decrease;
    }




}
