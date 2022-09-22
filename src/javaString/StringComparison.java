package javaString;

public class StringComparison {

	public static void main(String[] args) {
		String name1="Neha Kadekar";
		String name2="hsnsg";
		
		//Using Equals() methods : compares values
		System.out.println(name1.equalsIgnoreCase(name2));
		
		//By operator == method : compares instances and not values
		System.out.println(name1==name2);
		
		//By compareTo() method
		System.out.println(name1.compareTo(name2));
		}

}
