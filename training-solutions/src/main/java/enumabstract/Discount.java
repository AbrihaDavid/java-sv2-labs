package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        @Override
        double getAmountToPay(int price, int pieces) {
            return pieces*price*0.8;
        }
    }

    ,BLACK_FRIDAY_OFFER {
        @Override
        double getAmountToPay(int price, int pieces) {
            if (pieces == 1 || pieces == 2){
                return pieces*price*0.75;
            }
            if (pieces >= 3){
                return 1*price*0.5 + (pieces-1)*price*0.75;
            }
            return 0;
        }
    };

    abstract double getAmountToPay(int price, int pieces);
}
