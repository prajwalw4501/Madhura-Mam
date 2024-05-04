package com.app.phonebook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.PBExceptionhandle.PBxeceptionhandle;
import com.app.pbvalidate.PhonebookValidation;
import com.app.pbvalidate.PhonebookValidation.*;
import com.contact.Contact;
import com.pbexception.PBException;

public class PhoneBook {
	private List<Contact> contacts;

	public PhoneBook() {
		contacts = new ArrayList<>();
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public void removeContact(Contact contact) {
		contacts.remove(contact);
	}

	public List<Contact> getAllContacts() {
		return contacts;
	}

	public void sortContactsByName() {
		Collections.sort(contacts, Comparator.comparing(Contact::getName));
	}

	public static void main(String[] args) throws PBException {

		PhoneBook phoneBook = new PhoneBook();
		PhonebookValidation validator = new PhonebookValidation();
		Scanner scanner = new Scanner(System.in);
//		int phoneNumber;
		int choice;
		do {
			System.out.println("PhoneBook Menu:");
			System.out.println("1. Add contact");
			System.out.println("2. Show all contacts");
			System.out.println("3. Remove contact");
			System.out.println("4. Update Contact Number");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			// scanner.nextLine(); // Consume newline character
			switch (choice) {
			case 1:
				System.out.println("Enter phone number (10 digits): ");
				long phoneNumber = scanner.nextLong();
				validator.checkContact(phoneNumber);
				System.out.println("Enter Name: ");
				String name = scanner.next();
//				String name = scanner.nextLine();
				System.out.println("Enter date of birth (yyyy-mm-dd): ");
				String dobString = scanner.next();
				LocalDate dob = LocalDate.parse(dobString);
				System.out.print("Enter email: ");
				String email = scanner.next();

				phoneBook.addContact(new Contact(phoneNumber, name, dob, email));
				System.out.println("Contact added successfully.");

//catch (PBxeceptionhandle e) {
//					System.out.println("Error adding contact: " + e.getMessage());
//				}
				break;
			case 2:
				// Display all contacts
				validator.displayAll(phoneBook);
				break;
			case 3:
				// Remove a contact
				System.out.print("Enter name of contact to remove: ");
				String nameToRemove = scanner.next();
				validator.removeContact(phoneBook, nameToRemove);
				break;
			case 4:
				System.out.println("Enter old Contact No.");
				int no = scanner.nextInt();
				System.out.println("Enter New Contact No.");
				int newno = scanner.nextInt();
				validator.updateContact(phoneBook, no, newno);
				break;
			case 5:
				// Exit the program
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		} while (choice != 5);

		scanner.close();
	}
}
