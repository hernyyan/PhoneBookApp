
import java.util.Scanner;

public class PhoneBook {
	
	public static void main (String [] args) {
		
		PhoneBookEntry [] myInventory = new PhoneBookEntry[3];
		System.out.println("Welcome to Brandon's, Jackson's, and Vincent's Car Management System!");
		System.out.println();
		
		PhoneBookEntry entry1 = new PhoneBookEntry(5,"John","Smith","jsmith@gmail.edu",20037,2023334444);
		
		PhoneBookEntry entry2 = new PhoneBookEntry("James",202344344);
		
		PhoneBookEntry entry3 = new PhoneBookEntry("Sarah");
		
		entry1.setPhonenumber(202555555);
		entry1.printBookEntry();
		
		entry2.setZipcode(entry1.getZipcode());
	}
}
