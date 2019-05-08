/*
 * base structure of a player
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip Bomholtz
 */
public class Player {
    
    private String username;
    private String password;
    private Schedule playerSchedule;           //the scedule of a single player
    
    public Player(String user, String pass){
        //set username and password
        this.username = user;
        this.password = pass;
    }
}
