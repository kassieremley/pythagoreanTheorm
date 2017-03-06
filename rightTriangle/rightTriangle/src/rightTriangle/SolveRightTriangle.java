package rightTriangle;
import java.util.Scanner;

public class SolveRightTriangle {

	private static Scanner input;
	public static void main(String[] args)
	{ 
		String choiceSide;
		int newLoop;
		input = new Scanner(System.in);
		do {
			System.out.print("Please choose which side you are solving for A, B, or C. >>>");
			choiceSide = input.nextLine();
			
			if("a".equals(choiceSide) || "A".equals(choiceSide))
			aSide();
			if("b".equals(choiceSide) || "B".equals(choiceSide))
			bSide();
			if("c".equals(choiceSide) || "C".equals(choiceSide))
			cSide();
			
			System.out.println("Type 1 to solve another triangle 1 to stop.>>>");
			newLoop = input.nextInt();
		}while(newLoop != 1);
		}
		public static void aSide()
		{
			double userEntryA, userEntryB, calculateC;
			
			
			System.out.print("Please enter for sde B >>>");
			userEntryA = input.nextDouble();
			System.out.print("Please enter for side C >>>");
			userEntryB = input.nextDouble();
			
			
			calculateC = Math.sqrt(userEntryA * userEntryA + userEntryB * userEntryB);
		
			System.out.println("The answer for side C is >>> " + calculateC);
		}
		public static void bSide()
		{
double userEntryA, userEntryB, calculateC;
			
			
			System.out.print("Please enter for sde A >>>");
			userEntryA = input.nextDouble();
			System.out.print("Please enter for side C >>>");
			userEntryB = input.nextDouble();
			
			
			calculateC = Math.sqrt(userEntryA * userEntryA + userEntryB * userEntryB);
		
			System.out.println("The answer for side C is >>> " + calculateC);
		}
		public static void cSide()
		{
double userEntryA, userEntryB, calculateC;
			
			
			System.out.print("Please enter for sde A >>>");
			userEntryA = input.nextDouble();
			System.out.print("Please enter for side B >>>");
			userEntryB = input.nextDouble();
			
			
			calculateC = Math.sqrt(userEntryA * userEntryA + userEntryB * userEntryB);
		
			System.out.println("The answer for side C is >>> " + calculateC);
		}

	}