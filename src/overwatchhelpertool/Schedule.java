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
    protected List<Day> days;
    
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
    
    public int giveDayAmount(){
        return days.size();
    }
    
    //method for taking individual timestreches and pumping them into a day to 
    //be used elsewere.
    public Day buildDay(List <TimeStretch> arr, int size,String name){
        Day newDay = new Day(name);
        for(int i = 0; i < size;i++){
            newDay.addStretch(arr.get(i));
        }
        return newDay;
    }
}
