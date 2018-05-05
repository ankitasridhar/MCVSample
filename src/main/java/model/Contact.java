package model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {

	private String contactId;
	//private UUID contactUUID;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String middleName;
	private String company;
	private String profileImage;
	private String email;
	private String birthdate;
	private String street;
	private String zip;
	private String country;
	private String personalPhone;
	private String workPhone;

	@JsonCreator

	public Contact(@JsonProperty("contact_id") String contact_id, @JsonProperty("first_name") String first_name, @JsonProperty("last_name") String last_name,
			@JsonProperty("middle_name") String middle_name, @JsonProperty("company") String company, @JsonProperty("email") String email, @JsonProperty("birthdate") String birthdate,
			@JsonProperty("work_phone") String work_phone, @JsonProperty("personal_phone") String personal_phone, @JsonProperty("street") String street, @JsonProperty("city") String city,
			@JsonProperty("zip") String zip, @JsonProperty("state") String state, @JsonProperty("country") String country, @JsonProperty("profile_image") String profile_image) {

		this.contactId = contact_id;
		this.firstName = first_name;
		this.lastName = last_name;
		this.company = company;
		this.email = email;
		this.birthdate = birthdate;
		this.workPhone = work_phone;
		this.personalPhone = personal_phone;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.profileImage = profile_image;
		this.middleName = middle_name;
	}

	public Contact() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate.toString();
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getPersonalPhone() {
		return personalPhone;
	}

	public void setPersonalPhone(String personalPhone) {
		this.personalPhone = personalPhone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId() {
		this.contactId = UUID.randomUUID().toString();

	}

	// @Override
	// public String toString() {
	// StringBuilder str = new StringBuilder();
	// str.append("Employee Id:- " + getEmployeeId());
	// str.append(" First Name:- " + getFirstName());
	// str.append(" Last Name:- " + getLastName());
	// str.append(" Age:- " + getAge());
	// return str.toString();
	// }

}
