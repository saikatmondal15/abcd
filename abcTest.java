import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class abcTest {
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        abc instance = new abc();
        int expResult = 5;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
}
