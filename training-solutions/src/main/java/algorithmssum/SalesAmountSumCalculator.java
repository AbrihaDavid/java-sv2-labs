package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount (List<Salesperson> salesperson){
        int i = 0;
        for (Salesperson s: salesperson){
            i += s.getAmount();
        }
        return i;
    }
}
