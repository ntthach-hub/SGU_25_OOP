package bai2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Document> documents;

    public LibraryManager(){
        this.documents = new ArrayList<>();
    }
    // Method to add new document to the list
    public void addDocument(Document document){
        this.documents.add(document);
    }
}
