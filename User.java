
// Abstract class representing a user in the system
public abstract class User {
	
	// Protected fields for storing the username and password
    protected String username;
    protected String password;
    
    // Constructor to initialize the username and password
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Getter method for the username
    public String getUsername() { 
    	return username; 
    }
    
    // Setter method for the username
    public void setUsername(String username) { 
    	this.username = username; 
    }
    
    // Getter method for the password
    public String getPassword() { 
    	return password; 
    }
    
    // Setter method for the password
    public void setPassword(String password) { 
    	this.password = password; 
    }
    
    // Method to print user information
    public void printUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}