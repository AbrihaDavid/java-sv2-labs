package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {

    public String getCodesStartWithLetter (List<String> codes){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<codes.size();i++){
            char character = codes.get(i).toUpperCase().charAt(0);
            if (character >= 'A' && character <= 'Z'){
                stringBuilder.append(codes.get(i));
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();

        List<String> words = Arrays.asList("A5235","51qr","zSAD12","13fee","14dfdas","j5235f");
        System.out.println(codes.getCodesStartWithLetter(words));

    }
}
