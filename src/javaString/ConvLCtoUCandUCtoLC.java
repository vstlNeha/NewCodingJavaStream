package javaString;

public class ConvLCtoUCandUCtoLC {

	public static void main(String[] args) {
		String str ="Great Power";
		int len=str.length();
		StringBuffer newStr= new StringBuffer(str);
		for(int i=0;i<len;i++){
		if(Character.isLowerCase(str.charAt(i))){
			newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			
		}else if(Character.isUpperCase(str.charAt(i))){
			newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}}
		
		System.out.println(newStr);
		
		
				

	}

}
