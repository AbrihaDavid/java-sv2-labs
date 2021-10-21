package array;

public class ArrayHandler {

    public void addIndexToNumber (int[] source){
        for (int i = 0; i<source.length;i++){
            source[i] = source[i] + i;}
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {

        ArrayHandler ah = new ArrayHandler();
        int [] nums = {1,2,3,4,5};
        String [] words = {"apple","peach", "banana", "melon"};

        ah.addIndexToNumber(nums);
        for (int i: nums){
            System.out.println(i);
        }
        for (int i: nums){
            if (i == nums[nums.length-1]){
                System.out.print(i);
            } else{
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        ah.concatenateIndexToWord(words);
        for (String i: words){
            System.out.println(i);
        }
        for (String i: words){
            if (i.equals(words[words.length-1])){
                System.out.print(i);
            } else{
                System.out.print(i + ", ");
            }
        }
    }
}
