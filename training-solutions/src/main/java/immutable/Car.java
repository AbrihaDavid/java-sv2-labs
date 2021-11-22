package immutable;

import java.time.Year;

public class Car {

    private final String brand;
    private final String model;
    private final int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {

        if (brand.isEmpty()){
            throw new IllegalArgumentException("Brand name cannot be empty!");
        } else {
            this.brand = brand;
        }

        if (yearOfProduction > Year.now().getValue()){
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        } else {
            this.yearOfProduction = yearOfProduction;
        }
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
