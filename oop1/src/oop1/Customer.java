package oop1;

public class Customer {
	
	private int id;
	private String customerNumber;
	private String phone; // üzerinde matematiksel işlem yapmıyorsun o yüzden String seçtik,

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
