package oop;

public class OOPClassCLient extends AbstractClass {

	public static void main(String[] args) {
		EncapsulationClass encapsulation  = new EncapsulationClass();
		
		encapsulation.setPublicStringName("Gosho");
		encapsulation.setPublicStringName("Pesho");
		OOPClassCLient oop = new OOPClassCLient();
		
		oop.thisisCompleteMethod();
	}
	
	//static polymorphism
	public void printTeam() {
		System.out.println("1");
	}
	
	public void printTeam(int t) {
		System.out.println("1");
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int returnInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
