
public class Contact {

	private String id;
	private String firstName;
	private String lastName;
	private String motherName;
	private String email;
	private String phoneNumber;
	private ContactType contactType ;
	
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
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ContactType getContactType() {
		return contactType;
	}
	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	
	}
	public String getId() {
		return this.id;
	}

	public Contact(){
		this.contactType = ContactType.UNKNOWN;
		}
	
		
	public Contact(String id, String firstName, String lastName, String motherName, String email,
			String phoneNumber,
			ContactType contactType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.contactType = contactType;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contact id = "+this.getId() +"\n" );
		sb.append("Contact first Name = " + this.getFirstName() + "\n");
		sb.append("Contact last name = " + this.getLastName() +  "\n");
		sb.append("Contact email = " + this.getEmail() + "\n");
		
		return sb.toString();
	}

}
