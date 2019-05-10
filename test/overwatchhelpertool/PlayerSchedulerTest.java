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
public class PlayerSchedulerTest {
    
    public PlayerSchedulerTest() {
    }

    /**
     * Test of buildSchedule method, of class PlayerScheduler.
     * manually assemble a schedule and see if method does the same
     */
    @Test
    public void testBuildSchedule() {
        System.out.println("buildSchedule");
        //make some stretches
        TimeStretch test1 = new TimeStretch(1,2);
        TimeStretch test2 = new TimeStretch(2,3);
        TimeStretch test3 = new TimeStretch(4,5);
        TimeStretch test4 = new TimeStretch(6,7);
        
        //make two days from stretches
        Day testDay1 = new Day("day1");
        Day testDay2 = new Day("day2");
        
        testDay1.addStrech(test1);
        testDay1.addStrech(test2);
        testDay2.addStrech(test3);
        testDay2.addStrech(test4);
        
        
        //make Schedule from days
        Schedule testSchedule = new Schedule();
        testSchedule.addDay(testDay1);
        testSchedule.addDay(testDay2);
        
        //make array to feed scheduler
        TimeStretch[] testArr1d1 = {test1,test2};
        TimeStretch[] testArr1d2 = {test3,test4};
        TimeStretch[][] testArr = {testArr1d1,testArr1d2};
        
        PlayerScheduler instance = new PlayerScheduler(testArr,2);
        Schedule expResult = testSchedule;
        Schedule result = instance.buildSchedule();
        assertTrue(expResult.days.equals(result.days));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
