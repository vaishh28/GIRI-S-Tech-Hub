import java.util.*;
public class ArmstrongNo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an no: ");
		int no = sc.nextInt();
		
		int temp,sum=0,rem,index =0;
		temp = no;
		
		while(temp!=0)
		{
			temp/=10;
			index++;
		}	
         
         temp = no;		 
		
		while(temp!=0)
		{
			rem= temp%10;
			int p=1;
			int i=0;
			while(i<index)
			{
			   p = p * rem;
			  i++;
			}
			
			sum= sum+p;
			temp/=10;

		}
		
		if(no==sum)
		{
			System.out.println("Enter no is a armstrong no.");
		}
		else
		{
			System.out.println("Enter no is not an armstrong no.");
		}	
	}
}	
