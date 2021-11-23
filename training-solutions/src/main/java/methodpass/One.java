package methodpass;

public class One {

    public int addOne (int number){
        return number++;
    }

    public static void main(String[] args) {
        One one = new One();

        int number = 10;
        System.out.println(number);
        number++;
        System.out.println(number);

        System.out.println(one.addOne(number));
        System.out.println(number);

    }
}
