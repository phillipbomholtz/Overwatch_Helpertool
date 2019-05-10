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
    
    public void addStrech(TimeStretch strech){
        timeStreches.add(strech);
    }
}
