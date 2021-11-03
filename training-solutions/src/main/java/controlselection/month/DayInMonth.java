package controlselection.month;

public class DayInMonth {

    public int numberOfDayInMonth (int year, String month){
        int days;

        switch (month.toLowerCase()){
            case "január", "március", "május", "július", "augusztus", "október", "december":
                days = 31;
                break;
            case "április","június","szeptember","november":
                days = 30;
                break;
            case "február":
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                days = 0;
        }
        return days;
    }
}
