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
    private List<Day> days;
    
    public Schedule(){
        this.days  = new ArrayList<>();
    }
    
    //add a day to the schedule
    public void addDay(Day day){
        days.add(day);
    }
    
    //return a given day
    public Day giveDayAtIndex(int i){
        return days.get(i);
    }
}
