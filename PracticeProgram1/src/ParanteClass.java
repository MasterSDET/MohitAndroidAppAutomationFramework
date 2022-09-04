
public class ParanteClass 
{

	public static void main(String[] args) 
	{
		

    ParanteClass d = new  ParanteClass();

	String name = d.getData();

	System.out.println(name);

	// calling child class object using inherits method
	
	Child_class d1 = new Child_class();

	d1.engine();

//	getData2();

	}



	public String getData()

	{

	System.out.println ("hello world");

	return "rahul shetty";

	}

	public static String getData2()

	{

	System.out.println ("hello world");

	return "rahul shetty";

	}
	}

