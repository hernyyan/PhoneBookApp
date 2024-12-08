import java.util.Scanner;

//Interface defining the methods that a Normal User should implement to interact with the PhoneBook
public interface NormalUserInterface {
	
	// NormalUser Methods
    void addPhoneEntry(PhoneBookEntry entry);
    void editPhoneEntry(String firstName, String lastName, Scanner input);
    void sortPhoneBookDirectory();
    void searchLinear(int phoneNumber);
}
