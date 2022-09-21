package java_basics;

public class JavaTrial {

	public static void main(String[] args) {
		String name= "Neha Kadekar";
		int count=0;
		char letter = 'e';
		for (int i=0; i<name.length();i++){
			if(name.charAt(i)==letter){
				count++;}
		}
		System.out.println(count);
	}

}
