package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int [][] a){
        for (int i =0; i<a.length;i++){
            for (int k = 0; k<a.length;k++){
                System.out.print(a[i][k] + " "); // "A beágyazott tömbök elemeit egymás mellé, a külső tömb elemeit egymás alá." Ez alapján így értelmeztem, de ha pont fordítva, akkor ugye a[k][i] a megoldás.
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayOfArrays aa = new ArrayOfArrays();
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        aa.printArrayOfArrays(a);
    }
}
