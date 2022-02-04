import static org.junit.Assert.*;  //import necessary classes for testing
import org.junit.*; 

public class SkillDemoTest {
    @Test
    public void subtraction(){
        assertEquals(6, SkillDemo.subtract(7, 1));
    }
}
