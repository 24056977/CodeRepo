import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class ListPrimeNumbers
{
	
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat formator = new DecimalFormat("00");
		int number;
		System.out.println("\n\tList of Prime Number up to the entered number");
		while(true)
		{
			number = getValidInput(input);
			displayListPrime(formator, number);
		}
	}
	
	public static int getValidInput(Scanner input)
	{
		int tempNumber;
		while(true)
		{
			try
			{
				System.out.print("Enter a number(x > 1): ");
				tempNumber = input.nextInt();
				if(tempNumber < 2) throw new InputMismatchException();
				break;
			}catch (InputMismatchException e)
			{
				System.out.println("\nInvalid input");
				input.nextLine();  // Please tell me the use of this line again
				continue;
			}
		}
		return  tempNumber;
	}
	public static void displayListPrime(DecimalFormat formator ,int tempNumber)
	{
		
		int count = 0;
		System.out.println("\nPrime Number(s) up to " + tempNumber);
		for(int i = 2; i<= tempNumber; i++) //Prime numbers starts from 2
		{
			boolean prime = true; // Prime number has two factors
			for(int j = 2; j <= Math.sqrt(i); j++)
			{
				if(i % j == 0) 
				{
					prime = false;
					break;
				}
			}
			if(prime)
			{
				System.out.printf("%02d. %02d%n", ++count, i);
			}
			//factors=2; // reset for the next number
		}
	}
}