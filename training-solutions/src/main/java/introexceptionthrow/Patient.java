package introexceptionthrow;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("The provided name is empty");
        } else {
            this.name = name;
        }
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("The provided year of birth is invalid");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        try {
            Patient patient = new Patient("John","52353235",1888);
            System.out.println("Patient data is ok");
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        try {
            Patient patientTwo = new Patient("","52353235",2000);
            System.out.println("Patient data is ok");
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        try {
            Patient patientThree = new Patient("John","52353235",2000);
            System.out.println("Patient data is ok");
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
