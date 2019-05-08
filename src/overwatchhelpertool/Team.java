/*
 *the base structure of a team
 */
package overwatchhelpertool;
import java.util.ArrayList;

/**
 *
 * @author Phillip Bomholtz
 */
public class Team {
   
    private ArrayList teammates = new ArrayList();       //list of teammates
    private ArrayList activeTeammates = new ArrayList(); //list op players active on the team.
    private Player ADMIN;                                //the player that is team admin
    private Schedule teamSchedule;                       //the teams schedule
    
}
