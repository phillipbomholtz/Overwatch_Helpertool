/*
 * the base structure of a day in a schedule
 */
package overwatchhelpertool;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Phillip Bomholtz
 */
public class Day {
    public String name;
    protected List<TimeStretch> timeStreches;  //an array of streches
    
    public Day(String name){
        this.name = name;
        this.timeStreches  = new ArrayList<>();
    }
    
    public void addStretch(TimeStretch stretch){
        timeStreches.add(stretch);
    }
    
    public int giveStretchAmount(){
        return timeStreches.size();
    }
    
    public int giveStretchAtIndexStart(int i){
        return timeStreches.get(i).giveStart();
    }
    
     public int giveStretchAtIndexEnd(int i){
        return timeStreches.get(i).giveEnd();
    }
}
