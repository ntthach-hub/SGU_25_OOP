package bai2;

import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager();

        while (true){
            System.out.println("\n --- Application manager document");
            System.out.println("1. Add new document");
            System.out.println("2. Delete documents by document ID");
            System.out.println("3. Display information about the document");
            System.out.println("4. Search document by category");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice){
                case "1":{
                    System.out.println("Select document type to add: ");
                    System.out.println("a. Book");
                    System.out.println("b. Magazine");
                    System.out.println("c. Newspaper");
                    System.out.println("Enter type: ");
                    String type = scanner.nextLine();


                    switch (type){
                        case "a":{
                            System.out.println("Enter id: ");
                            String id = scanner.nextLine();
                            System.out.println("Enter publisher: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Enter number: ");
                            int number = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter author: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter Page count: ");
                            int numberPage = scanner.nextInt();

                            Document book = new Book(id, publisher, number, author, numberPage);
                            libraryManager.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "b":{
                            System.out.println("Enter id: ");
                            String id = scanner.nextLine();
                            System.out.println("Enter publisher: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.println("Enter issueNumber: ");
                            int issueNumber = scanner.nextInt();
                            System.out.println("Enter issueMonth: ");
                            int issueMonth = scanner.nextInt();

                            Document magazine = new Magazine(id, publisher, number, issueNumber,issueMonth);
                            libraryManager.addDocument(magazine);
                            System.out.println(magazine.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c":{
                            System.out.println("Enter id: ");
                            String id = scanner.nextLine();
                            System.out.println("Enter publisher: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.println("Enter Release Day(1-31): ");
                            int releaseDate = scanner.nextInt();

                            Document newspaper = new Newspaper(id,publisher,number,releaseDate);
                            libraryManager.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            System.out.println("Invalid type selection! Returning to main menu.");
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.println("Enter Document ID to delete: ");
                    String id = scanner.nextLine();
                    libraryManager.deleteDocument(id);
                    break;
                }
                case "3":{
                    System.out.println("All Registered library documents");
                    libraryManager.showInfor();
                    break;
                }
                case "4":{
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search magazine");
                    System.out.println("Enter c to search Newspaper");
                    String choise = scanner.nextLine();
                    switch (choise){
                        case "a": {
                            libraryManager.searchBook();
                            break;
                        }
                        case "b":{
                            libraryManager.searchMagazine();
                            break;
                        }
                        case "c":{
                            libraryManager.searchNewspaper();
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "5":{
                    System.out.println(" Exiting program...");
                    scanner.close();
                    return;
                }
                default:{
                    System.out.println(" Invalid choice. Please try again.");
                    break;
                }
            }
        }
    }
}
