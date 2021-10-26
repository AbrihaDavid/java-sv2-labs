package operators;

public class Operators {

    String binary = Integer.toBinaryString(255);

    public boolean isEven (int n){
        return n % 2 == 0;
    }

    public String getResultOfDivision(int number, int divisor){
        int remainder = number % divisor;
        return number + " / " + divisor + " = " + (number/divisor) + ", maradék: " + remainder;
    }

    public String isNull (String s){
        return s == null ? "null értékű" : "nem null értékű";
    }

    public boolean isEmpty (String s){
        return s == null || "".equals(s);
    }

}
