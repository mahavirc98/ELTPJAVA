package Fourth;



public class Customer extends CustomerTest{
	int id;
	int orderno=0;
	String name,street,city,state;
	int zip;
	double totalSale=0;
	PurchaseOrder[] Porder = new PurchaseOrder[50];
	String homePhone,cellPhone, workPhone;
	Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void printPhoneNumbers() {
		System.out.println("Home Phone Number is " + homePhone + " cellPhone is " + cellPhone + " workPhone is " + workPhone);
	}
	void printShippingAddress() {
		System.out.println("Address is " + street + ",City " + city + ", State " + state + " Zip: " + zip);
	}
	void setPrintingAddress(String street,String city, String state,int zip) {
		this.zip = zip;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}
	void displayDetails() {
		System.out.println("Name " + name + " Address ");
		 printShippingAddress();
		 printPhoneNumbers();
	}
	void createPurchaseOrder() {
		
		Porder[orderno] = new PurchaseOrder(orderno+1, stock);
//		Porder[orderno].setItems();
//		Porder[orderno].setShip();
//		Porder[orderno].isShipped();
		for (int i = 0; i < orderno; i++) {
			Porder[i].setItems();
			Porder[i].setShip();
			Porder[i].isShipped();
			
		}
		
	}
	
	double getTotal() {
	for(int i=0;i<orderno;i++){
		totalSale = totalSale + Porder[i].sumItems();
	}
	return totalSale;}
	void ship(int n) {
		for (int i = 0; i < Porder.length; i++) {
			if(n==i+1) {
				Porder[i].setShip();
			}
			
		}
	}

}
