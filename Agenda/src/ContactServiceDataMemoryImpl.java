
public class ContactServiceDataMemoryImpl implements ContactServiceData{
	
	Contact[] contacts;
	int currentIndex;
	Util util;
	
	public ContactServiceDataMemoryImpl() {
		contacts = new Contact[100];
		currentIndex = 0;
		util = new Util();
	}
	
	@Override
	public Contact createContact(Contact contact) {
		Contact newContact = new Contact(
		util.generateID(),
		contact.getFirstName(),
		contact.getLastName(),
		contact.getMotherName(),
		contact.getPhoneNumber(),
		contact.getEmail(),
		contact.getContactType());
		
		contacts[currentIndex] = newContact;
	currentIndex++;
		// TODO Auto-generated method stub
		return newContact;
	}

	@Override
	public Contact updateContact(String id, Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] findByContactType(ContactType contactType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Contact[] findAll() {
		Contact[] storedContacts = new Contact[currentIndex];
		
		for(int i = 0; i < contacts.length;  i++) {
			Contact c = contacts[i];
			if(c != null) {
				storedContacts[i] = c;
				
			}else {
				break;
			}
		}
		
		return storedContacts;
	}
	

	
}
