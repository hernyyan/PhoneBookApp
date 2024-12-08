import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookApplication {
    public static void main(String[] args) {
        try {
            
        	// Reading admin credentials from the "admin.txt" file
            BufferedReader adminReader = new BufferedReader(new FileReader("admin.txt"));
            
            // Splitting admin data by commas
            String[] adminData = adminReader.readLine().split(",");
           
            // Creating an instance of PhoneBookAdmin with the read credentials
            PhoneBookAdmin admin = new PhoneBookAdmin(
                adminData[0], adminData[1], adminData[2], new PhoneBookDirectory()
            );

            // Reading normal user credentials from the "user.txt" file
            BufferedReader userReader = new BufferedReader(new FileReader("user.txt"));
            
            // Splitting user data by commas
            String[] userData = userReader.readLine().split(",");
            
            // Creating an instance of NormalUser with the read credentials
            NormalUser user = new NormalUser(
                Integer.parseInt(userData[0]), userData[1], userData[2], new PhoneBookDirectory()
            );
            
            // Initializing a scanner for user input
            Scanner scanner = new Scanner(System.in);
            
            // Variable to make sure login information is correct
            boolean authenticated = false;
            
            // While loop until a user's login credentials are validated
            while (!authenticated) {
            	
            	// Prompt login information
                System.out.println("Enter username: ");
                String username = scanner.nextLine();
                System.out.println("Enter password: ");
                String password = scanner.nextLine();
                
                // Check if the credentials match the admin's credentials
                if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
                    
                	System.out.println("Welcome Admin!");
                    
                    // Call admin's menu
                    admin.adminMenu();
                    
                    // Validate login information
                    authenticated = true;
                
                // Check if the credentials match the normal user's credentials
                } else if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                    
                	System.out.println("Welcome User!");
                    
                	// Call user's menu
                	user.normalUserMenu();
                	
                	// Validate login information
                    authenticated = true;
                
                // Handle invalid credentials
                } else {
                	
                    System.out.println("Invalid credentials. Please try again.");
                }
            }
        
        // Catch and handle exceptions while reading files
        } catch (IOException e) {
 
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
