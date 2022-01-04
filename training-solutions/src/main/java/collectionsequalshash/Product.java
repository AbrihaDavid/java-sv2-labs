package collectionsequalshash;

import java.util.Objects;

public class Product {

    private String name;
    private String regNumber;

    public Product(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        return Objects.equals(regNumber, ((Product) obj).getRegNumber());
    }
}
