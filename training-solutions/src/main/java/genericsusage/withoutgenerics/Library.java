package genericsusage.withoutgenerics;

import java.util.List;

public class Library {

    public Book getFirstBook(List books){
        if (books == null){
            throw new NullPointerException("Is null");
        }

        if (books.isEmpty()){
            throw new IllegalArgumentException("Is empty");
        }
        return (Book) books.get(0);
    }
}
