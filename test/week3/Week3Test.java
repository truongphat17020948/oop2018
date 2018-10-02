package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {
    @Test
 public void testmax()
 {
     assertEquals(3,Week3.max(2,3));
     assertEquals(9,Week3.max(9,4));
     assertEquals(100,Week3.max(100,1));
     assertEquals(1000000,Week3.max(0,1000000));
     assertEquals(1000,Week3.max(1000,999));
 }
    // TODO: Viết 5 testcase cho phương thức max()
   @Test
    public void testminarray()
    {int a[]={3,2,1,4,2,3,5,4,5};
     int b[]={0};
     int c[]={1,3,4,5,64,6,342,65,345,4};
     int d[]={100000000,99};
     int e[]={1234567,12345678,123456789};
        assertEquals(1,Week3.minOfArray(a));
        assertEquals(0,Week3.minOfArray(b));
        assertEquals(1,Week3.minOfArray(c));
        assertEquals(99,Week3.minOfArray(d));
        assertEquals(1234567,Week3.minOfArray(e));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
@Test
    public void testBMI()
    {
        assertEquals("Thiếu cân",Week3.calculateBMI(54,1.8));
        assertEquals("Bình thường",Week3.calculateBMI(60,1.7));
        assertEquals("Thừa cân",Week3.calculateBMI(70,1.7));
        assertEquals("Béo phì",Week3.calculateBMI(70.55,1.6));
        assertEquals("Thiếu cân",Week3.calculateBMI(44,1.56));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}
