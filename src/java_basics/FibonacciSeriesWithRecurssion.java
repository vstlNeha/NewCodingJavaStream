package java_basics;

public class FibonacciSeriesWithRecurssion {
	static int n1=0,n2=1, n3=0;
	static void printFiboSeries(int count){
		if(count>0){
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
			printFiboSeries(count-1);
		}
	}
	
public static void main(String[] args) {
		int count=10;
		System.out.println(n1+ " " +n2);
		printFiboSeries(count-2);
	}

}
