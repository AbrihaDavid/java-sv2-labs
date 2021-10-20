package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl ic = new IntroControl();

        System.out.println(ic.subtractTenIfGreaterThanTen(20));
        System.out.println(ic.subtractTenIfGreaterThanTen(10));
        System.out.println(ic.describeNumber(20));
        System.out.println(ic.describeNumber(0));
        System.out.println(ic.greetingToJoe("Jozsi"));
        System.out.println(ic.greetingToJoe("Joe"));
        System.out.println(ic.calculateBonus(10));
        System.out.println(ic.calculateBonus(2000000));
        ic.printNumbers(10);
        ic.printNumbersBetween(11,20);
        ic.printNumbersBetweenAnyDirection(1,5);
        ic.printNumbersBetweenAnyDirection(5,1);
        ic.printOddNumbers(13);

    }
}
