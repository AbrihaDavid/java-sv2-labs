package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Famous Author", "Famous book");

        book.register("This is going to be specified by the user");

        System.out.println("Name of the author: " + book.getAuthor() +", title of the book: "+ book.getTitle() +", regnumber of the book: "+ book.getRegNumber());





    }

}
