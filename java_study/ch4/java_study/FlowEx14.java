package java_study;

public class FlowEx14 {

	public static void main(String[] args)
	{
		int sum=0;		//합계를 저장하기 위한 변수.
		int i;
		for(i=1; i<=10; i++) {
			sum+=i;		//sum=sum+1;
			
		}
		System.out.println(i-1+"까지의 합 : "+sum);		//에러발생!!!
	}
	
}
