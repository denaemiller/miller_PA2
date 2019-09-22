package miller_p1;
import java.util.Scanner;

public class miller_encrypt {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int program, digit1, digit2, digit3, digit4, x;
		
		System.out.print("Enter a 4 digit integer:");
		program = scnr.nextInt();
		
		digit1 = program / 1000;
		digit2 = (program / 100) % 10;
		digit3 = (program / 10) % 10;
		digit4 = program % 10;
		
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;
		
		System.out.println("" + digit3 + digit4 + digit1 + digit2);
		
		
		
		
	}
}

	

