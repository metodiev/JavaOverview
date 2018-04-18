package _2_classes;

//extends mean "Nasledqvane" in Java
public class Mercedes extends Car {

	public static void main(String[] args) {
		
		Mercedes slk = new Mercedes();
		slk.setModel("slk");
		slk.setColor("black");
		
		slk.startEngine();
		
		System.out.println("Color of the mercedes-benz is: " + slk.getColor());
		

	}

}
