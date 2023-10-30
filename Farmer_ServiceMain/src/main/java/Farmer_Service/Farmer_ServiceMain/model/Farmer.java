package Farmer_Service.Farmer_ServiceMain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString

@Document(collection = "Farmer")
public class Farmer {

	@Id
	private String id;
	private String farmer_name;
	private String farmerEmail;
	private String farmer_contactNo;
	private location farmer_address;
	private bankDetails bank_details;
	private String password;

	public Farmer(String id, String farmer_name, String farmer_email, String farmer_contactNo, location farmer_address,
			bankDetails bank_details, String password) {
		super();
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmerEmail = farmer_email;
		this.farmer_contactNo = farmer_contactNo;
		this.farmer_address = farmer_address;
		this.bank_details = bank_details;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Farmer(String id, String farmer_name, String farmer_email, String farmer_contactNo, location farmer_address,
			bankDetails bank_details) {
		super();
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmerEmail = farmer_email;
		this.farmer_contactNo = farmer_contactNo;
		this.farmer_address = farmer_address;
		this.bank_details = bank_details;
	}

	public bankDetails getBank_details() {
		return bank_details;
	}

	public void setBank_details(bankDetails bank_details) {
		this.bank_details = bank_details;
	}

	public Farmer(String id, String farmer_name, String farmeremail, String farmer_contactNo, location farmer_address) {
		super();
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmerEmail = farmeremail;
		this.farmer_contactNo = farmer_contactNo;
		this.farmer_address = farmer_address;
	}

	public location getFarmer_address() {
		return farmer_address;
	}

	public void setFarmer_address(location farmer_address) {
		this.farmer_address = farmer_address;
	}

	public String getFarmer_contactNo() {
		return farmer_contactNo;
	}

	public void setFarmer_contactNo(String farmer_contactNo) {
		this.farmer_contactNo = farmer_contactNo;
	}

	public Farmer(String id, String farmer_name, String farmer_email) {
		super();
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmerEmail = farmer_email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Farmer() {
		super();
	}

	public String getFarmer_name() {
		return farmer_name;
	}

	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}

	public String getFarmeremail() {
		return farmerEmail;
	}

	public void setFarmeremail(String farmeremail) {
		this.farmerEmail = farmeremail;
	}

}
