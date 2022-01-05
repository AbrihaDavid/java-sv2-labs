package collectionsqueue;

import java.util.*;

public class ToDoList {

    private List<ToDo> todos = new ArrayList<>();

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder(){
        Deque<ToDo> toDos = new ArrayDeque<>();

        for (ToDo t: todos){
            if (t.isUrgent()){
                toDos.push(t);
            } else {
                toDos.add(t);
            }
        }
        return toDos;
    }

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList(Arrays.asList(
                new ToDo("A",false),
                new ToDo("B",false),
                new ToDo("C",true),
                new ToDo("D",false)
        ));

        System.out.println(toDoList.getTodosInUrgencyOrder());
        System.out.println(toDoList.getTodosInUrgencyOrder().pop());
    }
}
