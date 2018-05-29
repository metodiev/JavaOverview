package oop;

//abstract class is class which has at least one abstract method
//abstract method is method which is not complete
//interface has only abstract methods
//abstract class can have  complete methods and at least one abstract method
public abstract class AbstractClass {

	//abstract method
	public abstract void  printMe();
	public abstract int  returnInt();
	
	public void thisisCompleteMethod() {
		System.out.println("This method is complete");
	}
}
