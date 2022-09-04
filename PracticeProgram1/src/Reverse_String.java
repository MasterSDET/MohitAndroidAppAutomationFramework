
public class Reverse_String {

	public static void main(String[] args)
	{
	//	reverse a String
		
		String Mo = "Mohit";
		String Sh = " ";
		
		for (int i = Mo.length() - 1; i >= 0; i--) {
            Sh = Sh + Mo.charAt(i);
        }
        System.out.println("Reverse of Mohit is: " + Sh);
        
        
        
              //or using string reverse
        
        
        String Moh = "Mohit";
        StringBuffer sb = new StringBuffer(Moh);
        System.out.println("Reverse of java2blog is:" + sb.reverse());

	}

}
