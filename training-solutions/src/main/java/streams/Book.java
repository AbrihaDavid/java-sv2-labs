package streams;

public class Book {

    private String author;
    private String title;
    private int length;

    public Book(String author, String title, int length) {
        this.author = author;
        this.title = title;
        this.length = length;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
