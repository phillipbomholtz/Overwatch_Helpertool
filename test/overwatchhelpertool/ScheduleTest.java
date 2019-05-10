/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phillip
 */
public class ScheduleTest {

    /**
     * Test of giveDayAtIndex method, of class Schedule. 
     */
    @Test
    public void testGiveDayAtIndex() {
        System.out.println("giveDayAtIndex");
        int i = 1;
        Schedule instance = new Schedule();
        instance.addDay(new Day("monday"));
        instance.addDay(new Day("tuesday"));
        instance.addDay(new Day("wednesday"));
        Day expResult = new Day("tuesday");
        
        Day result = instance.giveDayAtIndex(i);
        assertEquals(expResult.name, result.name);
        assertEquals(expResult.timeStreches,result.timeStreches); //this is the list part
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of giveDayAmount method, of class Schedule.
     */
    @Test
    public void testGiveDayAmount() {
        System.out.println("giveDayAmount");
        Schedule instance = new Schedule();
        int expResult = 0;
        int result = instance.giveDayAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
