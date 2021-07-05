package w1task;

import java.util.Arrays;

public class Duplicatestring {
public static void main(String[] args) {
	String s="hey are you there what you doing buddy";
	s=s.replace(" ","");
	StringBuilder sb=new StringBuilder();
	char arr[]=s.toCharArray();
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			sb.append(arr[i]);
		}
	}
	sb.append(arr[arr.length-1]);
	System.out.println(sb);
}
}
