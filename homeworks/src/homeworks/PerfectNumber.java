package homeworks;
import java.util.Scanner;
import java.util.ArrayList;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int number ;
		int divSum = 0;		
		
		ArrayList<Integer> divisors = new ArrayList<>();	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("PLEASE ENTER A NUMBER: ");
		number = scanner.nextInt()		;
		
		if(number == 1) {
			System.out.println("This number is not a Perfect Number!");			
		}
		
		for(int i =1 ; i<number;i++) {
			if(number % i == 0 ) {
				
				divSum += i;
				divisors.add(i);
				
			}
			
		}
		
		if(divSum == number) {
			System.out.println("This Number is a Perfect Number");
			System.out.println("Divisors of number :" );
			for (Integer integer : divisors) {
				System.out.println(integer);
			}
		}else {
			System.out.println("This number is not a Perfect Number!");		
		}
		
		scanner.close();

	}

}
