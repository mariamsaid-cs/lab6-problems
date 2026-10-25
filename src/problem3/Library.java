package problem3;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity){
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }
    public boolean add(Document doc){
        if(documents.size() < capacity){
            documents.add(doc);
            return true;
        }
        System.out.println("Library is full! cannot add: " + doc.getTitle());
        return false;
    }
    public boolean delete(Document doc){
        return documents.remove(doc);
    }
    public Document document(int numReg){
        for(Document doc : documents){
            if(doc.getNumRec() == numReg){
                return doc;
            }
        }
        return null;
    }
    public void displayDocuments(){
        System.out.println("*** Library contents ***");
        for(Document doc : documents){
            System.out.println(doc);
        }
    }
    public void displayAuthors(){
        System.out.println("*** Authors in library ***");
        for(Document doc : documents){
            if(doc instanceof Book){
                Book b = (Book) doc;
                System.out.println("Author: " + b.getAuthor());
            }
        }
    }
}
