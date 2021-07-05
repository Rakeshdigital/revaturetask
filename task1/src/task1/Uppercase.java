package task1;

public class Uppercase {
	
	public static void main(String[] args) {
		
		String s="rakesh reddy is there at revature";
		StringBuffer sb=new StringBuffer();
	
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)

			
			{
				sb.append(arr[i].substring(0,arr[i].length()-1)).append(Character.toUpperCase(arr[i].charAt(arr[i].length()-1))).append(" ");
				
			}
		
		System.out.println(sb.toString().trim());
		
	}
	

}
