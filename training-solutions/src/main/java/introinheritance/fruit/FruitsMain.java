package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("Fruit");
        fruit.setWeight(0.5);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("Grape");
        grape.setWeight(0.9);
        grape.setType("Merlot");
        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        Apple apple = new Apple();
        apple.setName("Apple");
        apple.setWeight(0.2);
        apple.setPieces(167);
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        GoldenDelicious golden = new GoldenDelicious();
        golden.setName("Golden apple");
        golden.setWeight(2);
        golden.setPieces(100);
        System.out.println(golden.getName());
        System.out.println(golden.getWeight());
        System.out.println(golden.getPieces());
        System.out.println(golden.getColour());

        Starking starking = new Starking();
        starking.setName("Starking apple");
        starking.setWeight(2);
        starking.setPieces(50);
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
