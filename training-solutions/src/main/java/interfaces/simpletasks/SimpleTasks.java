package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable{

    private List<String> tasks = new ArrayList<>();

    @Override
    public void run() {
        while (nextStep()){
            nextStep();
        }
    }

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep(){
        if (!tasks.isEmpty()){
            tasks.remove(tasks.size()-1);
            return true;
        }
        return false;
    }
}
