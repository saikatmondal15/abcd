public class armstrong
{       int sum=0;
        public int Strong(int a)
        {
                int b,c=a;
                while(c!=0)
                {

                        b=c%10;
                        c=c/10;
                        sum=sum+(b*b*b);
                }
                return sum;
        }
        public void check(int a)
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

