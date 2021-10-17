package conventions;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("KIA","1.6",5,5);

        System.out.println(car.getCarType());
        System.out.println(car.getDoors());
        System.out.println(car.getEngineType());
        System.out.println(car.getPersons());

        car.setCarType("Honda");
        System.out.println(car.getCarType());
        car.setDoors(2);
        System.out.println(car.getDoors());
        car.setEngineType("1.2");
        System.out.println(car.getEngineType());
        car.setPersons(2);
        System.out.println(car.getPersons());
        car.addModelName("Jazz");
        System.out.println();



    }

}
