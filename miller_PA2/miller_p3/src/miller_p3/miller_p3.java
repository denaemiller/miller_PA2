package miller_p3;
import java.util.Scanner;

public class miller_p3 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"Topic 1-World Hunger", "Topic 2-Donald Trump", "Topic 3-Global Warming", "Topic 4-Homeless People", "Topic 5-Terrorists"};
		final int row = 5;
		final int column = 10;
		int [][] responses = new int [row][column];
		int i, j;
		int result1 = 0; 
		int result2 = 0; 
		int result3 = 0;
		int result4 = 0; 
		int result5 = 0;
		double average1, average2, average3, average4, average5;
		
		//just to check the first array
		for (i = 0; i < 5; i++) {
			System.out.println(topics[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		
		//getting user input for all 5 topics
		for (i = 0; i < 5; i++) {
			System.out.println("If there are no more people that want to rate type -1, also all ratings must be between 1 and 10.");
			
			for (j = 0; j < 10; j++) {
				System.out.print("Rate " + topics[i] + ": ");
				responses[i][j] = scnr.nextInt(); 
				
				//the rules of the rating system
				if (responses[i][j] == -1) {
					break;
				}
				if ((responses[i][j] > 10) || (responses[i][j] < -1)) {
					System.out.println("The rating you gave is not valid, continuing to next topic!!");
					break;
				}
				
				//adding up the results
				if (i == 0) {
					result1 = result1 + responses[i][j];
				}
				else if (i == 1 ) {
					result2 = result2 + responses[i][j];
				}
				else if (i == 2) {
					result3 = result3 + responses[i][j];
				}
				else if (i == 3) {
					result4 = result4 + responses[i][j];
				}
				else {
					result5 = result5 + responses[i][j];
				}
				
				
			}
		}
		
		average1 = result1 / (double) 10;
		average2 = result2 / (double) 10;
		average3 = result3 / (double) 10;
		average4 = result4 / (double) 10;
		average5 = result5 / (double) 10;
		
		
		System.out.println("" + topics[0] + ":  " + responses[0][0] + " " + responses[0][1] + " " +  responses[0][2] + " " +  responses[0][3] + " " +  responses[0][4] + " " +  responses[0][5] + " " +  responses[0][6] + " " +  responses[0][7] + " " +  responses[0][8] + " " +  responses[0][9] + " = " + result1 + "   Average = " + average1);
		System.out.println("" + topics[1] + ":  " + responses[1][0] + " " + responses[1][1] + " " +  responses[1][2] + " " +  responses[1][3] + " " +  responses[1][4] + " " +  responses[1][5] + " " +  responses[1][6] + " " +  responses[1][7] + " " +  responses[1][8] + " " +  responses[1][9] + " = " + result2 + "   Average = " + average2);
		System.out.println("" + topics[2] + ":  " + responses[2][0] + " " + responses[2][1] + " " +  responses[2][2] + " " +  responses[2][3] + " " +  responses[2][4] + " " +  responses[2][5] + " " +  responses[2][6] + " " +  responses[2][7] + " " +  responses[2][8] + " " +  responses[2][9] + " = " + result3 + "   Average = " + average3);
		System.out.println("" + topics[3] + ":  " + responses[3][0] + " " + responses[3][1] + " " +  responses[2][2] + " " +  responses[3][3] + " " +  responses[3][4] + " " +  responses[3][5] + " " +  responses[3][6] + " " +  responses[3][7] + " " +  responses[3][8] + " " +  responses[3][9] + " = " + result4 + "   Average = " + average4);
		System.out.println("" + topics[4] + ":  " + responses[4][0] + " " + responses[4][1] + " " +  responses[3][2] + " " +  responses[4][3] + " " +  responses[4][4] + " " +  responses[4][5] + " " +  responses[4][6] + " " +  responses[4][7] + " " +  responses[4][8] + " " +  responses[4][9] + " = " + result5 + "   Average = " + average5);
		System.out.println("");
		
		//Finding the greatest number of ratings
		if ((result1 > result2) && (result1 > result3) && (result1 > result4) && (result1 > result5)) {
			System.out.println("Greatest ratings is " + topics[0] + ": " +  result1);
		}
		else if ((result2 > result1) && (result2 > result3) && (result2 > result4) && (result2 > result5)) {
			System.out.println("Greatest ratings is " + topics[1] + ": " +  result2);
		}
		else if ((result3 > result2) && (result3 > result1) && (result3 > result4) && (result3 > result5)) {
			System.out.println("Greatest ratings is " + topics[2] + ": " +  result3);
		}
		else if ((result4 > result2) && (result4 > result3) && (result4 > result1) && (result4 > result5)) {
			System.out.println("Greatest ratings is " + topics[3] + ": " +  result4);
		}
		else {
			System.out.println("Greatest ratings is " + topics[4] + ": " +  result5);
		}
		
		
		//Finding the least number of ratings
		if ((result1 < result2) && (result1 < result3) && (result1 < result4) && (result1 < result5)) {
			System.out.println("Least ratings is " + topics[0] + ": " +  result1);
		}
		else if ((result2 < result1) && (result2 < result3) && (result2 < result4) && (result2 < result5)) {
			System.out.println("Least ratings is " + topics[1] + ": " +  result2);
		}
		else if ((result3 < result2) && (result3 < result1) && (result3 < result4) && (result3 < result5)) {
			System.out.println("Least ratings is " + topics[2] + ": " +  result3);
		}
		else if ((result4 < result2) && (result4 < result3) && (result4 < result1) && (result4 < result5)) {
			System.out.println("Least ratings is " + topics[3] + ": " +  result4);
		}
		else {
			System.out.println("Least ratings is " + topics[4] + ": " +  result5);
		}
		
	}

}
