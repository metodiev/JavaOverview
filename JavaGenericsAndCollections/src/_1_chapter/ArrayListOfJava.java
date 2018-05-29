package _1_chapter;

public class ArrayListOfJava implements ListOfJava {

	private String[] element;

	// constructors
	public ArrayListOfJava() {

	}

	// constructors
	public ArrayListOfJava(String[] element) {
		this.element = element;
	}

	@Override
	public String returnLastStringElements() {
		
		return this.element[this.element.length-1];
	}

	@Override
	public int size() {

		return element.length;
	}

	@Override
	public void removeElement(int elementIndex) {
		for (int i = 0; i < this.element.length; i++) {
			if (i == elementIndex) {
				String[] newArr = fillNewArrayList(this.element, elementIndex);
				this.element = new String[this.element.length - 1];
				this.element = newArr;
			}
		}

	}

	private String[] fillNewArrayList(String[] element2, int elementIndex) {
		String[] returnArr = new String[element2.length - 1];
		int fillCounter = 0;
		
		for (int i = 0; i < element2.length; i++) {
			if (element2[i] != String.valueOf(element2[elementIndex])) {
				returnArr[fillCounter] = element2[i];
				fillCounter++;
			}
			

		}
		return returnArr;
	}

	@Override
	public void addStringElements(String[] arr) {
		this.element = arr;

	}

}
