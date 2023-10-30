package Dealer_Service.Dealer_ServiceMain.model;

public class Payment_Method {
	private String card_number;
	private String card_type;
	private String cvv;

	public Payment_Method() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment_Method(String card_number, String card_type, String cvv) {
		super();
		this.card_number = card_number;
		this.card_type = card_type;
		this.cvv = cvv;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
