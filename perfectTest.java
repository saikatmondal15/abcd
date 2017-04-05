import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class perfectTest
 {
    @Test
    public void testper()
    {
        System.out.println("Armstrong");
        int a=6;
        perfect instance = new perfect();
        int expResult = 0;
        for(int i=1;i<a;i++)
	{
		if(a%i==0)
			expResult=expResult + i;
	}

        int result = instance.per(a);
        assertEquals(expResult, result);
        System.out.println("Check");
        instance.check(result,a);
    }
}


