package classstructureconstructors;


public class StoreMain {

    public static void main(String[] args) {
        Store awesomeStuff = new Store("Awesome stuff");
        Store awfulStuff = new Store("Awful stuff");

        System.out.println("Current stock of Awesome stuff: " + awesomeStuff.getStock());
        awesomeStuff.store();
        System.out.println("Current stock of Awesome stuff: " + awesomeStuff.getStock());

        awesomeStuff.dispatch();
        System.out.println("Current stock of Awesome stuff: " + awesomeStuff.getStock());



        System.out.println("Current stock of Awful stuff: " + awfulStuff.getStock());
        awfulStuff.store();
        System.out.println("Current stock of Awful stuff: " + awfulStuff.getStock());

        awfulStuff.dispatch();
        System.out.println("Current stock of Awful stuff: " + awfulStuff.getStock());
    }


}
