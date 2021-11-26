package defaultconstructor;

import java.time.LocalDate;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day){
        if (!isCorrect(year,month,day)){
        }
        if (!isLeapYear(year)){
            if (day > 28){
                throw new IllegalArgumentException("Date is not correct");
            }
        }
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day){
        if (year <1900 || month > 12 || month < 1 || day < 1 || day > 31){
            return false;
        } else {
            return true;
        }
    }

    private boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 2, 1);
        return date.lengthOfMonth() == 29;
    }

    private int calculateMonthLength(int year, int month){

        LocalDate date = LocalDate.of(year,month,1);
        return date.lengthOfMonth();
    }

}
