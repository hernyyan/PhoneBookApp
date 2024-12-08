
public class PhoneBookEntry {

	private int Id = -1;
	private String FirstName;
	private String LastName;
	private String Email;
	private int ZipCode;
	private int PhoneNumber;
	
	public PhoneBookEntry() {
		Id = -1;
		FirstName = "";
		LastName = "";
		Email = "";
		ZipCode = 0;
		PhoneNumber = 0;
	}
	
	public PhoneBookEntry(int Id, String FirstName, String LastName, String Email, int ZipCode, int PhoneNumber) {
		this.Id = Id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.ZipCode = ZipCode;
		this.PhoneNumber = PhoneNumber;
	}
	
	public PhoneBookEntry(String FirstName, int PhoneNumber) {
		this.FirstName = FirstName;
		this.PhoneNumber = PhoneNumber;
	}
	
	public PhoneBookEntry(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public void printBookEntry() {
		System.out.println("----------------------------------------");
		System.out.println("ID: " + Id);
		System.out.println("First name: " + FirstName);
		System.out.println("Last name: " + LastName);
		System.out.println("Email: " + Email);
		System.out.println("Zip Code: " + ZipCode);
		System.out.println("Phone Number: " + PhoneNumber);
		System.out.println("----------------------------------------");
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getZipCode() {
		return ZipCode;
	}

	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
}