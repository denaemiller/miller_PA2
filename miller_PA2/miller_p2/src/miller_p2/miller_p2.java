package miller_p2;
import java.util.Scanner;

public class miller_p2 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		double weightPounds;
		double heightInches;
		double bmi;
		
		System.out.print("Enter weight in pounds: ");
		weightPounds = scnr.nextDouble();
		System.out.print("Enter height in inches: ");
		heightInches = scnr.nextDouble();
	
		bmi = (703 * weightPounds) / (Math.pow(heightInches, 2));
		
		if (bmi < 18.5) {
			System.out.println("The BMI is " + bmi + ", which is Underweight");
		}
		else if ((bmi >= 18.5) && (bmi <= 24.9)) {
			System.out.println("The BMI is " + bmi + ", which is Normal weight");
		}
		else if ((bmi >= 25) && (bmi <= 29.9)) {
			System.out.println("The BMI is " + bmi + ", which is Over weight");
		}
		else {
			System.out.println("The BMI is " + bmi + ", which is Obesity");
		}

				
				
	}
}

