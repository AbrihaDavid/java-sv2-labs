package introconstructors;

import java.time.Clock;
import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime start(){
        startDateTime = LocalDateTime.now();
        return startDateTime;
    }

    public static void main(String[] args) {

        Task task = new Task("New task","Important task");
        System.out.println(task.start());
    }
}
