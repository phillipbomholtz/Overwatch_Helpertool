/*
 * the base strucure of a time strech in schedule
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip
 */
public class TimeStrechs {
    
        //the definition of a strech of time
        private int startSecond;
        private int endSecond;
        
        public TimeStrechs(int start, int end){
            this.startSecond = start;
            this.endSecond = end;
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
