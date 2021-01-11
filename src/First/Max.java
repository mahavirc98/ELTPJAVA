package First;

public class Max {
	static int calMax(int x, int y,int z) {
		if(x>=y && x>=z) {
			return x;
		}
		else if(y>=x && y>=z) {
			return y;
		}
		else
		{
			return z;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Max of 10,20,30 is " + calMax(10,20,30));

	}

}
