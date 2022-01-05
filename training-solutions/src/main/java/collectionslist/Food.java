package collectionslist;

import java.time.LocalDate;

public class Food {

    private String name;
    private LocalDate expDate;

    public Food(String name, LocalDate expDate) {
        this.name = name;
        this.expDate = expDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpDate() {
        return expDate;
    }
}
