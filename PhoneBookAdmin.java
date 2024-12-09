import java.util.Scanner;

// PhoneBookAdmin class extending User and implementing PhoneBookAdminInterface
public class PhoneBookAdmin extends User implements PhoneBookAdminInterface {
    
	// Fields for PhoneBookAdmin: email address and reference to a PhoneBookDirectory
	private String emailAddress;
    private PhoneBookDirectory phoneBookDirectory;
    
    // Constructor for PhoneBookAdmin to initialize username, password, email, and phone book directory
    public PhoneBookAdmin(String username, String password, String emailAddress, PhoneBookDirectory phoneBookDirectory) {
        
    	// Calling the superclass (User) constructor
    	super(username, password);
        this.emailAddress = emailAddress;
        this.phoneBookDirectory = phoneBookDirectory;
    }
    
    // Getter method for email
    public String getEmailAddress() { 
    	return emailAddress; 
    }
    
    // Setter method for email
    public void setEmailAddress(String emailAddress) { 
    	this.emailAddress = emailAddress; 
    }
    
    // Overridden method to print the admin's info
    @Override
    public void printUserInfo() {
    	System.out.println();
    	
    	// Print the information from the superclass (User)
    	super.printUserInfo();
    	
    	// Print the admin's email address
    	System.out.println("Email Address: " + emailAddress);
    	System.out.println();
    	
    	// Print the admin's phone book entries
        System.out.println("Phone Book Entries:");
        System.out.println();
        
        // Print entries through method in PhoneBookDirectory
        phoneBookDirectory.printAllEntries();
    }
    
    // Overridden method to add a phone entry to the phone book directory
    @Override
    public void addPhoneEntry(PhoneBookEntry entry) {
    	// Adding the entry to the directory
        if (phoneBookDirectory.addEntry(entry).equals("Successful")) {
            
        	System.out.println("Entry added successfully.");
        
        } else {
            
        	System.out.println("Failed to add entry. Directory might be full.");
        }
    }
    
    // Overridden method to edit an existing phone entry
    @Override
    public void editPhoneEntry(String firstName, String lastName, Scanner input) {
    	if (phoneBookDirectory.Edit(firstName, lastName, input).equals("Edited Successfully")) {
            
        	System.out.println("Entry edited successfully.");
        
        } else {
            
        	System.out.println("Entry not found.");
        }
    }
    
    // Overridden method to delete a phone entry
    @Override
    public void deletePhoneEntry(int id) {
        if (phoneBookDirectory.DeleteEntry(id).equals("Successfully Deleted")) {
        	
        	System.out.println("Entry Successfully Deleted");
        }
        
        else {
        	
        	System.out.println("Entry Not Found");
        }
    }

    // Overridden method to sort the phone book directory by ID
    @Override
    public void sortPhoneBookDirectory() {
        phoneBookDirectory.sortEntriesById();
        System.out.println("PhoneBookDirectory sorted by ID.");
    }

    // Overridden method to search for a phone number using linear search
    @Override
    public void searchLinear(String phoneNumber) {
    	String linearSearchResult = phoneBookDirectory.LinearSearchByPhoneNumber(phoneNumber);
        if (linearSearchResult.equals("Phone Number Found")) {
            System.out.println("Phone number found.");
        } else {
            System.out.println("Phone number not found.");
        }
    }
    
    // Overridden method to search for an entry using binary search by ID
    @Override
    public void searchBinary(int id) {
    	PhoneBookEntry searchResult = phoneBookDirectory.SearchbyIdBinarySearch(id);
        if (searchResult.getId() != -1) {
        	System.out.println();
        	System.out.println("Entry found:");
        	System.out.println();
            searchResult.printBookEntry();
        } else {
        	System.out.println(id);
            System.out.println("Entry not found.");
        }
    }
    
    // Overridden method to change the password of the admin
    @Override
    public void changePassword(String newPassword) {
        setPassword(newPassword);
    }
    
    // Overridden method to change the username of the admin
    @Override
    public void changeUsername(String newUsername) {
        setUsername(newUsername);
    }
    
    // Method to display the admin menu
    public void adminMenu() {
        
    	// Scanner for capturing user input
    	Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        	
        	// Displaying the admin menu options
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add a phone entry");
            System.out.println("2. Edit a phone entry");
            System.out.println("3. Delete a phone entry");
            System.out.println("4. Sort the PhoneBookDirectory");
            System.out.println("5. Search using Linear Search");
            System.out.println("6. Search using Binary Search");
            System.out.println("7. Print Admin's Info");
            System.out.println("8. Change Username");
            System.out.println("9. Change Password");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            // Switch case to handle the admin's menu choices
            switch (choice) {
                case 1:
                	
                	// Add a phone entry
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                	System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Zip Code: ");
                    int zipCode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    PhoneBookEntry entry = new PhoneBookEntry(id, firstName, lastName, email, zipCode, phoneNumber);
                    
                    addPhoneEntry(entry);
                    
                    break;

                case 2:
                	
                	// Edit a phone entry
                    System.out.print("Enter First Name of Entry to Edit: ");
                    firstName = scanner.nextLine();
                    System.out.print("Enter Last Name of Entry to Edit: ");
                    lastName = scanner.nextLine();
                    
                    editPhoneEntry(firstName, lastName, scanner);
                    
                    break;

                case 3:
                	
                	// Delete a phone entry by ID
                    System.out.print("Enter ID of Entry to Delete: ");
                    id = scanner.nextInt();
                    
                    deletePhoneEntry(id);
                    
                    break;

                case 4:
                	
                	// Sort the phone book directory by ID
                	sortPhoneBookDirectory();
                	
                    break;

                case 5:
                	
                	// Search using linear search
                    System.out.print("Enter Phone Number to Search: ");
                    phoneNumber = scanner.nextLine();
                    
                    searchLinear(phoneNumber);
                    
                    break;

                case 6:
                	
                	// Search using binary search by ID
                    System.out.print("Enter ID to Search: ");
                    id = scanner.nextInt();
                    
                    searchBinary(id);
                    
                    break;

                case 7:
                	
                	// Print admin's information
                    printUserInfo();
                    
                    break;

                case 8:
                	
                	// Change the admin's username
                    System.out.print("Enter new Username: ");
                    username = scanner.nextLine();
                    System.out.println("Username updated successfully.");
                    break;

                case 9:
                	
                	// Change the admin's password
                    System.out.print("Enter new Password: ");
                    password = scanner.nextLine();
                    System.out.println("Password updated successfully.");
                    break;

                case 10:
                	
                	// Exit the admin menu
                    System.out.println("Exiting Admin Menu...");
                    break;

                default:
                	
                	// Invalid choice handling
                    System.out.println("Invalid choice. Please try again.");
            }
        
        // While loop continues until choice 10 (Exit)
        } while (choice != 10);
        
        // Close the scanner
        scanner.close();
    }

}
