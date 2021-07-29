package keyWordsPractice;

public class ThisKeyWord {
	//1.global varibales declared at class level
	String name;
	int age;
	
	public ThisKeyWord(String name, int age) { // 2.local varibales declared at method level
		
		this.name=name; //4. this keyword specfies that global varible name=name used here.
		this.age = age; //5. this keyword specfies that global varible age=age used here.
		
		System.out.println(name);
		System.out.println(age);
		
		
	}

	public static void main(String[] args) {
		ThisKeyWord obj = new ThisKeyWord("Tom", 30); // 3.java intializing local varibales, global varibales not used.
		

		// When the names of global and local varibles are same, this keyword is used to avoid teh confusion. 


	}

}
