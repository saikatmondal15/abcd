public class perfect
{       
       public int per(int a)
        {
                int sum=0;
                for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
                return sum;
        }
        public void check(int sum,int a)
        {
                if(a==sum)
                {
                        System.out.println("Armtsrong");
                }
                else
                {
                        System.out.println("Armstrong");
                }
        }
}

