package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();

        // Infinite loop to keep the menu running until the user chooses to exit
        while (true) {
            System.out.println("\n--- OFFICER MANAGEMENT SYSTEM ---");
            System.out.println("1. Add new officer");
            System.out.println("2. Search officer by name");
            System.out.println("3. Show officer list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": {
                    System.out.println("Select officer type to add: ");
                    System.out.println("a. Worker");
                    System.out.println("b. Engineer");
                    System.out.println("c. Staff");
                    System.out.print("Enter type: ");
                    String type = scanner.nextLine();

                    // Prompt common attributes
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    // Handle specific attributes based on officer type
                    switch (type) {
                        case "a": {
                            System.out.print("Enter level (1-10): ");
                            int level = Integer.parseInt(scanner.nextLine());
                            Officers worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println("Worker added successfully!");
                            break;
                        }
                        case "b": {
                            System.out.print("Enter major: ");
                            String major = scanner.nextLine();
                            Officers engineer = new Engineer(name, age, gender, address, major);
                            managerOfficer.addOfficer(engineer);
                            System.out.println("Engineer added successfully!");
                            break;
                        }
                        case "c": {
                            System.out.print("Enter job: ");
                            String job = scanner.nextLine();
                            Officers staff = new Staff(name, age, gender, address, job);
                            managerOfficer.addOfficer(staff);
                            System.out.println("Staff added successfully!");
                            break;
                        }
                        default:
                            System.out.println("Invalid type!");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    System.out.println("--- Search Results ---");
                    managerOfficer.searchOfficerByName(searchName);
                    break;
                }
                case "3": {
                    System.out.println("--- Officer List ---");
                    managerOfficer.showListOfficers();
                    break;
                }
                case "4": {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return; // Terminates the main method
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        }
    }
}
