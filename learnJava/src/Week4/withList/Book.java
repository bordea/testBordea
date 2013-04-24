package Week4.withList;

// id , title and author
public class Book {

    protected int id;
    protected String title;
    protected Autor autor;

    // the default constructor
    public Book(){}

    //a constructor with id, title and author
    public Book(int id, String title, Autor autor){
        this.id = id;
        this.title = title;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor=" + autor +
                '}';
    }


}
