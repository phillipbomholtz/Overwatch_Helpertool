
import javax.swing.JFrame;
import overwatchhelpertool.CompBuilderMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phillip
 */
public class Window_tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame vindue = new JFrame( "Choose a map" ); 
        vindue.add( new CompBuilderMenu() );
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        vindue.pack();
        vindue.setVisible(true);
    }
    
}
