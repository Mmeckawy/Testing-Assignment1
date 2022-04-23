import junit.framework.TestCase;
import org.junit.Test;

public class watermelonTest extends TestCase {
    @Test
    public void testdivide_watermelon(){
        watermelon w1 = new watermelon();
        assertEquals("YES",w1.divide_watermelon(6) );
    }
    public void testdivide_watermelon2(){
        watermelon w1 = new watermelon();
        assertEquals("NO",w1.divide_watermelon(7));
    }
    public void testdivide_watermelon3(){
        watermelon w1 = new watermelon();
        assertEquals("NO",w1.divide_watermelon(104));
    }
}