package com.roshnee.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int ssn;
	private String firstName;
	private String lastName;
	private String gender;
	private String phoneNumber;
	private String dateOfBirth;
	private String momName;
	private String dadName;

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getMomName() {
		return momName;
	}



	public void setMomName(String momName) {
		this.momName = momName;
	}



	public String getDadName() {
		return dadName;
	}



	public void setDadName(String dadName) {
		this.dadName = dadName;
	}



	@Override
	public String toString(){
		return "id="+id+", first name="+firstName+", last name="+lastName+ ", gender="+gender+", " +
				"phone number="+phoneNumber+", date of birth="+dateOfBirth+", mom's name="+momName+", dad's name="+
				dadName+", ssn="+ssn;
	}
}
