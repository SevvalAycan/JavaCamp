package homeworks;

public class AmicableNumbers {

	public static void main(String[] args) {

		int num1 = 284;
		int num2 = 220;
		int sumDiv1 = 0; // sum of divisors number1
		int sumDiv2 = 0; // sum of divisors number2

		for (int i = 1; i < num1; i++) {

			if (num1 % i == 0) {
				sumDiv1 += i;
			}
		}

		for (int j = 1; j < num2; j++) {

			if (num2 % j == 0) {
				sumDiv2 += j;
			}
		}

		if (num1 == sumDiv2 && num2 == sumDiv1) {
			System.out.println("Numbers are amicable : " + num1 + " & " + num2);
		} else {
			System.out.println("Numbers are not amicable : " + num1 + " & " + num2);
		}

	}

}
