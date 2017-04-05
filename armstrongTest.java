import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class armstrongTest
 {
    @Test
    public void testStrong()
    {
        System.out.println("Armstrong");
        int a=121;
        armstrong instance = new armstrong();
        int expResult = 0,c=a,b;
        while(c!=0)
        {
                b=c%10;
                c=c/10;
                expResult=expResult+(b*b*b);
        }
        int result = instance.Strong(a);
        assertEquals(expResult, result);
        System.out.println("Check");
        instance.check(a);
    }
}

