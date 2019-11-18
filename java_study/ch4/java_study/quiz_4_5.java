package java_study;

public class quiz_4_5 {

	public static void main(String[] args)
	{
		for (int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k=0;
		while (k<=10) {
			int m=0;
			while (m<=k) {
				System.out.print("*");
				m++;
			}
			System.out.println();
			k++;
		}
	}
	
}
