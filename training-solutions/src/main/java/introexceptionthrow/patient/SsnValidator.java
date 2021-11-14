package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn (String ssn){
        try {
            Integer.parseInt(ssn);
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        if (ssn.length() != 9){
            throw new IllegalArgumentException("The provided SSN is not 9 digit long");
        }
        int sum = 0;
        for (int i = 0; i<ssn.length()-1; i++){
            if (i % 2 == 0){
                sum = sum + ssn.charAt(i) * 3;
            } else {
                sum = sum + ssn.charAt(i) * 7;
            }
        }
        int remainder = sum % 10;
        int lastDigit = Character.getNumericValue(ssn.charAt(ssn.length()-1));
        return remainder == lastDigit;
    }
}
