
public class PhoneBook {
	
	public static void main (String [] args) {
		
		// Create an array to hold multiple PhoneBookEntry objects
		PhoneBookEntry [] entries = new PhoneBookEntry[3];
		
		// Display a welcome message
		System.out.println("Welcome to Brandon's, Jackson's, Vincent's, and Henry's PhoneBook Application!");
		System.out.println();
		
		// Create a PhoneBookEntry object for John
		PhoneBookEntry entry1 = new PhoneBookEntry(5,"John","Smith","jsmith@gmail.edu",20037,"2023334444");
		
		// Create a PhoneBookEntry object for James
		PhoneBookEntry entry2 = new PhoneBookEntry("James","202344344");
		
		// Create a PhoneBookEntry object for Sarah
		PhoneBookEntry entry3 = new PhoneBookEntry("Sarah");
		
		// Change John's phone number
		entry1.setPhonenumber("202555555");
		entry1.printBookEntry();
		
		// Change James's zipcode to John's
		entry2.setZipcode(entry1.getZipcode());
	}
}
