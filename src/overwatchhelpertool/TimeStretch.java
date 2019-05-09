/*
 * the base strucure of a time strech in schedule
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip Bomholtz
 */
public class TimeStretch {
    
        //the definition of a strech of time
        private int startSecond;
        private int endSecond;
        
        public TimeStretch(int start, int end){
            startSecond = start;
            endSecond = end;
        }
        
        //gives the start second if needed
        public int giveStart(){
            return startSecond;
        }
        //gives the end second if needed 
        public int giveEnd(){
            return endSecond;
        }
    
    
}
