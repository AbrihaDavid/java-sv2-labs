package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B (4, "very good"), C (3, "improvement needed"), D (2, "close fail"), F (1, "fail");

    private int mark;
    private String nameOfMark;

    MarkType(int mark, String nameOfMark) {
        this.mark = mark;
        this.nameOfMark = nameOfMark;
    }

    public int getMark() {
        return mark;
    }

    public String getNameOfMark() {
        return nameOfMark;
    }
}
