/*
 *the base structure of a team
 */
package overwatchhelpertool;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Phillip Bomholtz
 */
public class Team {
   
    private String name; 
    private ArrayList<Player> teamMates = new ArrayList<Player>();  //list of teammates
    private Schedule teamSchedule;                                  //the teams schedule
    
    public Team(String s){
        this.name = s;      //name team
        loadMembers();      //load members of this team
    }
    
    //method for loading in teammembers
    private void loadMembers(){
        try{
        //readers for file   
        FileReader userReader = new FileReader(new File(name+"_team\\Team_users.txt").getAbsolutePath());
        BufferedReader userFileReader = new BufferedReader(userReader); 
        
        String inputLine = userFileReader.readLine();                    //read an input line
        
        while(inputLine != null){
            teamMates.add(new Player(inputLine));  //add a new player
            inputLine = userFileReader.readLine(); //read new line
        }
        
        userFileReader.close(); //close file
        
        }catch(IOException e){
            e.printStackTrace();
        }
        loadMemberSchedule(); //load member schedule
    }
    
    //method for loading in team members schedules
    private void loadMemberSchedule(){
        for(int i = 0;i < teamMates.size();i++){
            
            boolean split = false;           //for when a day is read and spot in tempWeekList need to be mooved forward
            
            ArrayList<TimeStretch> tempStretchList = new ArrayList<TimeStretch>();                        //list for timestretches
            ArrayList<ArrayList<TimeStretch>> tempWeekList = new ArrayList<ArrayList<TimeStretch>>();     //list of lists of timestretches
            
            Player tempPlayer = teamMates.get(i);                                                         //load in player
            String username = tempPlayer.username;                                                        //remember username
            
        try{
        //readers for schedule File
        FileReader scheduleReader = new FileReader(new File("user_info\\"+username+"_schedule.txt").getAbsolutePath());
        BufferedReader scheduleFileReader = new BufferedReader(scheduleReader); 
        
        //use filter to get rid of day strings
        String input = scheduleFileReader.readLine();
        while(input != null){
        switch (input){
            case "Monday":
                split = true;
                break;
            case "Tuesday":
                split = true;
                break;
            case "Wednesday":
                split = true;
                break;
            case "Thursday":
                split = true;
                break;
            case "Friday":
                split = true;
                break;
            case "Saturday":
                split = true;
                break;
            case "Sunday":
                split = true;
                break;
            default:
                
                StringTokenizer st = new StringTokenizer(input,"(,)");          //for file context
                int start = Integer.parseInt(st.nextToken());                   //remember start
                int end = Integer.parseInt(st.nextToken());                     //remember end
                tempStretchList.add(new TimeStretch(start,end));                //add stretch
                break;
          }
        
        //when a new day comes up and previus had data
        if(split && !tempStretchList.isEmpty()){
             ArrayList<TimeStretch> transferArray = tempStretchList;
             tempWeekList.add(transferArray);
            tempStretchList.clear();
        }
        input = scheduleFileReader.readLine();  //read new liner
        }
        
        }catch(IOException e){
            e.printStackTrace();
        }
        tempPlayer.buildSchedule(tempWeekList);                                 //make schedule for player
        teamMates.set(i, tempPlayer);                                           //replace player without schedule with the one that has
        
       
      

    }

    }
    /* is not done yet
    private Schedule buildTeamSchedule(){
        boolean fin = false;
        while(!fin){
            
        }*/
}
