/*
 * Dette er main delen af programmet og det er denne
 */
package overwatchhelpertool;
import javax.swing.*;
/**
 *
 * @author phill
 */
public class OverwatchHelperTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame vindue = new JFrame( "Overwatch Helper Tool" ); 
        vindue.add( new Menu() );
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        vindue.pack();
        vindue.setVisible(true);
    }
    
}
