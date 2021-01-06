package First;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Mahavir Chordiya");
		System.out.println("calling getSum");
		
		HelloWorld obj = new HelloWorld();
		int sum = obj.getSum(10,20,30,40,50);
		System.out.println(sum);
		byte byt = (byte)128; //type casting
		System.out.println(byt);
		System.out.println("Hello " + obj.isPalindrome("HELLO"));
		System.out.println("Hello " + obj.isPalindrome("NITIN"));
		System.out.println("Current Time " + System.currentTimeMillis());
		
		

	}
	public int getSum(int... nums) {
		int total=0;
		for(int number:nums) {
			total+=number;
		}
		return total;
	}
	
	public boolean isPalindrome(String s) {
		String rev = new StringBuilder(s).reverse().toString();
		return s.equals(rev);
	}

}
