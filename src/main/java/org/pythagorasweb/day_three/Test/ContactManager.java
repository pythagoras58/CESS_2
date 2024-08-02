package org.pythagorasweb.day_three.Test;

import java.util.*;

public class ContactManager {
    private List<Contact> contacts;
    private Map<String, Contact> contactMap;

    public ContactManager() {
        contacts = new ArrayList<>();
        contactMap = new HashMap<>();
    }

    // Method to add a contact
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        contactMap.put(name, contact);
    }

    // Method to remove a contact by name
    public void removeContact(String name) {
        Contact contact = contactMap.remove(name);
        if (contact != null) {
            contacts.remove(contact);
        }
    }

    // Method to search for a contact by name
    public Contact searchContact(String name) {
        return contactMap.get(name);
    }

    // Method to display all contacts
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
