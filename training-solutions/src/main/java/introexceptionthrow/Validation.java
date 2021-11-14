package introexceptionthrow;

public class Validation {

    public void validateName (String name){
        if (name.isEmpty()){
            throw new IllegalArgumentException("The provided name is either null or is empty");
        }
    }
    public void validateAge (String ageString){
        if (ageString.isEmpty()){
            throw new IllegalArgumentException("The provided information is empty");
        }
        try {
            Integer.parseInt(ageString);
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        if (Integer.parseInt(ageString) <0 || Integer.parseInt(ageString) > 120){
            throw new IllegalArgumentException("The given age is not between 0 and 120");
        }
    }
}
