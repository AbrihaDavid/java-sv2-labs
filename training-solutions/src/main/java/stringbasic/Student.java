package stringbasic;

public class Student {

    private Person person;
    private String neptun;
    private String eduID;
    private String accessCard;

    public Student(Person person, String neptun, String eduID) {
        this.person = person;
        this.neptun = neptun;
        this.eduID = eduID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getEduID() {
        return eduID;
    }

    public void setEduID(String eduID) {
        this.eduID = eduID;
    }

    public String getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(String accessCard) {
        this.accessCard = accessCard;
    }
}
