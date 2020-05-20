package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class usedProduct extends Product {
	    
	private Date manufactureDate = new Date();
	static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	

	public usedProduct(String name, Double price) {
		super(name, price);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	protected String priceTag() {
		return String.format("%s (used) $%.2f (Manufature date:", getName(),getPrice()) + sdf1.format(manufactureDate)+")";
		
	}
	

}
