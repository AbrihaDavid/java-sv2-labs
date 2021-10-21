package arrayofarrays;

public class Triangular {

    public int [][] triangularMatrix(int size){
        int [][] triangle = new int[size][];
        for (int i = 0; i<size;i++){
            triangle[i] = new int [i+1];
            for (int b = 0; b<=i; b++){
                triangle[i][b] = i;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {

        Triangular triangular = new Triangular();
        triangular.triangularMatrix(4);
        for (int []i: triangular.triangularMatrix(4)){
            for (int k: i){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}

