package numbers;

public class Percent {

    public double getValue(int numberOne, int numberTwo){
        return Math.round(numberOne  * (numberTwo / 100.0));
    }

    public double getBase(int numberOne, int numberTwo){
        return Math.round(numberOne * (100.0/numberTwo));
    }

    public double getPercent (int numberOne, int numberTwo){
        return (double) numberTwo / numberOne * 100;
    }

    public static void main(String[] args) {

        Percent percent = new Percent();

        System.out.println(percent.getValue(100,50));
        System.out.println(percent.getBase(100,50));
        System.out.println(percent.getPercent(1,50));
    }
}
