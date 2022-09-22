package javaString;

public class DivStringInNEqualParts {

	public static void main(String[] args) {
		String str="aaaabbbbcccc";
		int n=3;
		int len=str.length();
		int chars=len/n;
		
		if(len%n!=0){
			System.out.println("String cannot be divided in N equal parts");
		}
		else{
			for(int i=0;i<len;i=i+chars){
				String part=str.substring(i,i+chars);
				System.out.println(part);
			}
		}
	}
}
