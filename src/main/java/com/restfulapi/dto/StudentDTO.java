package com.restfulapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class StudentDTO {

	@NotNull(message="Name is Required")
    private String name;
    
    @Email(message="Please provide a valid email address")
    private String email;
    
    @NotNull(message="Mobile number is Required")
//    @JsonProperty("mobnum") // Maps JSON "mobnum" to this field
    private String mobNum;
    
    @NotNull(message="Blood group is Required")
    private String bloodGroup;
    
    @NotNull(message="Address is Required")
    private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
