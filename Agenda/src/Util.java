import java.util.UUID;

public class Util {
	public String generateID() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	
	public static void main(String[] args) {
		Util util = new Util();
		for(int i = 0; i> 4; i++) {
			System.out.println(util.generateID());
		}
	}

	
}
