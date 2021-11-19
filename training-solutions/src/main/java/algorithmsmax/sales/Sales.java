package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson salesperson = null;

        for (Salesperson s: sales){
            if (salesperson == null || s.getAmount() > salesperson.getAmount()){
                salesperson = s;
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson salesperson = null;

        for (Salesperson s: sales){
            if (salesperson == null){
                salesperson = s;
            } else {
                if ((s.getAmount() - s.getTarget()) > (salesperson.getAmount() - salesperson.getTarget())){
                    salesperson = s;
                }
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        Salesperson salesperson = null;

        for (Salesperson s: sales){
            if (salesperson == null){
                salesperson = s;
            } else {
                if ((s.getAmount() - s.getTarget()) < (salesperson.getAmount() - salesperson.getTarget())){
                    salesperson = s;
                }
            }
        }
        return salesperson;
    }
}
