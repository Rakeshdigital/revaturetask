package w1task;

import java.util.Arrays;

public class Secondhighestnumoccur {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,1,2,3,4,5,1,1,2,2,3,5,4,1,1,4,2};
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		System.out.println(Arrays.toString(arr));
		System.out.println("second highest num in array is :"+temp[j-2]);
		
				
	}

}
