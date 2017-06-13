package co.edu.uniandes;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void AppTest() {
        String str = "ter";
        Assert.assertEquals(str,"ter");
        //super( testName );

    }

    @Test
    public void Test(){
        String str = "Hurey";
        Assert.assertEquals(str.length(),5);

    }




    /**
     * @return the suite of tests being tested
     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}
