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
        System.out.println("We're reading a Book called " + bookName);
    }

    void canBeReadInAday(){
        if (numberOfPages < 1100){
            System.out.println("The book " + bookName + " CAN be read in one day");
        }
        else {
            System.out.println("The book " + bookName + " CANNOT be read in one day");
        }
    }

    @Override
    public String toString() {
        return "OnlineDocument{" +
                "bookName='" + bookName + '\'' +
                "numberOfPages='" + numberOfPages + '\'' +
                '}';
    }
}
