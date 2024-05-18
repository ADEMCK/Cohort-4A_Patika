public class Book {
    public String name;
    private int pageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        if (pageNumber < 0) {
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }

    public int showPageNumber() {
        return this.pageNumber;
    }

    public void changePageNumber(int pageNumber) {
        if (pageNumber < 0) {
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
}
