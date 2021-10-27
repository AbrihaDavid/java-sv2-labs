package typeconversion;

public class Conversion {

    public double convertDoubleToDouble (double number) {
        int intNumber = (int) number;
        return (double) intNumber;
    }

    public byte[] convertIntArrayToByteArray (int[] array){
        byte[] byteArray = new byte[array.length];

        for (int i = 0; i<array.length;i++){
            if (array[i] >= 0 && array[i] <= 127) {
                byteArray[i] = (byte) array[i];
            } else {
                byteArray[i] = -1;
            }
        }
        return byteArray;
    }

    public int getFirstDecimal (double number){
        return (int) ((number - (int) number) * 10);
    }
}
