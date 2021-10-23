package objects;

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


    }
}
