package classstructureconstructors;

import java.util.Scanner;

public class Book {

    private String author;
    private String title;
    private String regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(String regNumber){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the regNumber:");
        this.regNumber = sc.nextLine();

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }


}
