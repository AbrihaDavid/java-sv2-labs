package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }



    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus (int sale) {
        if (sale >= 1000000) {
            return sale/10;
        } else {
            return 0;
        }
    }

// A "calculateConsumption" feladat szövege nem volt teljesen világos, ezért azt kihagytam

    public void printNumbers (int max){
        for (int i = 0; i<max+1; i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetween (int min, int max){
        if (min >= 0 && max >= 0){
            for (int i = min; i<max+1; i++){
                System.out.println(i);
            }
        }
    }

    public void printNumbersBetweenAnyDirection (int a, int b){
        if (a<b){
            for (int i = a; i<b+1 ; i++){
                System.out.println(i);
            }
        } else {
            for (int i = a; i>b-1; i--){
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers (int max){
        for (int i = 1; i<max+1; i+=2){
            System.out.println(i);
        }
    }

}
