package linebreak;

public class Car {

    public String getBrandAnyTypeInSeparateLines(String band, String type) {
        return band + "\n" + type;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAnyTypeInSeparateLines("KIA", "Ceed"));
    }
}

