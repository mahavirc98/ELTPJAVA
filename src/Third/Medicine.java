package Third;

import java.util.Random;

class Tablet extends Medicine{
	void displayLabel() {
		super.displayLabel();
		System.out.println("Store in cool and dry place");
	}
}

class Ointment extends Medicine{
	void displayLabel() {
		super.displayLabel();
		System.out.println("For external use only");
	}
}

class Syrup extends Medicine{
	void displayLabel() {
		super.displayLabel();
		System.out.println("Shake well before use");
	}
}

public class Medicine {
	private String name = "Mahavir Pharma";
	private String address = "Narayangaon";
	void displayLabel() {
		System.out.println("Company name: " + this.name + " Address " + this.address);
	}
	void setname(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[] a = new Medicine[10];
		int randint = 0;
		for(int i=0;i<10;i++) {
			randint = 0;
			Random rand = new Random(); 
			while ((randint<1) || (randint>3))

			{

				//randint = (int) (Math.random() *3 + 1);
				randint = rand.nextInt(4);

			}
			switch(randint) {
			case 1 :{
				a[i] = new Tablet(); break;
			}
			case 2 :{
				a[i] = new Ointment(); break;
			}
			case 3:{
				a[i] = new Syrup(); break;
			}
			default: {
				System.out.println("No new object");
			}
			
			}
			
			System.out.println("Object " + i+1);
			a[i].setname("Mohit" + i+1);
			a[i].displayLabel();
			}
	}

}
