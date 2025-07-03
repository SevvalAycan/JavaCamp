package oop1;

public class Main {

	public static void main(String[] args) {
				
		//set value
		Product product1 = new Product();		
		product1.setName("Delonghi Coffee Machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitIntStock(3);
		product1.setImageUrl("image1.jpg");		
		
		Product product2 = new Product();		
		product2.setName("Smeg Coffee Machine");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitIntStock(6);
		product2.setImageUrl("image1.jpg");	

		Product product3 = new Product();	
		product3.setName("Kitchen Aid Coffee Machine");
		product3.setDiscount(9);
		product3.setUnitPrice(5500);
		product3.setUnitIntStock(4);
		product3.setImageUrl("image1.jpg");	
		
		Product[] products = {product1, product2, product3};	
		
		System.out.println("<ul>");
		//foreach
		for (Product product : products) {
			System.out.println("PRODUCT: ");
			System.out.println("<li>" +"Name: " + product.getName() +"</li>");
			System.out.println("<li>" +"Discount: " +product.getDiscount()+"</li>");
			System.out.println("<li>" +"Url: " +product.getImageUrl()+"</li>");
			System.out.println("<li>" +"Unit in Stock: " +product.getUnitIntStock()+"</li>");
			System.out.println("<li>" +"Unit Price: " +product.getUnitPrice()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("+905555555555");
		individualCustomer.setCustomerNumber("11111");
		individualCustomer.setFirstName("Şevval");
		individualCustomer.setLastName("Aycan");	
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("+902662662626");
		corporateCustomer.setCustomerNumber("11112");
		corporateCustomer.setCompanyName("CameliaSoftware");
		corporateCustomer.setCustomerNumber("xxxxxxxxxx");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	
	}

}
