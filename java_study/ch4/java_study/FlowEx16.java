package java_study;

public class FlowEx16 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=2; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				sum=i*j;
				System.out.println(i+"*"+j+"="+sum);
			}
		}
	}
	
}
