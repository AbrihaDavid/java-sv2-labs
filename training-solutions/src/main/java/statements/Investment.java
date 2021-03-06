package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment (int fund, int interestRate) {

        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;

    }

    public int getFund() {

        return this.fund;
    }


    public double getYield (int days) {

        return fund*((double)interestRate/100)/365*days;

    }

    public double close(int days) {

        double money = this.active ? (fund + this.getYield(days)) * (1 - cost/100) : 0.0;
        this.active = false;
        return money;

    }



}
