package TeorieTutorialeRomana.Interfete;

import java.util.ArrayList;

public class ReadingMain {
    public static void read(Document d){
        d.read();
    }

    static void readAll(Document[] d){
        for (int i = 0 ; i < d.length; i++){
            read(d[i]);
        }
    }

    public static void main (String [] main){
        Document online1 = new OnlineDocument("www.online_books.com",5);
        Document online2 = new OnlineDocument("www.online_books.com",3);
        Document online3 = new OnlineDocument("www.classic_books.com",10);
        Document online4 = new OnlineDocument("www.online_books.com",0);
        Document online5 = new OnlineDocument();
        Document book1 = new Book();
        Document book2 = new Book();
        Document book3 = new Book();
        Document book4 = new Book();
        Document book5 = new Book();

        ArrayList<Document> docs = new ArrayList<Document>();
        docs.add(online1);
        docs.add(online2);
        docs.add(online3);
        docs.add(online4);
        docs.add(online5);
        docs.add(book1);
        docs.add(book2);
        docs.add(book3);
        docs.add(book4);
        docs.add(book5);
    }
}









