package methodchain;

public class ModifiedWord {

    public String modify(String word){
        return word.substring(0,1).toUpperCase().concat("x").concat(word.substring(2,3).toUpperCase()).concat("y");

    }
}
