package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Integer> noteList = new ArrayList<>();

    public List<Integer> getNoteList() {
        return noteList;
    }

    public void addNote (int note) {
        if (note < 1 || note >5){
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        noteList.add(note);
    }
}
