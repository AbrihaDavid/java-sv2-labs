package conversions;

public class TooBigNumber {

    public long getRightResult (int number){
        return 2147483647L+number;
    }

    public static void main(String[] args) {

        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(1));
    }
}
