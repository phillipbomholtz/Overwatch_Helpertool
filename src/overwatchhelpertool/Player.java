/*
 * base structure of a player
 */
package overwatchhelpertool;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phillip Bomholtz
 */
public class Player {
    
    private String username;
    private String password;
    private Schedule playerSchedule;           //the scedule of a single player
    private ArrayList<ArrayList<TimeStretch>> week = new ArrayList<ArrayList<TimeStretch>>();  //a list of timestretches for a whole week
    
    public Player(String user, String pass){
        //set username and password
        this.username = user;
        this.password = pass;
        this.playerSchedule = new Schedule();
    }
    
    public String giveName(){
        return username;
    }
    
    public Schedule giveSchedule(){
        return playerSchedule;
    }
    
    public void buildSchedule(ArrayList<ArrayList<TimeStretch>> weekIn){
        this.week = weekIn;
        Day[] weekdays = new Day[week.size()];       //an array of the days of the week
        List <TimeStretch> tempArr = new ArrayList<>(); //a temp array to hold timestrech values

        for(int i = 0; i < week.size(); i++){                                     //loop through days
            for(int u = 0; u < week.get(i).size();u++){                              //loop through timestreches   
                tempArr.add(week.get(i).get(u));                                         //load in timestrech
            }
            weekdays[i] = playerSchedule.buildDay(tempArr,week.get(i).size(),giveDayName(i));       //build a day of the timestrech just read
            tempArr.clear();
        }
        this.playerSchedule = finishSchedule(weekdays,week.size());                              //build schedule
    }
    
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
                weekday = "hey programmer... there is a mistake";
                break;
        }
        return weekday;
    }
    
    public void saveUser(){
        try(FileWriter user = new FileWriter(new File("user_info\\"+username+"_schedule.txt").getAbsolutePath(),false)){
            
            for(int i = 0;i<playerSchedule.giveDayAmount();i++){                                 //loop through days
            user.write(playerSchedule.giveDayAtIndex(i).name+"\n");                            //write weekday
            for(int u = 0; u < playerSchedule.giveDayAtIndex(i).giveStretchAmount(); u++ ){      //loop through timestretches
                user.write(playerSchedule.giveDayAtIndex(i).giveStretchAtIndexStart(u));
                user.write(",");
                user.write(playerSchedule.giveDayAtIndex(i).giveStretchAtIndexEnd(u));
            }
            }
            user.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
