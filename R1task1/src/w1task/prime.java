package w1task;

public class prime {

	public static void main(String[] args) {
		int ar[]= {2,3,4,5,6,7,8,9,10};
		for(int i=0;i<ar.length;i++)
		{
		  int count=0;
		  for(int j=1;j<=ar[i];j++)
		  {
			  if(ar[i]%j==0)
			  {
				  count++;
			  }
			  
		  }
		  if(count==2)
		  {
			  System.out.println(ar[i]+"-it is a prime number:");
			  count=0;
	      }
		  else
		  {
			  System.out.println(ar[i]+"-its not prime ");
		  }
		}
	}
}

