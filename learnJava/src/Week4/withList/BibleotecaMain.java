package Week4.withList;

import java.util.ArrayList;
import java.util.Date;

public class BibleotecaMain {

    public static void main(String args[]){

        Autor autor1 = new Autor(111,"Cosbuc",new Date(2000,12,2));
        Autor autor2 = new Autor(222,"Petre",new Date(1900,12,2));
        Autor autor3 = new Autor(333,"Eminescu",new Date(1950,12,2));

        Book cartea1 = new Book(10,"Cartea Cartilor",autor1);
        System.out.println(cartea1);

        Book cartea2 = new Book(11,"C1",autor1);
        System.out.println(cartea2);

        Book[] bookAr;
        bookAr = new ArrayList<Book>();
        bookAr.add(cartea1);
        bookAr.add(cartea2);

        autor1.setBookArray(bookAr);

        Book cartea3 = new Book(12,"CarteaTrei",autor2);
        System.out.println(cartea1);

        Book cartea4 = new Book(13,"CartePatru",autor2);
        System.out.println(cartea2);

        ArrayList<Book> bookAr2;
        bookAr2 = new ArrayList<Book>();

        bookAr2.add(cartea3);
        bookAr2.add(cartea4);

        autor2.setBookArray(bookAr2);

        Book cartea5 = new Book(14,"CarteaCinci",autor3);
        System.out.println(cartea5);

        Book cartea6 = new Book(15,"CarteSase",autor3);
        System.out.println(cartea6);

        Book[] bookAr3;
        bookAr3 = new Book[2];
        bookAr3[0] = cartea5;
        bookAr3[1] = cartea6;

        ArrayList<Autor> autorArr;
        autorArr = new ArrayList<Autor>();
        autorArr.add(autor1);
        autorArr.add(autor3);
        autorArr.add(autor2);

        autor3.setBookArray(bookAr3);

        printAuthorBooks(autor1);

        printGivenArray(bookAr);

        printCartiAutor(autorArr);
    }

//metoda primeste un sir de autori si printeaza cartile tuturor autorilor primiti

//metoda care afiseaza un array de bookuri dat

    private static void printGivenArray(Book[] bookAr){
        int len = bookAr.length;
        for (int i=0;i< len; i++){
            System.out.println("Printing element number" + i + " --> " + bookAr[i]);
        }
    }

    private static void printAuthorBooks(Autor autor) {
        System.out.println("in printAuthorBooks ....");

        int len=autor.getBookArray().size();

        ArrayList<Book> arrayBook = autor.getBookArray();

        for (int i=0;i<len;i++){
//            Book currentBook = autor.getBookArray()[i];
            Book currentBook = arrayBook.get(i);
            System.out.println(currentBook);
        }
        System.out.println("end printAuthorBooks ....");

    }

    private static void printCartiAutor(ArrayList<Autor> aArr){
        int lenAut = aArr.size();

        for (int i=0; i<=lenAut; i++);{
            System.out.println("Pentru Autorul ");
            for  (int j=0; j<(aArr.get(j).getBookArray().size()); j++){
                System.out.println(aArr.get(j).getBookArray() );
            }

        }
    }
}
