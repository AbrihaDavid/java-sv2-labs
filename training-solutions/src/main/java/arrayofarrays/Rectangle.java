package arrayofarrays;

public class Rectangle {

    public int [][] rectangularMatrix(int size){
        int [][] rectangle = new int[size][size];
        for (int i = 0; i<size; i++){
            rectangle[i] = new int[size];
            for (int b = 0; b<size;b++){
                rectangle[i][b] = i;
            }
        }
        return rectangle;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        for (int []i: rectangle.rectangularMatrix(4)){
            for (int k: i){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
