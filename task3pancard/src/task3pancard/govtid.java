package task3pancard;

public class govtid {
	public static void main(String[] args)
	{
		String l="ts08ec8055";
		String b="ts26ab0975";
		String a="987609875647";
		if(l!=null && l.matches("[a-z]{2}[0-9]{2}[a-z]{2}[0-9]{4}"))
		{
			System.out.println("valid licence number");
			
		}
		else
		{
			System.out.println("invalid licence number");
		}
		
		if(b!=null && b.matches("[a-z]{2}[0-9]{2}[a-z]{2}[0-9]{4}"))
		{
			System.out.println("valid bike number");	
		}
		else
		{
			System.out.println("invalid bike number");
		}
		if(a!=null && a.matches("[0-9]{12}"))
		{
			System.out.println("valid adhar number");
		}
		else
		{
			System.out.println("invalid adhar number");
		}
	}

}
