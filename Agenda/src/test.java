
public class test {
	private Contact contact;
	private Contact friend;
	
	public static void main(String[] args) {
		test p = new test();
		p.crearContactos();
		
		ContactServiceData csd = new ContactServiceDataMemoryImpl();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);
		
		Contact[] contacts = csd.findAll();
		
		for(Contact c : contacts) {
			System.out.println(c);
		}
		
		//System.out.println(contact);
		//System.out.println(friend);
	}
	
	public void crearContactos() {
		contact = new Contact();
		contact.setFirstName("Yaneth");
		contact.setLastName("Ruiz");
		contact.setMotherName("Mendoza");
		contact.setEmail("test.test@test.com");
		contact.setPhoneNumber("1234567890");
		
		//contacto con parámetros 
		friend = new Contact("1","Mary","Ruiz", "Mendoza", "test@test.com","1234567890",ContactType.FRIEND);
		
	}
}

