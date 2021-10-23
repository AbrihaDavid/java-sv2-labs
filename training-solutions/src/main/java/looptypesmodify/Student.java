package looptypesmodify;

public class Student {

    private String name;
    private boolean active = true;

    public Student (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setActive (boolean active){
        this.active = active;
    }
}
