public class palindrome
{	int sum=0;
	public int reverse(int a)
	{
		int b,c=a;
		while(c!=0)
		{

			b=c%10;
			c=c/10;
			sum=(sum*10)+b;
		}
		return sum;
	}
	public void check(int a)
	{
		if(a==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}

