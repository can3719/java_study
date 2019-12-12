package java_study;

class Exercise6_20 {
	
	/*
	public static int[] shuffle(int[] arr) {
		if(arr==null || arr.length==0)
			return arr;
		
		for(int x=0; x<arr.length*2; x++) {
			int i = (int) (Math.random()*arr.length);
			int j = (int) (Math.random()*arr.length);
			
			// arr[i]와 arr[j]의 값을 서로 바꾼다.
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		return arr;
	}
	*/
	
	public static int[] shuffle(int[] arr) {
		if(arr==null || arr.length==0)
			return arr;
		
		for(int x=0; x<arr.length; x++) {
			int i=(int)(Math.random()*arr.length);
			int j=(int)(Math.random()*arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}
	
	

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}