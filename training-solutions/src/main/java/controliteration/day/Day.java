package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {

    private List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour (Hour hour){
        hoursOfDay.add(hour);
    }

    public void setDayPeriod(){

        for (Hour hour: hoursOfDay){
            if (hour.getHourNumber() >= 6 && hour.getHourNumber() < 22){
                hour.setPeriod(DayPeriod.DAYTIME);
            } else {
                hour.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

    public static void main(String[] args) {

        Day day = new Day();

        day.addHour(new Hour(18));
        day.addHour(new Hour(10));
        day.addHour(new Hour(5));
        day.addHour(new Hour(23));

        System.out.println(day.getHoursOfDay().get(0).getPeriod());
        System.out.println(day.getHoursOfDay().get(2).getPeriod());

        day.setDayPeriod();
        System.out.println(day.getHoursOfDay().get(0).getPeriod());
        System.out.println(day.getHoursOfDay().get(2).getPeriod());
    }
}
