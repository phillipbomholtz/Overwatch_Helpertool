/*
 * base structure of a schedule
 */
package overwatchhelpertool;
import java.util.ArrayList;
/**
 *
 * @author Phillip Bomholtz
 */
public class Schedule {
    private ArrayList days = new ArrayList();
    
    public Schedule(){
        
    }
    
    //add a day to the schedule
    public void addDay(Day day){
        days.add(day);
    }
}
