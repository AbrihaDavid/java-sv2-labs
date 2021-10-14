package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();

        note.setName("User");
        note.setTopic("Very important topic");
        note.setText("Very important text");

        System.out.println(note.getNoteText());

    }
}
