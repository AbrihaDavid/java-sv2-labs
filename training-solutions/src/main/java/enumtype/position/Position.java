package enumtype.position;

public enum Position {
    CEO(1000000,"car, mobile, parking spot"), COO(900000,"car, mobile"), CFO(800000,"car"), SECRETARY(30000,"sadly nothing");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
