package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class ItemMain {
    public static void read(Document d){
        d.read();
    }

    static boolean isFree(OnlineDocument od){
        return od.isFree(od);
    }

    public static void canBeReadInAday(Book b){
        b.canBeReadInAday();
    }

    public static Integer sugarGrams(Chocolate c){
        return c.sugarGrams(c);
    }

    public static void main (String [] main){
        OnlineDocument online1 = new OnlineDocument("www.online_books.com",5);
        OnlineDocument online2 = new OnlineDocument("www.online_books.com",3);
        OnlineDocument online3 = new OnlineDocument("www.classic_books.com",0);
        OnlineDocument online4 = new OnlineDocument("www.online_books.com",0);
        OnlineDocument online5 = new OnlineDocument("www.classic_books.com",0);

        ArrayList<OnlineDocument> onlineDocs = new ArrayList<OnlineDocument>();
        onlineDocs.add(online1);
        onlineDocs.add(online2);
        onlineDocs.add(online3);
        onlineDocs.add(online4);
        onlineDocs.add(online5);

        for (OnlineDocument od: onlineDocs){
            System.out.println(isFree(od));
        }

        Book book1 = new Book("Cartea Cartilor", 1000);
        Book book2 = new Book("Bible", 1224);
        Book book3 = new Book("Fat Frumos",125);
        Book book4 = new Book("Java", 900);
        Book book5 = new Book("Retete Culinare",100);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book b : books){
            canBeReadInAday(b);
        }

        Newspaper ziar1 = new Newspaper("Ziua", 5);
        Newspaper ziar2 = new Newspaper("Samanta Adevarului", 4);
        Newspaper ziar3 = new Newspaper("Evenimentul Zilei",5);
        Newspaper ziar4 = new Newspaper("Adevarul", 4);
        Newspaper ziar5 = new Newspaper("Java daily",9);

        ArrayList<Newspaper> ziare = new ArrayList<Newspaper>();
        ziare.add(ziar1);
        ziare.add(ziar2);
        ziare.add(ziar3);
        ziare.add(ziar4);
        ziare.add(ziar5);

        for (Newspaper b : ziare){
            read(b);
            if (b.isCheap(b)){
                System.out.println("The newspapaer IS cheap");
            }
            else{
                System.out.println("The newspapaer AINT'T cheap");
            }
        }

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

        for (Document d : docs){
            System.out.println(d);
        }

        for (Document d : docs){
            read(d);
        }

        Poiana poianaAerata = new Poiana("Poiana",100,15,"Aerata");
        Poiana poianaAmaruie = new Poiana("Poiana",500,98,"Amaruie");
        Poiana poianaAlba = new Poiana("Poiana",245,45,"Alba");
        Cadbury snikers = new Cadbury("Cadbury",200,35,"Romania");
        Cadbury mars = new Cadbury("Cadbury",350,40,"Japan");
        Cadbury twix = new Cadbury("Cadbury",175,30,"Scotland");
        Cadbury twirl = new Cadbury("Cadbury",200,80,"Ireland");
        Map<Chocolate,Integer> chocs = new HashMap<Chocolate, Integer>();
        chocs.put(poianaAerata,sugarGrams(poianaAerata));
        chocs.put(poianaAmaruie,sugarGrams(poianaAmaruie));
        chocs.put(poianaAlba,sugarGrams(poianaAlba));
        chocs.put(snikers,sugarGrams(snikers));
        chocs.put(mars,sugarGrams(mars));
        chocs.put(twix,sugarGrams(twix));
        chocs.put(twirl,sugarGrams(twirl));
        for (Chocolate cheia : chocs.keySet()){
            System.out.print(cheia);
            System.out.println(chocs.get(cheia));
        }
    }
}







