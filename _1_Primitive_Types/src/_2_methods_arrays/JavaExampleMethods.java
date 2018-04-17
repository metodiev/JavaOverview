package _2_methods_arrays;

public class JavaExampleMethods {
	
	//in Java you've methods which are something like action for class
	//for example human can swim
	
	//most simple method
	public static void printSomething(){
		System.out.println("Niki loves skype app");
	}
	
	////methods that has return something
	public static int sum(int a, int b){
		System.out.println("Return some int value");
		
		return a+b;
		
		//all code after return statement is dead (the compilator will not look after retrun)
	}
	
	//method can return String value
	public static String returnStreMethod(){
		System.out.println("Return String value for method");
		
		return "Niki loves skype";
		
	}
	
	public static void main(String[] args){
		printSomething();
		int intValue = sum(5,5);
		System.out.println(intValue);
		String nikiLovesSKype = returnStreMethod();
		System.out.println(nikiLovesSKype);
	}

}
