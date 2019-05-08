/*
 * the base structure of a day in a schedule
 */
package overwatchhelpertool;
import java.util.ArrayList;
/**
 *
 * @author Phillip Bomholtz
 */
public class Day {
    public String name;
    private ArrayList timeStreches = new ArrayList();  //an array of streches
    
    public Day(){
        this.name = "Monday";  
    }
    
    public Day(String name){
        this.name = name;
    }
    
    public void addStrech(TimeStrechs strech){
        timeStreches.add(strech);
    }
}
