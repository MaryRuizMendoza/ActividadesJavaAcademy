
public interface ContactServiceData {
	public Contact createContact(Contact contact);
	public Contact updateContact(String id, Contact contact);
	public boolean deleteContact(String id);
	public Contact findById(String id);
	public Contact findByEmail(String email);
	public Contact[] findByContactType(ContactType contactType);
	public Contact[] findAll();

}
