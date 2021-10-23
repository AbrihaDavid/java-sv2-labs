package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        class Book {
        }
        new Book();
        System.out.println(new Book());
        Book emptyBook  = null;
        System.out.println(emptyBook);
        if (emptyBook == null){
            System.out.println("emptyBook is null");
        } else {
            System.out.println("emptyBook is not null");
        }
        Book book = new Book();
        book = new Book();
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);


        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book[] bookArray = {book1,book2,book3};

        List<Book> bookList = Arrays.asList(book1,book2,book3);
        List<Book> bookListEmpty = new ArrayList<>();
        bookListEmpty.add(book1);
        bookListEmpty.add(book2);
        bookListEmpty.add(book3);

        System.out.println(Arrays.toString(bookArray));
        System.out.println(bookList);
        System.out.println(bookListEmpty);
    }
}
