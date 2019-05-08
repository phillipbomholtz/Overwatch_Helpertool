/**
 * This class is for calculating the avilabilety of a player
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip Bomholtz
 */
public class PlayerScheduler {
    

    private Player playerOne;
    
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
    
    
}
