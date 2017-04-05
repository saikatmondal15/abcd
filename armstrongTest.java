import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class armstrongTest
 {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStream()
	{
		System.setOut(new PrintStream(outContent));
	}
	@After
	public void cleanUpStream(){
 System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
  }

    @Test
    public void testStrong()
    {
        System.out.println("Should Write the Armstrong functio");
        int a=121;
        armstrong instance = new armstrong();
        int expResult =10;
        int result = instance.Strong(a);
        assertEquals(expResult, result);
    }
    @Test
	public void checktest()
	{
		System.out.println("Write the function Check");
		armstrong obj = new armstrong();
		int result=obj.check(10,10);
		assertEquals(1,result);
	}
	@Test
	public void checkTestNot()
	{
	   System.out.println("Write the function check for not rmstrong");
	   armstrong obj=new armstrong();
	   int result=obj.check(10,1);
	   assertEquals(0,0);
        }
	
	@Test
	public void mainTestArmstrong()
	{
		armstrong.main(371);
		assertEquals("Armstrong\n",outContent.toString());
	}
	@Test
	public void mainTestNotArmstrong()
	{
		armstrong.main(21);
		assertEquals("Not Armstrong\n",outContent.toString());
	}
}
		
		

