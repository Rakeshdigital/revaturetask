package w1task;

import java.util.Arrays;

public class Highestnumoccuring {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,4,2,3,1,1,2,1,3,1,2,5,3,3};
		Arrays.sort(arr);
		int c=0,n,r=0;
		System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++)
        {
        	n=1;
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			n++;
        		}
        	}
        	if(n>c)
        	{
        		r=arr[i];
        		c=n;
        	}
        }
        System.out.println(r +":"+c);
	}
}
