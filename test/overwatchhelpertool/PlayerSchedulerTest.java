/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import overwatchhelpertool.TimeStrechs;
/**
 *
 * @author Phillip Bomholtz
 */
public class PlayerSchedulerTest {
    
    public PlayerSchedulerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of buildSchedule method, of class PlayerScheduler.
     */
    @Test
    public void testBuildSchedule() {
        System.out.println("buildSchedule");
        TimeStrechs[][] test = {{new TimeStrechs(10,20),new TimeStrechs(100,200)},  //monday
                                {new TimeStrechs(10,20),new TimeStrechs(100,200)},  //tuesday
                                {new TimeStrechs(10,20),new TimeStrechs(100,200)},  //wednesday
                                {new TimeStrechs(10,20),new TimeStrechs(100,200)},  //thursday
                                {new TimeStrechs(10,20),new TimeStrechs(100,200)},  //friday
                                {new TimeStrechs(10,20),new TimeStrechs(100,200)},  //saturday
                                {new TimeStrechs(10,20),new TimeStrechs(100,200)}}; //sunday
        
        Day monday = new Day ("Monday");
        monday.addStrech(new TimeStrechs(10,20));
        monday.addStrech(new TimeStrechs(100,200));
        
        Day tuesday = new Day ("Tuesday");
        tuesday.addStrech(new TimeStrechs(10,20));
        tuesday.addStrech(new TimeStrechs(100,200));
        
        Day wednesday = new Day ("Wednesday");
        wednesday.addStrech(new TimeStrechs(10,20));
        wednesday.addStrech(new TimeStrechs(100,200));
        
        Day thursday = new Day ("Thursday");
        thursday.addStrech(new TimeStrechs(10,20));
        thursday.addStrech(new TimeStrechs(100,200));
        
        Day friday = new Day ("Friday");
        friday.addStrech(new TimeStrechs(10,20));
        friday.addStrech(new TimeStrechs(100,200));
        
        Day saturday = new Day ("Saturday");
        saturday.addStrech(new TimeStrechs(10,20));
        saturday.addStrech(new TimeStrechs(100,200));
        
        Day sunday = new Day ("Sunday");
        sunday.addStrech(new TimeStrechs(10,20));
        sunday.addStrech(new TimeStrechs(100,200));
        
        Schedule testSchedule = new Schedule();
        testSchedule.addDay(monday);
        testSchedule.addDay(tuesday);
        testSchedule.addDay(wednesday);
        testSchedule.addDay(thursday);
        testSchedule.addDay(friday);
        testSchedule.addDay(saturday);
        testSchedule.addDay(sunday);
        
        PlayerScheduler instance = new PlayerScheduler(test,7);
        Schedule expResult = null;
        Schedule result = instance.buildSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
