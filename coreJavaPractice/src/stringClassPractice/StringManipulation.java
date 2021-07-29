package stringClassPractice;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Woods are lovely dark and deep";
		String str1 = "Woods_are_lovely_dark_and_deep";
		String str2= "I have miles to go before i sleep";
		String str3= "  Woods Are Lovely Dark And Deep  ";
		String x="Hello";
		String y="world";
		int a = 100;
		int b = 200;
		
		

		System.out.println("Total lenght of the String: " + str.length());
		System.out.println("Char at 6th location: " + str.charAt(6));
		System.out.println("location of first char 'a': " + str.indexOf('a'));
		System.out.println("location of 2nd char 'a': " + str.indexOf('a', str.indexOf('a') + 1));
		System.out.println("3rd occurance of a: " + str.indexOf('a', str.indexOf('a', str.indexOf('a')+1)+1));
		System.out.println("Index of sub string: " + str.indexOf("are"));
		System.out.println(str.indexOf("hello")); // o/p is -1 as no hello in the string
		System.out.println(str.equals(str1)); //compares str and str1
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3)); // ignores capital letter of str3 and compares with str1
		System.out.println(str.substring(0, 9)); // substring
		System.out.println(str3.trim()); // only removes before space and after space "--before space--- string---afterspace--"
		System.out.println(str1.replace(" ", ""));
		
		//splitting the string 
		
		String str4[] = str1.split("_");
		for(int i = 0; i<str4.length; i++) {
			
			System.out.println(str4[i]);
		}
		

	System.out.println(x+y); //Helloworld	
	System.out.println(x+y+a+b); //Helloworld100200
	System.out.println(a+b+x+y); // 300Helloworld
	System.out.println(x+y+(a+b)); //Helloworld300
	
		
		
	}

}
