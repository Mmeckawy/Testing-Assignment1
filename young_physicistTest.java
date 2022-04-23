import junit.framework.TestCase;
import org.junit.Test;

public class young_physicistTest extends TestCase {
    @Test
    public void testisEquilibrium(){
        young_physicist y1 = new young_physicist();
        int[][] a1 = { {-1, -2, -3}, {1, 2, 3} };
        assertEquals("YES", y1.isEquilibrium(a1,2));
    }
    public void testisEquilibrium2(){
        young_physicist y1 = new young_physicist();
        int[][] a1 = { {-1, 7, 8}, {1, 20, -7} };
        assertEquals("NO", y1.isEquilibrium(a1,2));
    }
}