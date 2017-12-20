package com.sample.example.contact;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {
	
	
	private int intId;
	private String stringName;
	private String stringMobileNumber;
	private String stringAddress;

	
	public Contact() {}
	
	public Contact(int intId, String stringName, String stringMobileNumber, String stringAddress) {
		
		this.intId = intId;
		this.stringName = stringName;
		this.stringMobileNumber = stringMobileNumber;
		this.stringAddress = stringAddress;
	}
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public String getStringName() {
		return stringName;
	}
	public void setStringName(String stringName) {
		this.stringName = stringName;
	}
	public String getStringMobileNumber() {
		return stringMobileNumber;
	}
	public void setStringMobileNumber(String stringMobileNumber) {
		this.stringMobileNumber = stringMobileNumber;
	}
	public String getStringAddress() {
		return stringAddress;
	}
	public void setStringAddress(String stringAddress) {
		this.stringAddress = stringAddress;
	}


}
