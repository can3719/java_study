package java_study;

public class quiz_4_13 {

	public static void main(String[] args)
	{
		String value="12x34";
		char ch=' ';
		boolean isNumber=true;
		
		//반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for(int i=0; i<value.length(); i++) {
			//System.out.println(value.charAt(i));
			if(!(value.charAt(i)>='0' && value.charAt(i)<='9')) {
				isNumber=false;
			}
			System.out.println(value.charAt(i));
			if(isNumber) {
				System.out.println(value+"는 숫자입니다.");
			} else {
				System.out.println(value+"는 숫자가 아닙니다.");
			}
		}
		/*
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
		*/
	}
	
}
