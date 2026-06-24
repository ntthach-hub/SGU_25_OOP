package bai2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Document> documents;

    public LibraryManager() {
        this.documents = new ArrayList<>();
    }

    // Method to add new document to the list
    public void addDocument(Document document) {
        this.documents.add(document);
    }
    //Delete documents by document encoding.
    public boolean deleteDocument(String id){
        return documents.removeIf(doc -> doc.getId().equals(id));
    }
    //Display document information.
    public void showInfor(){
        this.documents.forEach(document -> System.out.println(document.toString()));
    }
    // search
    public void searchBook(){
        this.documents.stream()
                .filter(doc -> doc instanceof Book)
                .forEach(doc -> System.out.println(doc.toString()));
    }
    public void searchMagazine(){
        this.documents.stream()
                .filter(doc -> doc instanceof Magazine)
                .forEach(doc -> System.out.println(doc.toString()));
    }
    public void searchNewspaper(){
        this.documents.stream()
                .filter(doc -> doc instanceof Newspaper)
                .forEach(doc -> System.out.println(doc.toString()));
    }
}