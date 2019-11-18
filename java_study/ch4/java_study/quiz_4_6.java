package java_study;

public class quiz_4_6 {

	public static void main(String[] args)
	{
		int sum=0;
		int i=0;
		int j=0;
		for (i=1; i<=6; i++) {
			for (j=1; j<=6; j++) {
				sum=i+j;
				if(sum==6) {
					System.out.println(i+"+"+j+"="+sum);
				}
			}
		}
	}
	
}
