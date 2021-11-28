package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;
    private SimpleTime time;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours,0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public SimpleTime getTime() {
        return time;
    }

    public int getDifference(SimpleTime time){
        int hour = (this.hours - time.hours) * 60;
        int min = this.minutes - time.minutes;
        return hour+min;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
