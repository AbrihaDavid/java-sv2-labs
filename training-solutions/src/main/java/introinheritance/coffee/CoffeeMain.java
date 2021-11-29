package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.setName("Coffee Arabica");
        coffee.setPrice(4000);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Best cappuccino");
        cappuccino.setPrice(1000);
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
