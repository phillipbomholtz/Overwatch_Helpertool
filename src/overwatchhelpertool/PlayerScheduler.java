/**
 * This class is for calculating the avilabilety of a player
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip Bomholtz
 */
public class PlayerScheduler {
    
    public PlayerScheduler(){

    }
    
    //method for taking individual timestreches and pumping them into a day to 
    //be used elsewere.
    public Day buildDay(TimeStrechs[] arr, int size,String name){
        Day newDay = new Day(name);
        for(int i = 0; i < size;i++){
            newDay.addStrech(arr[i]);
        }
        return newDay;
    }
    
    //method for adding days together to build a complete schedule
    public Schedule buildSchedule(Day[] arr,int size){
        Schedule newSchedule = new Schedule();
        for(int i = 0; i < size;i++){
            newSchedule.addDay(arr[i]);
        }
        return newSchedule;
    }
    
}
