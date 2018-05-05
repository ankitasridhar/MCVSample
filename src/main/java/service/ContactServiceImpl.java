package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import doa.ContactDoa;
import model.Contact;

@Service("employeeService")

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDoa contactDoa;

	public List<Contact> getContacts() {
		List<Contact> contacts = contactDoa.getContacts();
		return contacts;
	}

	public Contact getContact() {
		System.out.println("here in service impl");
		Contact contact = contactDoa.getContact();
		System.out.println("here in service impl after");

		return contact;
	}

	@Override
	public Contact getContact(String contactId) {
		System.out.println("here in service impl");
		Contact contact = contactDoa.getContact(contactId);
		return contact;
	} 
	
	@Override
	public Contact getContactByEmailOrPhone(String fieldName, String value) {
		System.out.println("here in service impl");
		Contact contact = contactDoa.getContactByEmailOrPhone(fieldName, value);
		return contact;
	}

	@Override
	public List<Contact> getAllContactsByStateOrCity(String state, String city) {
		List<Contact> contact = contactDoa.getAllContactsByStateOrCity(state, city);
		return contact;
	}

	public int deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateEmployee(Contact employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int createContact(Contact contact) {

		int count = contactDoa.createContact(contact);

		return count;
	}

}
