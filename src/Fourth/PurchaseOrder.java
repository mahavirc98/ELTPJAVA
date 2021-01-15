package Fourth;

import java.util.Scanner;

public class PurchaseOrder {
	int poNo;
	int flag = 0;
	int no;
	StockItem[] stock;
	OrderItem[] order = new OrderItem[no];
	Scanner sc=new Scanner(System.in);
	public PurchaseOrder(int poNo,StockItem[] stock) {
		// TODO Auto-generated constructor stub
		this.poNo = poNo;
		System.out.println("Enter no of items you want to purchase");
		no = sc.nextInt();
		sc.nextLine();
		this.stock = stock;
		
	}
	
	void setShip() {
		flag = 1;
	}
	boolean isShipped() {
		if(flag==0) {
			return false;
		}
		else {
			return true;
		}
	}
	void setItems() {
		
		for (int i = 0; i < order.length; i++) {
			System.out.println("Enter the product name");
			String pname = sc.nextLine();
			System.out.println("Enter the Quantity");
			int q = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < stock.length; j++) {
				if(pname==stock[j].itemName) {
					order[i] = new OrderItem(stock[j],q);
				}
			}
			
		}
	}
	void getItems() {
		for (int i = 0; i < order.length; i++) {
			System.out.println(order[i].stockItem.itemName);
			
		}
	}
	double sumItems(){
		double total = 0;
		for (int i = 0; i < order.length; i++) {
			total = total + order[i].total;
			
		}
		return total;
	}

}
