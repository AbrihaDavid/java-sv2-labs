package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private LocalDate date = LocalDate.of(2021,10,20);
    private String artist = "Rammstein";
    private LocalTime startTime = LocalTime.of(8,30);
    private LocalTime endTime = LocalTime.of(10,30);

    public LocalDate getDate(){
        return date;
    }

    public String getArtist(){
        return artist;
    }

    public LocalTime getStartTime(){
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo(){
        return artist+ ": " + date + " " + startTime + " - " + endTime;
    }
}
