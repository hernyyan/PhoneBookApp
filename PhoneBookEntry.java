
public class PhoneBookEntry {
	
	// Fields to store the phone book entry details
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private int zipcode;
	private String phonenumber;
	
	// Default constructor initializing fields with default values
	public PhoneBookEntry() {
		
		id = -1;
		firstname = "";
		lastname = "";
		email = "";
		zipcode = -1;
		phonenumber = "";
	}
	
	// Constructor initializing all fields except ID
	public PhoneBookEntry(String firstname0, String lastname0, String email0, int zipcode0, String phonenumber0) {
		
		// Default ID
		id = -1; 
		firstname = firstname0;
		lastname = lastname0;
		email = email0;
		zipcode = zipcode0;
		phonenumber = phonenumber0;
		}
	
	// Constructor initializing all fields including ID
	public PhoneBookEntry(int id1, String firstname1, String lastname1, String email1, int zipcode1, String phonenumber1) {
		
		id = id1;
		firstname = firstname1;
		lastname = lastname1;
		email = email1;
		zipcode = zipcode1;
		phonenumber = phonenumber1;
		
	}
	
	// Constructor initializing first name and phone number only
	public PhoneBookEntry(String firstname2, String phonenumber2) {
		
		firstname = firstname2;
		phonenumber = phonenumber2;
	}
	
	// Constructor initializing only the first name
	public PhoneBookEntry(String firstname3) {
		
		firstname = firstname3;
	}
	
	// Getter and Setters Below
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	// Method to print all details of the phone book entry
	public void printBookEntry() {
			
		System.out.println("ID: " + id);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Email: " + email);
		System.out.println("Zip Code: " + zipcode);
		System.out.println("Phone Number: " + phonenumber);
	}
	
}
