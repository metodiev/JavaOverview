package _2_classes;

public class ParentExampleClass {
	
	private String tongue;
	private int sum;
	public String insecureVariable;
	
	public String getTongue() {
		return tongue + "parent";
	}
	
	public void setTongue(String tongue) {
		
		if(tongue == "-"){
		this.tongue = tongue;
		this.tongue = "Invalid Tongue";
		}
		else{
			this.tongue = tongue;
		}
			
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	//create setters and getter
	

}
