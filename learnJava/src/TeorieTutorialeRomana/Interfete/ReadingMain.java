package TeorieTutorialeRomana.Interfete;

public class ReadingMain {
    public void read(Document d){
        d.read();
    }

    static void realAll(Document[] d){
        for (int i = 0 ; i < d.length; i++){
            read(d[i]);
        }
    }

    public static void main (String [] main){
        Document docs = new Document[2];
        int i = 0;
        docs[i++] = new OnlineDocument();
        docs[i++] = new Book();

    }
}
