package java_study;

public class quiz_4_4 {

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		while (sum<100) {
			num=num+1;
			if(num%2==0) {
				sum=sum-num;
			} else {
				sum=sum+num;
			}
			System.out.println("num="+num+"sum="+sum);
			//System.out.println(num);
		}
		
	}
	
}
