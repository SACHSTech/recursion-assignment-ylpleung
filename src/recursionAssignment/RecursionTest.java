package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import recursionAssignment.Recursion;
import java.io.*;
public class RecursionTest{
    
    //Before
    /**
     * An initial test
     */
    @Test
    //success
    public void Test1(){
        assertEquals(1, Recursion.count7(89735));
    }

    @Test
    //fail
    public void Test2(){
      assertEquals(0, Recursion.count7(3247235));
    }
    
    @Test
    public void Test3(){
      assertEquals(-1, Recursion.count7(42874));
    }

    // add more tests
    
    //After
       
}
