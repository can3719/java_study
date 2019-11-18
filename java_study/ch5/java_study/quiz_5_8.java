package java_study;

public class quiz_5_8 {

	public static void main(String[] args)
	{
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			int temp = 0;
			temp = answer[i];
			counter[temp-1]++;
			//System.out.println(temp);
					
		}
		
		for(int i=0; i<counter.length; i++) {
			
			String star = "";
			for (int j=0; j<counter[i]; j++) {
				star+="*";
			}
			System.out.println(counter[i]+star);
			//System.out.println(counter[i]);
			//System.out.println(i+1+"개수"+counter[i]);
			//System.out.println();
		}
	}
	
}
