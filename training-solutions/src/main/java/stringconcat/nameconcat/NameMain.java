package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {

        Name name = new Name("Doe","Jack","John",Title.DR);
        System.out.println(name.concatNameWesternStyle());
        System.out.println(name.concatNameHungarianStyle());

    }
}
