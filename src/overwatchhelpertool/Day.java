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
    private List<TimeStrechs> timeStreches;  //an array of streches
    
    public Day(){
        this.name = "Monday";
        this.timeStreches  = new ArrayList<>();
    }
    
    public Day(String name){
        this.name = name;
        this.timeStreches  = new ArrayList<>();
    }
    
    public void addStrech(TimeStrechs strech){
        timeStreches.add(strech);
    }
}
