package com.cg.address;



public  class Address {
	
	private String houseNo;
	private String street;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private int pinCode;
	private String country;
	
	//Parameterized constructor.
	
	//Getters and setters
	public String getHouseNo() {
		return houseNo;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String houseNo, String street, String line1, String line2, String city, String state, int pinCode,
			String country) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", line1=" + line1 + ", line2=" + line2
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", country=" + country + "]";
	}
	
}
