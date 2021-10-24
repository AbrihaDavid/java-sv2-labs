package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    private List<String> title = new ArrayList<>();

    public List<String> getTitle() {
        return title;
    }

    public void findBookAndSetAuthor (String title, String author){
        if (this.title.contains(title)){
            int i = this.title.indexOf(title);
            this.title.set(i,author + ": " + title + "!");
        }
    }

    public static void main(String[] args) {

        Books book = new Books();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many books do you want to add?");
        int numberOfBooks = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<numberOfBooks;i++){
            System.out.println("Please add book number: " + (i+1));
            book.title.add(sc.nextLine());
        }

        book.findBookAndSetAuthor("Good book","Best author");
        System.out.println(book.getTitle());
    }
}
