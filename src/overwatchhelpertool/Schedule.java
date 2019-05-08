/*
 * base structure of a schedule
 */
package overwatchhelpertool;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Phillip Bomholtz
 */
public class Schedule {
    private List<Day> days = new ArrayList<>();
    
    public Schedule(){
        
    }
    
    //add a day to the schedule
    public void addDay(Day day){
        days.add(day);
    }
    
    public Day giveDayAtIndex(int i){
        return days.get(i);
    }
}
