package java_study;

public class ArrayEx6 {

	public static void main(String[] args)
	{
		int[] number=new int[10];
		int[] counter=new int[10];
		
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]=(int)(Math.random()*10));
		}
		System.out.println();
		for (int i=0; i<number.length; i++) {
			counter[number[i]]=counter[number[i]]+1;
		}
		for(int i=0; i<number.length; i++) {
			System.out.println(i+"의 개수 : "+counter[i]+"개 입니다.");
		}
	}
	
}
