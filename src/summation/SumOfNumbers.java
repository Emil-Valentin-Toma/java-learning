package summation;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		int number = 1;
		//calculating the sum of numbers from 1 to 100:
		while (number <= 100) {
			sum = sum + number;
			number = number +1;
			
		}
		System.out.println("The sum of numbers from 1 to 100 is " + sum );
	}

}
