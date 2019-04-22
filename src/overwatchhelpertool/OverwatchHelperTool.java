/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        JFrame vindue = new JFrame( "Choose a map" ); 
        vindue.add( new TeamMenu() );
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        vindue.pack();
        vindue.setVisible(true);
    }
    
}
