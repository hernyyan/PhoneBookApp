import java.util.Scanner;

//Interface defining the actions that a PhoneBook Admin can perform
public interface PhoneBookAdminInterface {
	
	// PhoneBookAdmin Methods
    void addPhoneEntry(PhoneBookEntry entry);
    void editPhoneEntry(String firstName, String lastName, Scanner input);
    void deletePhoneEntry(int id);
    void sortPhoneBookDirectory();
    void searchLinear(String phoneNumber);
    void searchBinary(int id);
    void changePassword(String newPassword);
    void changeUsername(String newUsername);
}
