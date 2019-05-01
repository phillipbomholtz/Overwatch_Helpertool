/**
 * This class is for calculating the avilabilety of team
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip Bomholtz
 */
public class Scheduler {
    
    //the definition of a strech of time
    private class Strech{
        private int startSecond;
        private int endSecond;
    }
    
    //the definition of a player with what this class needs to know.
    private class Player{
        private Strech[] timeStretches;
        private String name;
        
        public Player(String name, int streches){
            this.timeStretches = new Strech[streches];   //make sure array has apporpirate amount of space
            this.name = name;                            //update this players name
        }
    }
    
    private Player playerOne;
    
    public Scheduler(String name, int streches, Strech[] arr){
        this.playerOne = new Player(name,streches);            //make the first player
        playerOne.timeStretches = arr;                         //load in the timestreches
    }
    
    
}
