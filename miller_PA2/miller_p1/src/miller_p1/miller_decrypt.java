package miller_p1;
import java.util.Scanner;

public class miller_decrypt {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int program, digit1, digit2, digit3, digit4, x;
		
		System.out.print("Enter a 4 digit integer:");
		program = scnr.nextInt();
		
		digit1 = program / 1000;
		digit2 = (program / 100) % 10;
		digit3 = (program / 10) % 10;
		digit4 = program % 10;
		
		//for digit 1
		if (digit1 < 7) {
			digit1 = digit1 - 7;
			digit1 = (Math.abs(digit1) - 10);
			digit1 = Math.abs(digit1);
		}
		else {
			digit1 = digit1 - 7;
		}
		
		//for digit 2
		if (digit2 < 7) {
			digit2 = digit2 - 7;
			digit2 = (Math.abs(digit2) - 10);
			digit2 = Math.abs(digit2);
		}
		else {
			digit2 = digit2 - 7;
		}
		
		//for digit 3
		if (digit3 < 7) {
			digit3 = digit3 - 7;
			digit3 = (Math.abs(digit3) - 10);
			digit3 = Math.abs(digit3);
		}
		else {
			digit3 = digit3 - 7;
		}
		
		//for digit 4
		if (digit4 < 7) {
			digit4 = digit4 - 7;
			digit4 = (Math.abs(digit4) - 10);
			digit4 = Math.abs(digit4);
		}
		else {
			digit4 = digit4 - 7;
		}
		
		
		
		System.out.println("" + digit3 + digit4 + digit1 + digit2);
		
	}

}
