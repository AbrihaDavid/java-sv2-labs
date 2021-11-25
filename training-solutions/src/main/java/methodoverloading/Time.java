package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time){
        if (time.getHours() == hours && time.getMinutes() == minutes && time.getSeconds() == seconds){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEqual(int hours, int minutes, int seconds){
        Time time = new Time(hours,minutes,seconds);
        return isEqual(time);
    }

    public boolean isEarlier(Time time){
        if (time.getHours()*3600+time.getMinutes()*60+time.getSeconds() > hours*3600+minutes*60+seconds){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEarlier(int hours, int minutes, int seconds){
        Time time = new Time(hours,minutes,seconds);
        return isEarlier(time);
    }
}
