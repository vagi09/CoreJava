package coreJavaPractice;

public class finalKeyWord   {
	
	static int a=3;
	static int b=4;
	static int sub;
	
//	sub = a- b;

	public static void main(String[] args) {

		final int i = 10; // Int value can't be changed

		int j = 20;
		j = 30; // j value is chnaged from 20to 30

		int sum = i + j;

		System.out.println(sum);
		
		finalKeyWord s = new finalKeyWord();
		
		System.out.println(s.a);
		
		
		
	}

	
}
