package java.collections.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListQueueSet {
	
	private String p;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof JavaListQueueSet)) {
			return false;
		}
		JavaListQueueSet other = (JavaListQueueSet) obj;
		if (p == null) {
			if (other.p != null) {
				return false;
			}
		} else if (!p.equals(other.p)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		
		//List
		List pesho = new ArrayList<>();
		List gosho= new ArrayList<>();
		
		
		int fp = 5;
		int fp1 = 5;
		
		if(fp == fp1) {
			System.out.println("The two variables are equals");
		}else {
			System.out.println("Not equals");
		}
		
		
		
		pesho.add("5");
		gosho.add(5);
		pesho.add("54");
		gosho.add(1515);
		String five = "5";
		String five1 = new String("5");
			if(five == five1) {
				System.out.println("The two variables are equal");
			}else {
				System.out.println("Not equals");
			}
			
			
			if(five.equals(five1)) {
				System.out.println("The two variables are equal");
			}else {
				System.out.println("Not equals");
			}
		
		System.out.println(pesho.hashCode());
		System.out.println(gosho.hashCode());
		
		System.out.println(five.hashCode());
		System.out.println(five1.hashCode());
		
		List linkedList = new LinkedList<>();
		
		for (int i = 0; i < 100; i++) {
			linkedList.add("asd");
			linkedList.add(51123);
		}
		
		
		for (Object object : linkedList) {
			//System.out.println(object);
		}
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000000; i++) {
			linkedList.add("asd");
			linkedList.add(51123);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);

	}

}
