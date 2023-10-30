package Admin_Service.Admin_serviceMain.model;

public class Dealer_Subcribed_Crop {
	private String crop_name;
	private String crop_type;

	public Dealer_Subcribed_Crop() {
		super();
	}

	public Dealer_Subcribed_Crop(String crop_name, String crop_type) {
		super();
		this.crop_name = crop_name;
		this.crop_type = crop_type;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public String getCrop_type() {
		return crop_type;
	}

	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

}
