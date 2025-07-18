package oop1;

//PascalCase
public class Product {
	// camelCase
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitIntStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitIntStock() {
		return unitIntStock;
	}

	public void setUnitIntStock(int unitIntStock) {
		this.unitIntStock = unitIntStock;
	}

	// private ile sadece bu classa özel kılıyoruz !

}
