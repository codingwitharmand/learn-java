package com.cwa.practice;

import java.util.*;

public class Practice {

    //TODO: Add contact to list
    //TODO: Edit and delete contact by email
    //TODO: Sort list by lastname
    //TODO: Search contacts by phone number or email. Throw an exception if contact is not found
    //TODO: Get emails of all my contacts
    //TODO: Build a map with phone number as key and name as value
    public static void main(String[] args) {

        List<Contact> contacts = buildContactList();
        Contact john = new Contact("John", "Spencer", "0123456789", "john@gmail.com");
        contacts.add(john);
        editContact(contacts, "lisa.brown@example.com", "111111111");
        deleteContact(contacts, "jane.doe@example.com");
        sortByFirstname(contacts);

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        try {
            Contact jane = findByEmail(contacts, "jane.doe@example.com");
            Contact armand = findByPhone(contacts, "3425627278");
        } catch (ContactNotFoundException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("**********************************");
        List<String> emails = getEmails(contacts);
        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println("**********************************");
        Map<String, String> phonesAndNames = getPhonesAndNames(contacts);
        for (Map.Entry<String, String> entry : phonesAndNames.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }

    static List<Contact> buildContactList() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jane", "Doe", "9876543210", "jane.doe@example.com"));
        contacts.add(new Contact("Mary", "Smith", "5551234567", "mary.smith@example.com"));
        contacts.add(new Contact("Bob", "Johnson", "1112223333", "bob.johnson@example.com"));
        contacts.add(new Contact("David", "Williams", "4445556666", "david.williams@example.com"));
        contacts.add(new Contact("Lisa", "Brown", "7778889999", "lisa.brown@example.com"));
        contacts.add(new Contact("Michael", "Taylor", "0009998888", "michael.taylor@example.com"));
        contacts.add(new Contact("James", "Davis", "1234567890", "james.davis@example.com"));
        return contacts;
    }

    static void editContact(List<Contact> contacts, String email, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getEmail().equals(email)) {
                contact.setPhone(newPhone);
            }
        }
    }

    static void deleteContact(List<Contact> contacts, String email) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getEmail().equals(email)) {
                iterator.remove();
            }
        }
    }

    static void sortByFirstname(List<Contact> contacts) {
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getFirstname().compareTo(o1.getFirstname());
            }
        });
    }

    static Contact findByEmail(List<Contact> contacts, String email) {
        for (Contact contact : contacts) {
            if (contact.getEmail().equals(email)) {
                return contact;
            }
        }
        throw new ContactNotFoundException("Contact not found with email: " + email);
    }

    static Contact findByPhone(List<Contact> contacts, String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                return contact;
            }
        }
        throw new ContactNotFoundException("Contact not found with phone number: " + phone);
    }

    static List<String> getEmails(List<Contact> contacts) {
        List<String> emails = new ArrayList<>();

        for (Contact contact : contacts) {
            emails.add(contact.getEmail());
        }

        return emails;
    }

    static Map<String, String> getPhonesAndNames(List<Contact> contacts) {
        Map<String, String> result = new HashMap<>();

        for (Contact contact : contacts) {
            result.put(contact.getPhone(), contact.getFirstname());
        }

        return result;
    }
}
