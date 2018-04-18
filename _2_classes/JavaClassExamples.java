package _2_classes;

public class JavaClassExamples extends ParentExampleClass{
	
	public String stringField;
	private int intPriveteFild;
	
	public void printSomethingForClass(){
		System.out.println("This is in class");
	}
	
	public static void main(String[] args){
		JavaClassExamples testChildClass = new  JavaClassExamples();
		testChildClass.insecureVariable = "asdf";
		testChildClass.setTongue("-");
		testChildClass.insecureVariable = "Parent Class insecure variable";
		
		System.out.println(testChildClass.getTongue());
	}

}
