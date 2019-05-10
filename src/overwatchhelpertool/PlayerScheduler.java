/**
 * This class is for calculating the avilabilety of a player
 */
package overwatchhelpertool;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Phillip Bomholtz
 */
public class PlayerScheduler {
    
    private TimeStretch[][] week;  //an array of arrays of all timestreches in unorganized fashion
    private int weeklength;        //length of the week (should be 7 but you never know)
    
    public PlayerScheduler(TimeStretch[][] arr,int x){
        weeklength = x;
        this.week = new TimeStretch[x][];
        week = arr;                         //initialize with call array
    }
    
    
    
    public Schedule buildSchedule(){
        Day[] weekdays = new Day[weeklength];       //an array of the days of the week
        List <TimeStretch> tempArr = new ArrayList<>(); //a temp array to hold timestrech values

        for(int i = 0; i < weeklength; i++){                                     //loop through days
            for(int u = 0; u < week[i].length;u++){                              //loop through timestreches   
                tempArr.add(week[i][u]);                                         //load in timestrech
            }
            weekdays[i] = buildDay(tempArr,week[i].length,giveDayName(i));       //build a day of the timestrech just read
            tempArr.clear();
        }
        return finishSchedule(weekdays,weeklength);                              //return a build schedule
    }
    
    
    
    //method for taking individual timestreches and pumping them into a day to 
    //be used elsewere.
    private Day buildDay(List <TimeStretch> arr, int size,String name){
        Day newDay = new Day(name);
        for(int i = 0; i < size;i++){
            newDay.addStrech(arr.get(i));
        }
        return newDay;
    }
    
    
    
    //method for adding days together to build a complete schedule
    private Schedule finishSchedule(Day[] arr,int size){
        Schedule newSchedule = new Schedule();
        
        for(int i = 0; i < size;i++){
            newSchedule.addDay(arr[i]);
        }
        return newSchedule;
    }
    
    
    
    //gives a name to the days so that they may be properly remembered
    //if the number goes over 6 means that there are more than 7 days witch is a bad error
    private String giveDayName(int i){
        String weekday;
        switch(i){
            case 0:
                weekday = "Monday";
                break;
            case 1:
                weekday = "Tuesday";
                break;
            case 2:
                weekday = "Wednesday";
                break;
            case 3:
                weekday = "Thursday";
                break;
            case 4:
                weekday = "Friday";
                break;
            case 5:
                weekday = "Saturday";
                break;
            case 6:
                weekday = "Sunday";
                break;
            default:
                weekday = "hey programmer... you fucked up";
                break;
        }
        return weekday;
    }
}
