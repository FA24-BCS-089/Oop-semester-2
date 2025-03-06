package LibraryManagementSystem;

public class Address {

    	private String city;
    	private String street;

    	public Address(String city, String street) {
        	this.city = city;
        	this.street = street;
    	}

   	public Address(Address other) {
        	this.city = other.city;
        	this.street = other.street;
    	}

    	public void show() {
        	System.out.println(street + ", " + city);
    	}

    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	Address address = (Address) obj;
        	return street.equals(address.street) && city.equals(address.city);
    	}

    	public String getStreet() {
        	return street;
    	}

    	public void setStreet(String street) {
        	this.street = street;
    	}

    	public String getCity() {
        	return city;
    	}

    	public void setCity(String city) {
        	this.city = city;
    	}
}

