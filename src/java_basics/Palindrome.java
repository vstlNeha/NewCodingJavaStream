package java_basics;

public class Palindrome {

	public static void main(String[] args) {
		int n=454, sum=0, temp,r;
		temp=n;
		
		while(n>0){
			r=n%10;//4 5 4
			sum=(sum*10)+r;
			System.out.println(sum);
			n=n/10; //45
			//System.out.println(n);
		}
		if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");   
		}

}
