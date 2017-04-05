public class armstrong
{       public int Strong(int a)
        {
                int b,c=a,sum=0;
                while(c!=0)
                {

                        b=c%10;
                        c=c/10;
                        sum=sum+(b*b*b);
                }
                return sum;
        }
        public int check(int a,int sum)
        {
                if(a==sum)
                {
                       return 1;
                }
                else
                {
                       return 0; 
                }
        }
	public static void main(int a)
	{
	    armstrong obj=new armstrong();		
	    int b=obj.Strong(a);
	    int check=obj.check(a,b);
	    if(check==1)
	    {
		System.out.println("Armstrong");
	    }
	    else
		{
		System.out.println("Not Armstrong");
		}
	}
}
