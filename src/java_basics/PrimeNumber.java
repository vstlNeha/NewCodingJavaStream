package java_basics;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i, m=0, flag=0;
		int n=0 ;//number to check if prime or not
		m=n/2;
		if(n==0|| n==1){
			System.out.print(n +" is not a prime number");
		}
		else{
			for(i=2;i<=m ; i++){
				if(n%i==0){
					System.out.println(n+ "is not a prime number");
					flag=1;
					break;
				}
			}if(flag==0){
				System.out.println(n+ "is  a prime number");
		}
			
		}
			
		}

	}


