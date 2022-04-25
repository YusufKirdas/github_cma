package crudCma;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String familyName;
	private String postalCode;
	private String city;
	
	Customer(int customerId, String firstName, String familyName, String postalCode, String city) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.familyName = familyName;
		this.postalCode = postalCode;
		this.city = city;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getCity() {
		return city;
	}

	public String toString() {
		return customerId + " " + firstName + " " + familyName + " " + postalCode + " " + city;
	}
	
	
}
