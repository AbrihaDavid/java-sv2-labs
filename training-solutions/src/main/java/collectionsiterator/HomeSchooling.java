package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> onlineLessons = new ArrayList<>();

    public HomeSchooling(List<OnlineLesson> onlineLessons) {
        this.onlineLessons = onlineLessons;
    }

    public List<OnlineLesson> getOnlineLessons() {
        return onlineLessons;
    }

    public void addNewLesson(OnlineLesson lesson){

        int index = onlineLessons.size();
        for (int i = 0; i < onlineLessons.size() - 1; i++) {
            LocalDateTime startTimeOfLessonBefore = onlineLessons.get(i).getLessonStartTime();
            LocalDateTime startTimeOfLessonAfter = onlineLessons.get(i + 1).getLessonStartTime();
            if (startTimeOfLessonBefore.isBefore(lesson.getLessonStartTime()) && startTimeOfLessonAfter.isAfter(lesson.getLessonStartTime())) {
                index = i + 1;
            }
        }
        onlineLessons.add(index, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title){
        List<OnlineLesson> result = new ArrayList<>();

        for (Iterator<OnlineLesson> iterator = onlineLessons.iterator();iterator.hasNext();){
            OnlineLesson lesson = iterator.next();
            if (lesson.getClassName().equals(title)){
                result.add(lesson);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime){
        for (Iterator<OnlineLesson> iterator = onlineLessons.iterator();iterator.hasNext();){
            OnlineLesson lesson = iterator.next();
            if (lesson.getLessonStartTime().equals(startTime)){
                iterator.remove();
            }
        }
    }
}
