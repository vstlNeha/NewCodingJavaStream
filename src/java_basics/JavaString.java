package java_basics;

import java.util.Scanner;

public class JavaString {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
		System.out.println("Enter Username");

		String userName = myObj.nextLine(); 
		System.out.println("Username is: " + userName); 
		
		String[] word=userName.split("\\s");
		
		String firstName=word[0];
		String lastName=word[1];
		
		String str1=firstName.substring(0,2);
		String str2=lastName.substring(0,2);
		
		System.out.println(str1 + "" + str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String lastName = myObj.nextLine(); 
		System.out.println("lastName is: " + lastName); 
		
		String firstName = "Neha";
		String lastName = "Kadekar";
		
		String str1=firstName.substring(0,2);
		String str2=lastName.substring(0,2);
		
		System.out.println(str1 + "" + str2);*/
		
		
		/*int strLength=  userName.length();
		String[] newName= userName.split(userName);*/
			
			        
			
		}
		
		
	
		
		

	}


