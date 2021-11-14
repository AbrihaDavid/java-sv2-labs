package introexceptionthrow.patient;

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

        SsnValidator ssnValidator = new SsnValidator();
        Patient patient = new Patient("David","123456788",1995);
        System.out.println(ssnValidator.isValidSsn(patient.getSocialSecurityNumber()));
    }
}
