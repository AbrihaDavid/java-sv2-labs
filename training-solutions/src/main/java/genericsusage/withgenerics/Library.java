package genericsusage.withgenerics;

import java.util.List;

public class Library {


    public Book getFirstBooks(List<Book> books) {
        if (books == null){
            throw new NullPointerException("Is null");
        }
        if (books.isEmpty()){
            throw new IllegalArgumentException("Is empty");
        }
        return books.get(0);
    }
}
