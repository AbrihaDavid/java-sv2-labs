package attributes.bill;

public class Bill {

    public static void main(String[] args) {

        BillItem billItem = new BillItem("Expensive product",50000,2,27.5);
        System.out.println(billItem.calculateTotalPrice());
    }
}
