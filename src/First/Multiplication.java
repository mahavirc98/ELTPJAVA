package First;

public class Multiplication {
	static void multiplicationMatrix(int[][] multi) {
		int i=0;
		int j=0;
		for(i = 1;i<13;i++) {
			multi[0][i] = i;
			multi[i][0] = i;
			
		}
		for (i=1;i<13;i++) {
			for (j = 1;j<13;j++) {
				multi[i][j] = i*j;
			}
		}
		for(i=0;i<13;i++) {
			for(j=0;j<13;j++) {
				System.out.print(multi[i][j] + " ");
			}
			System.out.println("\n");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multi = new int[13][13];
		multiplicationMatrix(multi);

	}

}
