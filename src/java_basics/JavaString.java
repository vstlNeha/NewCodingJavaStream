package java_basics;

import java.util.Scanner;

public class JavaString {
	private static Scanner sc;
	public static void main(String[] args) {
		String strFullName = "Raj Patil" ;
		System.out.println("Username is: " + strFullName); 
		
		String[] word=strFullName.split("\\s");
		
		String firstName=word[0];
		String lastName=word[1];
		
		String str1=firstName.substring(0,2);
		String str2=lastName.substring(0,2);
		
		System.out.println(str1 + "" + str2);
		}
	}


