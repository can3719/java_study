package java_study;

public class ArrayEx2 {

	public static void main(String[] args){
		int[] score= {79,88,91,33,100,55,95};
		
		int max=score[0];
		int min=score[0];
		
		for (int i=0; i<score.length; i++) {
			if(score[i]>max) {
				max=score[i];
			}
			if(score[i]<min) {
				min=score[i];
			}
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		System.out.println("최소값은 "+min+"입니다.");
	}
	
}
