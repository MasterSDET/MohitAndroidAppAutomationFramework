import java.io.*;


public class PalandromeCode 
{

	public static boolean isPalandrome(String s)
	
	{
		
		int left =0 ;
		int right = s.length()-1;
		
		while (left < right)
		{
			if(s.charAt(left) != s.charAt(right))
				
			{
				return false;
			
			}
			left++;
			right--;
		}
		return true;
		
	}

	public static void closestpalindrome(int num)
	{
		int RPnum =num-1;
		while (isPalandrome(Integer.toString(RPnum)) == false)
		{
			RPnum--;
		}
		
		int SPNum = num +1;
		
		while (isPalandrome(Integer.toString(SPNum)) == false)
		{
			SPNum--;
		}
		
		if (Math.abs(num - SPNum) < Math.abs(num - RPnum))
			
		{
			System.out.println(SPNum);
		}
		else
			System.out.println(RPnum);
		
		
	}
	
	public static void main(String[] args)
	{
		
		int n =123;
		closestpalindrome(n);
	}
}
