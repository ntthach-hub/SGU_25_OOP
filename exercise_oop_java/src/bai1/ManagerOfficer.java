package bai1;

import java.util.ArrayList;
import java.util.List;

public class ManagerOfficer {
    // List to store all officers
    private List<Officers> officers ;

    // Constructor initializes the empty list
    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    // Method to add a new officer to the list
    public void addOfficer(Officers officer) {
        this.officers.add(officer);
    }

    // Method to search and display officers by their name
    public void searchOfficerByName(String name) {
        boolean isFound = false;
        for (Officers officer : officers) {
            // Using contains() and toLowerCase() for a more flexible, case-insensitive search
            if (officer.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(officer.toString());
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Not found any officer with name: " + name);
        }
    }

    // Method to display all officers in the current list
    public void showListOfficers() {
        if (this.officers.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        for (Officers officer : officers) {
            System.out.println(officer.toString());
        }
    }
}
