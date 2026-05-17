import javax.swing.JOptionPane;
public class ModifiedPalindrome
{
    public static void main(String [] args)
    {
        String input;
		int number, finalNumber= 0, option;
		
		
        if(args.length > 0)
		{
			try
			{
				finalNumber = getNumber(args[0]);
				getFeedback(finalNumber);	
			}
			catch(NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null, "Invalid input");
			}

		}
		else
		{
			while(true)
			{
				input = JOptionPane.showInputDialog(null, "Enter a number");
				
				if(input== null) break;
				
				if(input.isEmpty()) continue;
				try
				{
					getNumber(input);
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Invalid input");
					continue;
				}
				getFeedback(getNumber(input));
				
				option = JOptionPane.showConfirmDialog(null, "Do you want to check another number", "Select option", JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.NO_OPTION)
					break;
			}
		}
    }
	public static int getNumber(String input)
    {
		int number = Integer.parseInt(input);
		number = Math.abs(number);
        return number;
    }
	public static boolean isPalindromic(int number)
	{
		int reversedNumb = 0, tempNumb= number;
		final int GET_LAST_DIGIT = 10;
		if (number <10) return true;
		while(tempNumb > 0)
		{
			reversedNumb = (reversedNumb * GET_LAST_DIGIT)+ (tempNumb % GET_LAST_DIGIT);
			tempNumb /= GET_LAST_DIGIT;
		}
		return number == reversedNumb;
	}
	public static void getFeedback(int number)
	{
		if(isPalindromic(number))
			JOptionPane.showMessageDialog(null, number + " is Palindrome"); 
		else
			JOptionPane.showMessageDialog(null, number + " is not Palindrome"); 
	}

}
