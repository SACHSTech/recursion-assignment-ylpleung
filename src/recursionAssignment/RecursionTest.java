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
      assertEquals(0, Recursion.count7(324235));
    }
    
    @Test
    public void Test3(){
      assertEquals(3, Recursion.count7(47774));
    }

    @Test
    public void Test4(){
      assertEquals("3.143.14", Recursion.changePi("pipi"));
    }

    @Test
    public void Test5(){
      assertEquals("abcde" , Recursion.changePi("abcde"));
    }

    @Test
    public void Test6(){
      assertEquals("3.14neapple", Recursion.changePi("pineapple"));
    }

    @Test
    public void Test7(){
      assertEquals("piza", Recursion.stringClean("pizza"));
    }

    @Test
     public void Test8(){
      assertEquals("gmd", Recursion.stringClean("ggmmdd"));
    }

    @Test
    public void Test9(){
      assertEquals("jbkcoh", Recursion.stringClean("jbkcoh"));
    }

    //After
       
}
