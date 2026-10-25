package problem3;

public class Document {
    private static int nextNumRec = 1;
    protected int numRec;
    protected String title;

    public Document(String title){
        this.numRec = nextNumRec++;
        this.title = title;
    }

    public int getNumRec(){return this.numRec;}
    public String getTitle(){return this.title;}
    @Override
    public String toString(){
        return "DOC #" + numRec + " - Title: " + title;
    }
}
