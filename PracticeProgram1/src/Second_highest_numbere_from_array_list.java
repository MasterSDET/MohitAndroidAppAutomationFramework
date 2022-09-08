import java.util.Arrays;

public class Second_highest_numbere_from_array_list 
{

	public static void main(String[] args)
	{
		int largest = 0;
		int secondhjgest =0;
		
		int arr[]= {34,67,97,22,66};
		
		
	
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>largest)	
			{
				secondhjgest = largest;
				largest =arr[i];
			}
			else if(arr[i]> secondhjgest )
			{
				secondhjgest= arr[i];
			}
		}
		
		
		
			
		System.out.println(Arrays.toString(arr));
		System.out.println("2nd highest number" +secondhjgest);

	}

}
