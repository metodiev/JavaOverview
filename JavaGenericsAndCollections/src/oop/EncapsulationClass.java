package oop;

public class EncapsulationClass {

	// encapsulation modifiers
	// private, public, protected

	// private modifier - means that this variable, method is visible only in
	// current class
	private String privateStringName;

	// public modifier - means that this variable ,methos is visible anywhere
	public String publicStringName;

	// protected modifier - means that this variable, method, class, is visible only
	// in current package
	protected String protectedStringName;

	public String getPrivateStringName() {
		return privateStringName;
	}

	public void setPrivateStringName(String privateStringName) {
		this.privateStringName = privateStringName;
	}

	public String getPublicStringName() {
		return publicStringName;
	}

	public void setPublicStringName(String publicStringName) {
		if (publicStringName == "Pesho") {
			this.publicStringName = publicStringName;
			System.out.println("Successful input");
		}else {
			System.out.println("Invalid User");
		}
	}

	public String getProtectedStringName() {
		return protectedStringName;
	}

	public void setProtectedStringName(String protectedStringName) {
		this.protectedStringName = protectedStringName;
	}

}
