package com.sample.example.contact;

import java.util.ArrayList;
import java.util.List;

public class ContactServices {

	Contact c1, c2, c3, c4;
	List<Contact> contacts;

	public ContactServices() {

		c1 = new Contact(1, "Deepak", "9623170438", "Pune");
		c2 = new Contact(2, "Swapnil", "8605548965", "Pune");
		c3 = new Contact(3, "Monu", "8608878619", "Pune");
		c4 = new Contact(4, "DHARMARAJ", "8608878619", "Pune");

		contacts = new ArrayList<>();
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
		contacts.add(c4);

	}

	public List<Contact> getContactList() {

		Contact c1 = new Contact(1, "Deepak", "9623170438", "Pune");
		Contact c2 = new Contact(2, "Swapnil", "8605548965", "Pune");
		Contact c3 = new Contact(3, "Monu", "8608878619", "Pune");
		Contact c4 = new Contact(4, "DHARMARAJ", "8608878619", "Pune");

		return contacts;

	}

	public String getMobileNumber(String stringName) {

		String stringMobileNumber = "";

		for (Contact contact : contacts) {

			if (contact.getStringName().equals(stringName)) {

				return stringMobileNumber = contact.getStringMobileNumber();

			}

		}
		return stringMobileNumber;

	}

	
	
	public String addContact(Contact contact) {

		contacts.add(contact);

		return "Add Success";

	}

}
