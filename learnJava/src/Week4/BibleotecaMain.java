package Week4;

import java.util.Date;

public class BibleotecaMain {

    public static void main(String args[]){

        Autor autor1 = new Autor(111,"Cosbuc",new Date(2000,12,2));
        Autor autor2 = new Autor(222,"Petre",new Date(1900,12,2));
        Autor autor3 = new Autor(333,"Eminescu",new Date(1950,12,2));

        Book cartea1 = new Book (10,"Cartea Cartilor",autor1);
        System.out.println(cartea1);

        Book cartea2 = new Book (11,"C1",autor1);
        System.out.println(cartea2);

        Book[] bookAr;
        bookAr = new Book[2];
        bookAr[0] = cartea1;
        bookAr[1] = cartea2;

        autor1.setBookArray(bookAr);

        Book cartea3 = new Book (12,"CarteaTrei",autor2);
        System.out.println(cartea1);

        Book cartea4 = new Book (13,"CartePatru",autor2);
        System.out.println(cartea2);

        Book[] bookAr2;
        bookAr2 = new Book[2];
        bookAr2[0] = cartea3;
        bookAr2[1] = cartea4;

        autor2.setBookArray(bookAr2);

        Book cartea5 = new Book (14,"CarteaCinci",autor3);
        System.out.println(cartea5);

        Book cartea6 = new Book (15,"CarteSase",autor3);
        System.out.println(cartea6);

        Book[] bookAr3;
        bookAr3 = new Book[2];
        bookAr3[0] = cartea5;
        bookAr3[1] = cartea6;

        Autor[] autorArr;
        autorArr = new Autor[3];
        autorArr[0] = autor1;
        autorArr[1] = autor2;
        autorArr[2] = autor3;

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

        int len=autor.getBookArray().length;

        Book[] arrayBook = autor.getBookArray();

        for (int i=0;i<len;i++){
//            Book currentBook = autor.getBookArray()[i];
            Book currentBook = arrayBook[i];
            System.out.println(currentBook);
        }
        System.out.println("end printAuthorBooks ....");

    }

    private static void printCartiAutor(Autor[] aArr){
        int len = aArr.length;
        System.out.println();
        for (int i=0; i<len;i++){
            printAuthorBooks(aArr[i]);
        }
    }
}
