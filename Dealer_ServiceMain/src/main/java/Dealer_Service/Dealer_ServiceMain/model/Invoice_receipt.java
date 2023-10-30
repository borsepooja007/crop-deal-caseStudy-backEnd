package Dealer_Service.Dealer_ServiceMain.model;

import java.util.Date;

public class Invoice_receipt {
	private String crop_name;
	private int quantity;
	private int selling_price;
	private Date date;
	private String payment_method;
	private int total;
	private String seller;

	public Invoice_receipt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice_receipt(String crop_name, int quantity, int selling_price, Date date, String payment_method,
			int total, String seller) {
		super();
		this.crop_name = crop_name;
		this.quantity = quantity;
		this.selling_price = selling_price;
		this.date = date;
		this.payment_method = payment_method;
		this.total = total;
		this.seller = seller;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(int selling_price) {
		this.selling_price = selling_price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

}
