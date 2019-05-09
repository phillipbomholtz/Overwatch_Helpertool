/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;


/**
 *
 * @author Phillip
 */
public class TimeStretchTest {
    
    public TimeStretchTest() {
    }
    

    /**
     * Test of giveStart method, of class TimeStretch.
     */
    @Test
    public void testGiveStart() {
        System.out.println("giveStart");
        TimeStretch instance = new TimeStretch(0,20000);
        int expResult = 0;
        int result = instance.giveStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of giveEnd method, of class TimeStretch.
     */
    @Test
    public void testGiveEnd() {
        System.out.println("giveEnd");
        TimeStretch instance = new TimeStretch(0,20000);
        int expResult = 20000;
        int result = instance.giveEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
