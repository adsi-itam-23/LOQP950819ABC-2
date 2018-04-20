package mx.com.adsi.itam.examen;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Solucion.
 */
public class SolucionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolucionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    @Test
    public void testSolucion() {
        Solution tester = new Solution(); // MyClass is tested

        // assert statements
        assertTrue(tester.probblema("abab"));
        assertTrue(tester.probblema("bbb"));
        assertFalse(tester.probblema("acbab"));   
     }
}
