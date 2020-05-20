package entities;

public class ImportedProduct extends Product {
	
	Double customsFee;
	
	public ImportedProduct() {
		super();
	}
    
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


    @Override
	protected String priceTag(){
	return  getName() + " $ "+ String.format("%.2f",super.getPrice()+customsFee) +  String.format(" (customs fee: %s)",customsFee);
	}
	
	
	
	

}
