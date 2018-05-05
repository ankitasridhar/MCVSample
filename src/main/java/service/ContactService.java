package service;

import java.util.List;

import model.Contact;

public interface ContactService {

	public List<Contact> getContacts();

	public Contact getContact();
	
	public Contact getContact(String contactId);

	public Contact getContactByEmailOrPhone(String fieldName, String value);

	public List<Contact> getAllContactsByStateOrCity(String state, String city);

	public int deleteEmployee(Long employeeId);

	public int updateEmployee(Contact employee);

	public int createContact(Contact contact);

}
