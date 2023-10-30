package Admin_Service.Admin_serviceMain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString

@Document(collection = "Farmer")
public class Farmer {

	@Id
	private String id;
	private String farmer_name;
	private String farmer_email;
	private String farmer_contactNo;
	private location farmer_address;
	private bankDetails bank_details;

	public Farmer(String id, String farmer_name, String farmer_email, String farmer_contactNo, location farmer_address,
			bankDetails bank_details) {
		super();
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmer_email = farmer_email;
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

	public Farmer(String id, String farmer_name, String farmer_email, String farmer_contactNo,
			location farmer_address) {
		super();
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmer_email = farmer_email;
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
		this.farmer_email = farmer_email;
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

	public String getFarmer_email() {
		return farmer_email;
	}

	public void setFarmer_email(String farmer_email) {
		this.farmer_email = farmer_email;
	}

}
