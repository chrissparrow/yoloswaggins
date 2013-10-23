
public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;

    public Address (String street, String city, String postalCode) throws Exception{
    	if (!isValidPostalCode(postalCode)) {
    		throw new Exception("Invalid Postal Code");
    	}
    	this.unit = 0;
    	this.street = street;
    	this.city = city;
    	this.postalCode = postalCode;
    }
    
    public Address (int unit, String street, String city, String postalCode) throws Exception {
    	if (unit < 1) {
    		throw new Exception("Cannot have a unit number below 1");
    	}
    	if (!isValidPostalCode(postalCode)) {
    		throw new Exception("Invalid Postal Code");
    	}
    	this.unit = unit;
    	this.street = street;
    	this.city = city;
    	this.postalCode = postalCode;
    }

     public String toString() { 
    	 if (unit == 0) {
    		 return street + ", " + city + " " + postalCode;
    	 }
    	 return unit + " " + street + ", " + city + " " + postalCode;
     }
     public boolean equals(Object o) { return false; }
     
     private boolean isValidPostalCode( String postalCode ) { 
    	 return this.postalCode.length() == 6;
     }
 
} 
