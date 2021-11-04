package controliteration.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        int prev = 0;
        int next = 1;
        for (int i = 1; i <= 30; ++i) {
            System.out.print(prev + " ");
            int sum = prev + next;
            prev = next;
            next = sum;
        }

        System.out.println();

        prev = 0;
        next = 1;
        int i=1;
        while(i <= 30){
            System.out.print(prev+" ");
            int sum = prev + next;
            prev = next;
            next = sum;
            i++;
        }
    }
}
