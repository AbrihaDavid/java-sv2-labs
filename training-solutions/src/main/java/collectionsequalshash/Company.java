package collectionsequalshash;

import java.util.Objects;

public class Company {

    private String name;
    private String taxNo;

    public Company(String name, String taxNo) {
        this.name = name;
        this.taxNo = taxNo;
    }

    public String getName() {
        return name;
    }

    public String getTaxNo() {
        return taxNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,taxNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        return Objects.equals(this.name,((Company) obj).name) && Objects.equals(this.taxNo, ((Company) obj).taxNo);
    }
}
