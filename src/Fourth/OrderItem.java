package Fourth;

public class OrderItem {
	
	StockItem stockItem;
	int noOfItems;
	double total;
	OrderItem(StockItem stockItem, int noOfItems){
		this.stockItem = stockItem;
		this.noOfItems = noOfItems;
		total = stockItem.itemPrice*noOfItems;
		
		
	}
	
	double getTotal() {
		//total = stockItem.itemPrice*noOfItems;
		return total;
	}

}
