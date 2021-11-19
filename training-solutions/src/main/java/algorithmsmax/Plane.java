package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map){
        int max = Integer.MIN_VALUE;
        int counter = 0;

        for (int i = 0; i<map.length();i++){
            if (Character.getNumericValue(map.charAt(i)) == 0){
                counter++;
            } else {
                if (counter > max){
                    max = counter;
                }
                counter = 0;
            }
        }
        return max;
    }
}
