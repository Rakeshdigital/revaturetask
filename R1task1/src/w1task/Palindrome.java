package w1task;

public class Palindrome {

	public static void main(String[] args) {
		int ar[]= {123,1234321,23432,34543} ;
		for(int i=0;i<ar.length;i++)
		{
			int n=ar[i];
			//int n=ar[i];
			int p=0, s=0;
			while(n>0)
			{
				s=n%10;
				p=p*10+s;
			    n=n/10;
			}
			if(p==ar[i])
			{
				System.out.println("hey its polindrom number"+ar[i]);
				
			}
			else
				System.out.println("its not polindrom number yar"+ar[i]);
		}
	}

}
