package TeorieTutorialeRomana.Interfete;

class Book implements Document{
    String bookName;

    int numberOfPages;

    Book() {
    }

    Book(String bookName) {
        this.bookName = bookName;
    }

    Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    Book(String bookName, int numberOfPages) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    String getBookName() {
        return bookName;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void read() {
        System.out.println("We're reading a Book");
    }

    @Override
    public String toString() {
        return "OnlineDocument{" +
                "bookName='" + bookName + '\'' +
                "numberOfPages='" + numberOfPages + '\'' +
                '}';
    }
}
