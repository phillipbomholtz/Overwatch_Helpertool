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
    private int amountOfDays = 0;
    
    public Schedule(){
        this.days  = new ArrayList<>();
    }
    
    //add a day to the schedule
    public void addDay(Day day){
        days.add(day);
        amountOfDays++;
    }
    
    //return a given day
    public Day giveDayAtIndex(int i){
        return days.get(i);
    }
    
    public int giveDayAmount(){
        return amountOfDays;
    }
}
