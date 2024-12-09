import java.util.Scanner;

public class PhoneBookDirectory {
	
	// Array to store phone book entries
    private PhoneBookEntry[] entries = new PhoneBookEntry[6];
    
    // Counter to keep track of the number of entries
    private int count = 0;
    
    // Method to add an entry to the phone book
    public String addEntry(PhoneBookEntry entry) {
        
    	// Check if there is space in the array
    	if (count < entries.length) {
            
    		// Add entry to the array and increment the entry count
    		entries[count] = entry;
    		count++;
    		
            return "Successful";
        }
        return "Array is Full";
    }

    // Method to print all phone book entries
    public void printAllEntries() {
    	
        for (int i = 0; i < count; i++) {
        	
        	// Print each entry
            if (entries[i] != null) entries[i].printBookEntry();
            System.out.println();
        }
    }
    
    // Method to search for an entry by phone number using linear search
    public String LinearSearchByPhoneNumber(String phonenumber) {
    	
    	// Check if the entry matches the provided phone number
        for (int i = 0; i < entries.length; i++) {
        	
            if (entries[i] != null && entries[i].getPhonenumber().equals(phonenumber)) {
                return "Phone Number Found";
            }
        }
        return "Phone Number Not Found";
    }
    
    // Method to search for an entry by ID using binary search
    public PhoneBookEntry SearchbyIdBinarySearch(int id) {
        int left = 0, right = count - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (entries[mid].getId() == id) {
                return entries[mid];
            } else if (entries[mid].getId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new PhoneBookEntry();
    }
    
    // Method to sort entries by ID using bubble sort
    public void sortEntriesById() {
    	
        for (int i = 0; i < count - 1; i++) {
        	
            for (int j = i + 1; j < count; j++) {
            	
            	// Swap entries if they are out of order
                if (entries[i].getId() > entries[j].getId()) {
                	
                    PhoneBookEntry temp = entries[i];
                    entries[i] = entries[j];
                    entries[j] = temp;
                }
            }
        }
    }
    
    // Method to edit an entry by first name and last name
    public String Edit(String firstName, String lastName, Scanner input) {
    	
        for (int i = 0; i < count; i++) {
            
        	// Check if the entry matches the provided names
        	if (entries[i] != null && entries[i].getFirstname().equals(firstName) && entries[i].getLastname().equals(lastName)) {
                
        		// Variables for new values
        		int newid;
        		String newfirstname;
        		String newlastname;
        		String newemail;
        		int newzipcode;
        		String newphonenumber;
        		int choice;
        		
        		// Prompt user for what to edit
        		System.out.println();
        		System.out.println("1. ID");
        		System.out.println("2. First Name");
        		System.out.println("3. Last Name");
        		System.out.println("4. Email");
        		System.out.println("5. Zip Code");
        		System.out.println("6. Phone Number");
        		System.out.print("What would you like to edit? ");
        		
        		choice = input.nextInt();
        		
        		input.nextLine();
        		
        		// Edit ID
        		if (choice == 1) {
        			
        			System.out.println();
        			
        			System.out.print("What do you want to change the ID to? ");
        			
        			newid = input.nextInt();
        			
        			entries[i].setId(newid);
        			
        			System.out.println();
        			
        			System.out.println("ID has been changed to " + newid);

        			System.out.println();
        		}
        		
        		// Edit first name
        		else if (choice == 2) {
        			
        			System.out.println();
        			
        			System.out.print("What do you want to change the first name to? ");
        			
        			newfirstname = input.nextLine();
        			
        			entries[i].setFirstname(newfirstname);
        			
        			System.out.println();
        			
        			System.out.println("First Name has been changed to " + newfirstname);

        			System.out.println();
        		}
        		
        		// Edit last name
        		else if (choice == 3) {
        			
        			System.out.println();
        			
        			System.out.print("What do you want to change the last name to? ");
        			
        			newlastname = input.nextLine();
        			
        			entries[i].setLastname(newlastname);
        			
        			System.out.println();
        			
        			System.out.println("Last Name has been changed to " + newlastname);

        			System.out.println();
        		}
        		
        		// Edit email
        		else if (choice == 4) {
        			
        			System.out.println();
        			
        			System.out.print("What do you want to change the email to? ");
        			
        			newemail = input.nextLine();
        			
        			entries[i].setEmail(newemail);
        			
        			System.out.println();
        			
        			System.out.println("Email has been changed to " + newemail);

        			System.out.println();
        		}
        		
        		// Edit zip code
        		else if (choice == 5) {
        			
        			System.out.println();
        			
        			System.out.print("What do you want to change the zip code to? ");
        			
        			newzipcode = input.nextInt();
        			
        			entries[i].setZipcode(newzipcode);
        			
        			System.out.println();
        			
        			System.out.println("Zip Code has been changed to " + newzipcode);

        			System.out.println();
        		}
        		
        		// Edit phone number
        		else if (choice == 6) {
        			
        			System.out.println();
        			
        			System.out.print("What do you want to change the phone number to? ");
        			
        			newphonenumber = input.nextLine();
        			
        			entries[i].setPhonenumber(newphonenumber);
        			
        			System.out.println();
        			
        			System.out.println("Phone Number has been changed to " + newphonenumber);

        			System.out.println();
        		}
        		
                return "Edited Successfully";
            }
        }
        return "Entry Not Found";
    }
    
    // Method to delete an entry by ID
    public String DeleteEntry(int id) {
    	
        for (int i = 0; i < count; i++) {
            
        	// Check if the entry matches the provided ID
        	if (entries[i] != null && entries[i].getId() == id) {
                
        		// Remove the entry
        		entries[i] = null;
                return "Successfully Deleted";
            }
        }
        return "Entry Not Found";
    }
}
