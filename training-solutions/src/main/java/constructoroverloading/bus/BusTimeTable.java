package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();
    private int firstHour;
    private int lastHour;
    private int everyMinute;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        while (firstHour <= lastHour){
            timeTable.add(new SimpleTime(firstHour,everyMinute));
            firstHour++;
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual){
        if (timeTable.get(timeTable.size()-1).getDifference(actual) < 0) {
            throw new IllegalStateException("Today's last bus has already departed!");
        }
        SimpleTime nextBus = null;
        for (SimpleTime simpleTime: timeTable){
            if (simpleTime.getDifference(actual) >= 0){
                nextBus = simpleTime;
                break;
            }
        }
        return nextBus;
    }
}
