public class prime
{
	public int pri(int a)
	{
		int flag=0;
		if(a==1 || a==2)
		{
			return 0;
 		}
		else
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				flag=1;
				break;
			}
			return flag;
		}
	}
	public void check(int flag)
	{
		if(flag==0)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not a prime no");
		}
	}
}
