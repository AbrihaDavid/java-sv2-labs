package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public List<String> makeToDoList() {
        Scanner sc = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();
        String stuffToDo = "";
        while (!stuffToDo.equals("x")) {
            System.out.println("Please add an element to your todo list. You can always quit by typing: x");
            stuffToDo = sc.nextLine();
            if (!stuffToDo.equals("x")) {
                toDoList.add(stuffToDo);
            }
        }
        return toDoList;
    }

    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        try {
            Files.write(Paths.get("todos.txt"),toDo.makeToDoList());
        }
        catch (IOException ioe){
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }

    }
}
