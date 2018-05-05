package doa;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Contact;

@Repository("contactDao")
public class ContactDoaImpl implements ContactDoa {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Contact> getContacts() {
		List<Contact> contacts = null;

		try {
			System.out.println("here");
			contacts = jdbcTemplate.query("SELECT * FROM contact JOIN address ON contact.contact_id = address.contact_id; ", new BeanPropertyRowMapper<Contact>(Contact.class));
			System.out.println("here after");

			

			 ObjectMapper mapper = new ObjectMapper();
			 try {
				System.out.println(mapper.writeValueAsString(contacts));
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(contact);
			 
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return contacts;
	}

	public Contact getContact() {
		Contact contact = null;
		try {
			System.out.println("here in doa impl");

			contact = jdbcTemplate.queryForObject("SELECT * FROM contact JOIN address ON contact.contact_id = address.contact_id Limit 1", new BeanPropertyRowMapper<Contact>(Contact.class));

			 ObjectMapper mapper = new ObjectMapper();
			 System.out.println(mapper.writeValueAsString(contact));
			//System.out.println(contact);

		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contact;

	}

	@Override
	public Contact getContact(String contactId) {
		Contact contact = null;
		try {
			System.out.println("here in service doa");

			contact = jdbcTemplate.queryForObject("SELECT * FROM contact c JOIN address a ON c.contact_id = a.contact_id WHERE  contact_id = ? ", new Object[] { contactId },
					new BeanPropertyRowMapper<Contact>(Contact.class));

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return contact;
	}

	@Override
	public Contact getContactByEmailOrPhone(String fieldName, String value) {
		Contact contact = null;
		try {
			System.out.println("here in service doa");

			contact = jdbcTemplate.queryForObject("SELECT * FROM contact c JOIN address a ON c.contact_id = a.contact_id WHERE " + fieldName + "= '" + value + "'",
					new BeanPropertyRowMapper<Contact>(Contact.class));

			System.out.println("after doa impl createContact::: " +  contact.getContactId());

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return contact;
	}

	@Override
	public List<Contact> getAllContactsByStateOrCity(String state, String city) {
		List<Contact> contacts = null;
		try {

			contacts = jdbcTemplate.query("SELECT * FROM contact JOIN address ON contact.contact_id = address.contact_id WHERE state = ? OR city = ?", new Object[] { state, city },
					new BeanPropertyRowMapper<Contact>(Contact.class));

			System.out.println("after doa impl getContactByEmailOrPhone");

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return contacts;
	}

	public int deleteEmployee(Long employeeId) {
		int count = jdbcTemplate.update("DELETE from trn_employee WHERE employee_id = ?", new Object[] { employeeId });
		return count;
	}

	public int updateEmployee(Contact employee) {
		// int count = jdbcTemplate.update("UPDATE trn_employee set first_name =
		// ? ,
		// last_name = ? , age = ? where employee_id = ?",
		// new Object[] { employee.getFirstName(), employee.getLastName(),
		// employee.getAge(), employee.getEmployeeId() });
		// return count;
		return 1;
	}

	public int createContact(Contact contact) {
		int count = jdbcTemplate.update("INSERT INTO contact( contact_id,first_name, last_name, middle_name ,company,email,birthdate,work_phone,personal_phone)VALUES(?,?,?,?,?,?,?,?,?)",
				new Object[] { contact.getContactId(), contact.getFirstName(), contact.getLastName(), contact.getMiddleName(), contact.getCompany(), contact.getEmail(), contact.getBirthdate(),
						contact.getWorkPhone(), contact.getPersonalPhone() });
		
		
		jdbcTemplate.update("INSERT INTO address ( street, city ,zip,state,country,contact_id)VALUES(?,?,?,?,?,?)",
				new Object[] { contact.getStreet(), contact.getCity(), contact.getZip(), contact.getState(), contact.getCountry(), contact.getContactId() });

		return count;

	}

}