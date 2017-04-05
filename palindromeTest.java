import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class palindromeTest
 {
    @Test
    public void testReverse()
    {
	System.out.println("Reverse");
	int a=121;
        palindrome instance = new palindrome();
        int expResult = 0,c=a,b;
	while(c!=0)
	{
		b=c%10;
		c=c/10;
		expResult=(expResult*10)+b;
	}
        int result = instance.reverse(a);
        assertEquals(expResult, result);
	System.out.println("Check");
	instance.check(a);
    }
}
