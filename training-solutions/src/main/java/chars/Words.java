package chars;

public class Words {

    public void pushWord (String word){
        for (char c: word.toCharArray()){
            System.out.print((char) (c+1));
        }
    }

    public static void main(String[] args) {

        Words words = new Words();
        words.pushWord("apple");
    }
}
