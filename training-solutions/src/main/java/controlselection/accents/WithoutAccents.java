package controlselection.accents;

public class WithoutAccents {

    public char removeAccent(char c){
        String charsWithAccent = "áéíóöőúüű";
        char withoutAccent = c;
        if (!charsWithAccent.contains(Character.toString(c))) {
            return withoutAccent;
        } else {
            switch (c){
                case 'á':
                    withoutAccent = 'a';
                    break;
                case 'é':
                    withoutAccent = 'e';
                    break;
                case 'í':
                    withoutAccent = 'i';
                    break;
                case 'ó', 'ö', 'ő':
                    withoutAccent = 'o';
                    break;
                case 'ú', 'ü', 'ű':
                    withoutAccent = 'u';
                    break;
            }
            return withoutAccent;
        }
    }
}
