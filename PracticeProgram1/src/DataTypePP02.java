
public class DataTypePP02
{

	public static void main(String[] args) 
	{
		// Arithmetic operator 
		int a= 10;
		int b= 5;
		double c= 1.50;
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(c%b);
		System.out.println(c%b/2);
		
		
		// Relational Operator
		int x=10;
		int y = 20;
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);

		// Logical Operator
		boolean M=true;
		boolean S = false;
		System.out.println(M&&S);
		System.out.println(M||S);
		System.out.println(!S);
		
		// how to define array 
		
		int[] Moh = new int[5];
		Moh[0] = 10;
		Moh[1] = 20;
		Moh[2] = 200;
		Moh[2] = 2000;
		Moh[4] = 20000;
	   System.out.println(Moh[0]);
		
	   // or array 
	   
	   int[] Shahana= {	1 ,2,3,4,5};
	   System.out.println(Shahana[0]);
	   
	   // for Loop 
	   
	   {
	   for( int i =0 ; i < Moh.length; i++)
	   {
	   
	  System.out.print(i);
	  if (i ==01234)
	  {
		  System.out.print(Shahana[0]);
	  
	  }
	
	  // String as a array
	  String[] name = {"Mohit", "Gaur"};
	  {
		  for(int j=0; j<name.length; j++)
		  {
			  System.out.println(name[j]+ "HI Case Tested Succefully");
			  
	  }
		  for( String Mo: name)      // name output we store in Mo & we call Mo for Output.
		  {
			  System.out.println(Mo);
		  }
		  
		  // if else conditions
		  
		  int[] sha = {1,3, 5, 2,4,6,8,10};
		  
		  {
			  for(int z=0; z<sha.length; z++)
			  {
			  if(sha[z] % 2 ==0)   // in java if we have to compare 2 int value then need to put == 
			  {
				System.out.println(sha[z]);
			  }
		  }
	  
	   }	
	   }
	   }
	}
}

}


