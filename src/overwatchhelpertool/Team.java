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
   // private Admin ADMIN;                                    //the player that is team admin
    private Schedule teamSchedule;                          //the teams schedule
    
    public Team(String s){
        this.name = s;
        loadMembers();
    }
    
    private void loadMembers(){
        try{
            
        FileReader userReader = new FileReader(new File(name+"_team\\Team_users.txt").getAbsolutePath());
        BufferedReader userFileReader = new BufferedReader(userReader);  
        String inputLine = userFileReader.readLine();
        
        while(inputLine != null){
            
            teamMates.add(new Player(inputLine));
            inputLine = userFileReader.readLine();
        }
        
        userFileReader.close();
        
        }catch(IOException e){
            e.printStackTrace();
        }
        loadMemberSchedule();
    }
    
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
        System.out.println(username);
        while(input != null){
            
        //System.out.println(input);
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
                //System.out.println(tempStretchList.get((tempStretchList.size()-1)).giveStart());
                //System.out.println(tempStretchList.get((tempStretchList.size()-1)).giveEnd()); 
                break;
          }
        
        if(split && !tempStretchList.isEmpty()){
            tempWeekList.add(tempStretchList);
             ArrayList<TimeStretch> transferArray = tempStretchList;
            System.out.println(tempWeekList);
            tempStretchList.clear();
            System.out.println(tempWeekList);
        }
        input = scheduleFileReader.readLine();
        }
        
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(tempWeekList);
        tempPlayer.buildSchedule(tempWeekList);                                 //make schedule for player
       // System.out.println(tempPlayer.giveSchedule().giveDayAtIndex(0).giveStretchAtIndexStart(0));
       // System.out.println(tempPlayer.giveSchedule().giveDayAtIndex(0).giveStretchAtIndexEnd(0));
        teamMates.set(i, tempPlayer);                                           //replace player without schedule with the one that has
        
        for(int f = 0; f < teamMates.get(i).giveSchedule().days.size();f++){
        //System.out.println("hello");
        Schedule temp =tempPlayer.giveSchedule();
        Day temp2 = temp.giveDayAtIndex(f);
        //System.out.println(temp2.giveStretchAmount());
        for(int h = 0; h<temp2.giveStretchAmount();h++){
        System.out.println(tempPlayer.username+" "+temp2.name+" "+temp2.giveStretchAtIndexStart(h)+" "+temp2.giveStretchAtIndexEnd(h));
        }
      }

    }

    }
        /*
    private Schedule buildTeamSchedule(){
        boolean fin = false;
        while(!fin){
            
        }*/
}
