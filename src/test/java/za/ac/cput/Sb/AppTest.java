package za.ac.cput.Sb;


import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;


import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
@Ignore public class AppTest
    extends TestCase
{
    private App app = new App();
    public float num1= (float) 6.8;
    public int num2=8;
    String  a = new String();
    String b= new String();


    @Test
    public void testFloat() throws Exception
    {
        Assert.assertEquals(num1, app.myFloat());
    }
    @Test
    public void testInteger()
    {
        assertEquals(num2, app.myInteger());
    }
    @Test
    public void testEquality()  throws Exception
    {

        Assert.assertSame(a,a);

    }
    @Test
    public void testIdentity()
    {
        String b="found";
        Assert.assertSame(b,b);
    }
    @Test
    public void testTruth()
    {
        Assert.assertTrue(app.myTruth());
    }
    @Test
    public void testFalse()
    {
        Assert.assertFalse(app.myfalse());
    }
    @Test
    public void testNullness()
    {
        Assert.assertNull(app.nullNess());
    }

    @Test
    public void testNotNull()
    {
        Assert.assertNotNull(app.notNull());
    }
    @Test(timeout=100)
    public void testException() throws TimeoutException
    {
        Assert.assertSame(b,b);

    }
    @Test
    public void testArray()
    {
        int[] testarry={1,2,3};
        int[] resultarry= app.myArray();
        assertArrayEquals(testarry, resultarry);
    }
    @Ignore
    @Test
    public void testDisable()throws Exception
    {
        assertEquals("Hello World!", app.sayhello());
    }
    @Ignore
    @Test
    public void testFail()
    {
        Assert.fail("failed");

    }




}
