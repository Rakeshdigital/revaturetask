package w1task;

public class primeindexpositionuppercase {
	public static void main(String[] args) {
        String s= "hey rakesh are you working in revature";
        s=s.replace(" ","");
        String arr[]=s.split("");
        for(int i=0;i<arr.length;i++) {
            int c=0;
            for(int j=1;j<=i;j++)
            {
            	if(i % j==0)
            	{
            		c++;
            	}
            }
            if(c==2)
        	{
        	System.out.println(i+"="+ arr[i].toUpperCase()+" ");
        	c=0;
        	}   	
            	
          }
        
        }
	}


