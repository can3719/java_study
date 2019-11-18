package java_study;

public class quiz_5_6 {

	public static void main(String[] args)
	{
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		int coin_count = 0;
		
		/*
		coin_count=money/coinUnit[0];
		int temp = money%coinUnit[0];
		
		System.out.println(coin_count);
		System.out.println(temp);
		*/
		for(int i=0; i<coinUnit.length; i++) {
			coin_count+=money/coinUnit[i];
			money = money%coinUnit[i];
			
		}
		
		System.out.println("필요한 동전 갯수는 "+coin_count+"개 입니다.");
	}
	
}
