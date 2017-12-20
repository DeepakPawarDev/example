package com.sample.example;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sample.example.contact.Contact;
import com.sample.example.contact.ContactServices;

@Path("/contacts")
public class Contacts {

	ContactServices contactService = new ContactServices();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Contact> getContacts() {

		return contactService.getContactList();

	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String getMobileNumber(String stringName) {

		return contactService.getMobileNumber(stringName);

	}

	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public String addContact(Contact contact) {

		return contactService.addContact(contact);
	}

}
