package Fourth;

public class StockItem {
	int itemNumber;
	String itemName;
	double itemPrice;
	int quantity;
	StockItem(int itemNumber,String itemName, double itemPrice ){
		this.itemNumber= itemNumber;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		
	}
	void setItemQuantity(int n) {
		this.quantity = n;
	}
	int getQuantity() {
		return quantity;
	}
}
