package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int i = amount % 10;
        if (i == 0 || i == 5) {
            return amount;
        } else if (i == 1 || i == 2) {
            return amount - i;
        } else if (i == 3 || i == 4 || i == 6 || i == 7) {
            return amount - i + 5;
        } else {
            return amount - i + 10;
        }
    }
}
