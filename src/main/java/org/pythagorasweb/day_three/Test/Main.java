package org.pythagorasweb.day_three.Test;

public class Main {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        // Adding contacts
        manager.addContact("Alice", "123-456-7890");
        manager.addContact("Bob", "098-765-4321");
        manager.addContact("Charlie", "555-555-5555");

        // Displaying all contacts
        System.out.println("All Contacts:");
        manager.displayContacts();

        // Searching for a contact
        System.out.println("\nSearching for Bob:");
        Contact contact = manager.searchContact("Bob");
        if (contact != null) {
            System.out.println("Found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }

        // Removing a contact
        System.out.println("\nRemoving Alice:");
        manager.removeContact("Alice");

        // Displaying all contacts after removal
        System.out.println("\nAll Contacts after removal:");
        manager.displayContacts();
    }
}
