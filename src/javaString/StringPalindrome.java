package javaString;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="kaynak";
		boolean flag=true;
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				flag=false;
				break;
			}
		}
		if(flag){System.out.println("Plaindrome");}
		else{System.out.println("Not a Plaindrome");}
	}

}
