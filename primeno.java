package mnjbb;
public class primeno
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int count=0;
		if(num==2) {
			System.out.println("prime");
		}else {
		for (int i=2;i<=num;i++)
		{
		if (num %i==0)
		{
			count++;
		}
		}
	
		 if (count==1)
		 {
		 
			 System.out.println(num +" is prime");
		 }
		 
		 else 
		 {
			 System.out.println(num +" is not prime");
		 
		 }

		}}}