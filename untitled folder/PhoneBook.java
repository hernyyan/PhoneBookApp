import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhoneBookEntry Object1 = new PhoneBookEntry(5, "John", "Smith", "jsmith@gmail.edu", 20037, 2023334444);
		PhoneBookEntry Object2 = new PhoneBookEntry("James", 202344344);
		PhoneBookEntry Object3 = new PhoneBookEntry("Sarah");
		
		
		Object1.setPhoneNumber(202555555);
		Object1.printBookEntry();
		Object2.setZipCode(Object1.getZipCode());
		
		sc.close();
	}

}