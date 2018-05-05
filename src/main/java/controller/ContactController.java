package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Contact;
import service.ContactService;

@Controller
@RequestMapping("/jobTargets")
public class ContactController {

	@Autowired
	public ContactService contactService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	String getContacts(Map<String, Object> model) {
		List<Contact> contacts = contactService.getContacts();
		if (contacts == null) {
			return "No Object found";
		}
		model.put("contactForm", contacts);
		return "list";

	}

	@RequestMapping(method = RequestMethod.GET)
	public String getContact(Map<String, Object> model) {
		System.out.println("here in controller");
		Contact contact = contactService.getContact();
		if (contact == null) {
			return "No Object found";
		}
		System.out.println("here in contact" + contact.getContactId());
		model.put("contactForm", contact);
		return "View";
	}

	@RequestMapping(value = "emailOrPhone/{fieldName}/{value}", method = RequestMethod.GET)
	String getContactByEmailOrPhone(@PathVariable("fieldName") String fieldName, @PathVariable("value") String value, Map<String, Object> model) {
		Contact contact = contactService.getContactByEmailOrPhone(fieldName, value);
		if (contact == null) {
			return "No Object found";
		}
		System.out.println("here in contact" + contact.getContactId());
		model.put("contactForm", contact);
		return "View";
	}

	@RequestMapping(value = "allStateOrCity/{state}/{city}", method = RequestMethod.GET)
	String getAllContactsByStateOrCity(@PathVariable("state") String state, @PathVariable("city") String city, Map<String, Object> model) {
		System.out.println("here in controller");

		List<Contact> contacts = contactService.getAllContactsByStateOrCity(state, city);
		if (contacts == null) {
			return "No Object found";
		}
		model.put("contactForm", contacts);
		return "list";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		Contact contactForm = new Contact();
		model.put("contactForm", contactForm);
		return "Registration";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String createContact(@ModelAttribute("contactForm") Contact contact, Map<String, Object> model) {
		contact.setContactId();
		System.out.println("contact::" + contact.getContactId());
		contactService.createContact(contact);
		return "View";
	}

	// @RequestMapping(value = "/employee/delete/{id}", method =
	// RequestMethod.DELETE)
	// public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long
	// employeeId) {
	// HttpHeaders headers = new HttpHeaders();
	// Employee employee = employeeService.getEmployee(employeeId);
	// if (employee == null) {
	// return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	// }
	// employeeService.deleteEmployee(employeeId);
	// headers.add("Employee Deleted - ", String.valueOf(employeeId));
	// return new ResponseEntity<Employee>(employee, headers,
	// HttpStatus.NO_CONTENT);
	// }
	//

	@RequestMapping(value = "/contact/{id}/update", method = RequestMethod.PUT)
	public String updateEmployee(@PathVariable("id") String contactId, Model model) {
		Contact contact = contactService.getContact(contactId);
		model.addAttribute("contactForm", contact);
		return "users/userform";
	}

}
