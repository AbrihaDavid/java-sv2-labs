package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("A good book");
        System.out.println(book.getTitle());
        book.setTitle("A better book");
        System.out.println(book.getTitle());
    }
}
