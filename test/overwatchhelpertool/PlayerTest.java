/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import java.util.ArrayList;
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
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of giveName method, of class Player.
     */
    @Test
    public void testGiveName() {
        System.out.println("giveName");
        Player instance = new Player("punky","");
        String expResult = "punky";
        String result = instance.giveName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buildSchedule method, of class Player.
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
        Day testDay1 = new Day("Monday");
        Day testDay2 = new Day("Tuesday");
        
        testDay1.addStretch(test1);
        testDay1.addStretch(test2);
        testDay2.addStretch(test3);
        testDay2.addStretch(test4);
        
        
        //make Schedule from days
        Schedule testSchedule = new Schedule();
        testSchedule.addDay(testDay1);
        testSchedule.addDay(testDay2);
        
        //make arraylist to feed scheduler
        ArrayList<TimeStretch> testArr1d1 = new ArrayList<>();
        ArrayList<TimeStretch> testArr1d2 = new ArrayList<>();
        ArrayList<ArrayList<TimeStretch>> week = new ArrayList<ArrayList<TimeStretch>>();
        testArr1d1.add(test1); testArr1d1.add(test2);
        testArr1d2.add(test3); testArr1d2.add(test4);
        week.add(testArr1d1);week.add(testArr1d2);
        
        ArrayList<ArrayList<TimeStretch>> weekIn = week;
        Player instance = new Player("punky","");
        instance.buildSchedule(weekIn);
        
        Schedule expResult = testSchedule;
        Schedule result = instance.giveSchedule();
        
        assertTrue(expResult.days.get(0).name.equals(result.days.get(0).name));
        assertTrue(expResult.days.get(1).name.equals(result.days.get(1).name));
        
        //check if the timestretches are the same
        assertTrue(expResult.days.get(0).timeStreches.equals(result.days.get(0).timeStreches));
        assertTrue(expResult.days.get(1).timeStreches.equals(result.days.get(1).timeStreches));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
