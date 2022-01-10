package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {

    private String teacherName;
    private String className;
    private LocalDateTime lessonStartTime;

    public OnlineLesson(String teacherName, String className, LocalDateTime lessonStartTime) {
        this.teacherName = teacherName;
        this.className = className;
        this.lessonStartTime = lessonStartTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getClassName() {
        return className;
    }

    public LocalDateTime getLessonStartTime() {
        return lessonStartTime;
    }
}
