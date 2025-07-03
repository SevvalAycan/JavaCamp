package homeworks;

import java.util.Scanner;

public class PrimenNumbers {

	public static void main(String[] args) {
		
		int number;
		boolean isPrime =true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		number = scanner.nextInt();


		for (int i = 2; i <= 10; i++) {
			
			if(number % i == 0 && number != i) {
				isPrime = false ;
				break;
			}
			else {
				isPrime = true;
			}
		}
		
		if(isPrime == true) {
			System.out.println("Your number is prime: " + number);
		}
		else {
			System.out.println("Your number is not prime: " + number);
		}
		
		scanner.close();
	
	}

}
