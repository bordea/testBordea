package Week4;

import java.util.Arrays;
import java.util.Date;

//id , name and dob
public class Autor {
    protected int id;
    protected String name;
    protected Date dob;
    protected Book[] bookArray;

    // the default constructor
    public Autor(){};

    public Autor(int id, String name, Date dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Autor(int id, String name, Date dob, Book[] array){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.bookArray =array;
    }

    //signature --> public + what type of variable it returns + numele signaturii + cate variabile ia + ce returneaza
    public Book[] getBookArray() {
        return bookArray;
    }

    public void setBookArray(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", bookArray=" + Arrays.toString(bookArray) +
                '}';
    }
}
