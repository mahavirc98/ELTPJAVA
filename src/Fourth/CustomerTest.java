package Fourth;

import java.util.Scanner;

public class CustomerTest {
	//int order=0;
	StockItem[] stock = new StockItem[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] cust = new Customer[3];
		Scanner sc=new Scanner(System.in);
		StockItem[] stock = new StockItem[5];
		for(int i=0;i<cust.length;i++) {
			System.out.println("Enter the name");
			String name = sc.nextLine();
			//sc.nextLine();
			System.out.println("Enter the ID");
			int id = sc.nextInt();
			sc.nextLine();
			cust[i] = new Customer(id,name);
			System.out.println("Enter the Street name");
			String street = sc.nextLine();
//			System.out.println("Enter the city name");
//			String city = sc.nextLine();
//			System.out.println("Enter the state");
//			String state = sc.nextLine();
			System.out.println("Enter the zip code");
			int zip = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the home phone number");
			String homePhone = sc.nextLine();
//			System.out.println("Enter the cell phone number");
//			String cellPhone = sc.nextLine();
//			System.out.println("Enter the work phone number");
//			String workPhone = sc.nextLine();
			cust[i].setPhoneNumbers(homePhone, homePhone, homePhone);
			cust[i].setPrintingAddress(street, street, street, zip);
			
			
		}
		for (int i = 0; i < cust.length; i++) {
			cust[i].displayDetails();
			//cust[i].printPhoneNumbers();
			//cust[i].printShippingAddress();
			
		}
		for (int i = 0; i < stock.length; i++) {
			System.out.println("Enter item name");
			String pname = sc.nextLine();
			System.out.println("ENter item number");
			int ino = sc.nextInt();
			System.out.println("Enter Item Price");
			double iprice = sc.nextDouble();
			sc.nextLine();
			stock[i] = new StockItem(ino, pname, iprice);
			
			
		}
		for (int i = 0; i < stock.length; i++) {
			stock[i].setItemQuantity(50);
			System.out.println(stock[i].itemName + stock[i].itemNumber + stock[i].itemPrice + stock[i].quantity);
			
		}
//		for (int i = 0; i < cust.length; i++) {
//			if(cust[i].name == "Jamie") {
//				cust[i].createPurchaseOrder();
//				cust[i].createPurchaseOrder();
//			}
//			else if(cust[i].name =="Bill") {
//				cust[i].createPurchaseOrder();
//			}
//			
//		}
		cust[0].createPurchaseOrder();
		
		for (int i = 0; i < cust.length; i++) {
			System.out.println("Total sale for " + cust[i].name + " is " + cust[i].getTotal());
			
		}
		
		sc.close();
	}

}
