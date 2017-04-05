import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class primeTest
 {
    @Test
    public void pri()
    {
        System.out.println("pri");
        int a=7;
        prime instance = new prime();
        int expResult = 0;
        if(a==1 || a==2)
	{
		expResult=0;
	}
	else
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				expResult=1;
				break;
			}
		}
	}
        int result = instance.pri(a);
        assertEquals(expResult, result);
        System.out.println("Check");
        instance.check(result);
    }
}

