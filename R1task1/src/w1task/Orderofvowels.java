package w1task;
//import java.util.Arrays;

public class Orderofvowels {
	public static void main(String[] args) {
		String s="rakesiou";
		s=s.replaceAll(" ","");
		char c=(char)64;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				if(s.charAt(i)<c) {
				System.out.println("vowels are not in order");
				System.exit(0);
			}
			else 
			{
				c=s.charAt(i);
			}
			}
			
		}
	System.out.println("vowels are in order");
}
}

