import java.util.Scanner;

//NormalUser class extending User and implementing NormalUserInterface
public class NormalUser extends User implements NormalUserInterface {
    
	// Fields for NormalUser: unique ID and reference to a PhoneBookDirectory
	private int id;
    private PhoneBookDirectory phoneBookDirectory;
    
    // Constructor for NormalUser to initialize id, username, password, and phone book directory
    public NormalUser(int id, String username, String password, PhoneBookDirectory phoneBookDirectory) {
        
    	// Calling the superclass (User) constructor
    	super(username, password);
        this.id = id;
        this.phoneBookDirectory = phoneBookDirectory;
    }
    
    // Getter method for id
    public int getId() { 
    	return id; 
    }
    
    // Setter method for id
    public void setId(int id) { 
    	this.id = id; 
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
    
    // Overridden method to sort the phone book directory by ID
    @Override
    public void sortPhoneBookDirectory() {
    	phoneBookDirectory.sortEntriesById();
    	System.out.println("PhoneBookDirectory sorted by ID.");
    }
    
    // Overridden method to search for a phone number using linear search
    @Override
    public void searchLinear(String phoneNumber) {
    	String searchResult = phoneBookDirectory.LinearSearchByPhoneNumber(phoneNumber);
        if (searchResult.equals("Phone Number Found")) {
            
        	System.out.println("Phone number found.");
        
        } else {
            
        	System.out.println("Phone number not found.");
        }
    }
    
    // Overridden method to print the user info
    @Override
    public void printUserInfo() {
        System.out.println();
        
        // Print the information from the superclass (User)
    	super.printUserInfo();
    	
    	// Print the user's unique ID
        System.out.println("ID: " + id);
        System.out.println();
        
        // Print the user's phone book entries
        System.out.println("Phone Book Entries:");
        System.out.println();
        
        // Print entries through method in PhoneBookDirectory
        phoneBookDirectory.printAllEntries();
    }
    
    // Method to display the normal user menu and process their actions
    public void normalUserMenu() {
    	
    	// Scanner to capture user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        	
        	// Displaying the menu with options for the normal user
            System.out.println("\nNormal User Menu:");
            System.out.println("1. Add a phone entry");
            System.out.println("2. Edit a phone entry");
            System.out.println("3. Sort the PhoneBookDirectory");
            System.out.println("4. Search using Linear Search");
            System.out.println("5. Print User's Info");
            System.out.println("6. Exit");
            
            // Getting the user's choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            // Handling the user's choice using a switch statement
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
                	
                	// Sort the phone book directory
                	sortPhoneBookDirectory();
                    
                	break;

                case 4:
                	
                	// Search for a phone number
                    System.out.print("Enter Phone Number to Search: ");
                    phoneNumber = scanner.nextLine();
                    
                    searchLinear(phoneNumber);
                    
                    break;

                case 5:
                	
                	// Print the user's information
                	printUserInfo();
                    
                	break;

                case 6:
                	
                	// Exit the menu
                    System.out.println("Exiting Normal User Menu...");
                    
                    break;

                default:
                	
                	// Invalid choice handling
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        
        // Close the scanner
        scanner.close();
    }

}
