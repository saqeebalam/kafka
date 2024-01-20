package com.salam.springboot.payload;

/**
 * 
 * @author Saqeeb Alam
 * 
 * DTO for json
 *
 */
public class User {
	
	private int identificationNo;
	
	private String firstName;
	
	private String lastName;

	

	
	public int getIdentificationNo() {
		return identificationNo;
	}




	public void setIdentificationNo(int identificationNo) {
		this.identificationNo = identificationNo;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	@Override
    public String toString() {
        return "User{" +
                "id=" + identificationNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
	
	
	

}
