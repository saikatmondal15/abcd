import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class oddTest
 {
    @Test
    public void odTest()
    {
        System.out.println("Fuction od");
        int a=7;
	int expResult=0;
        odd instance = new odd();
       	if(a%2==0)
	{	
		expResult=0;
	}
	else
	{
		expResult=1;
	}
	int result=instance.od(a);
	assertEquals(expResult,result);
	}
}
		
