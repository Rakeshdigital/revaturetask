package w1task;

public class Evenodd {
public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,12,12,23,3,4,56,4567};
	int ec=0,es=0,oc=0,os=0;
	for(int i=0;i<arr.length;i++)
	{
		int n=arr[i];
		
		if(n%2==0)
		{
			ec++;
			es+=n;
		  // a=s/c;	
		}
		else
		{
			oc++;
			os+=n;
		}
		
	}
	System.out.println("avarage of even num are "+ es / ec);
	System.out.println("avarage of even num are "+ os / oc);
}
}
