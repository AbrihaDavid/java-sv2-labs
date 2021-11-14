package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Fish fishOne = new Fish("Carp","red");
        Fish fishTwo = new Fish("Carp","white");
        Fish fishThree = new Fish("Musky","silver");
        aquarium.addFish(fishOne);
        aquarium.addFish(fishTwo);
        aquarium.addFish(fishThree);

        System.out.println(aquarium.getNumberOfFish());
    }
}
