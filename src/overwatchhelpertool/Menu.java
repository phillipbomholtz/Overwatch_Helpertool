/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;
import java.awt.event.*;
import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author Phillip
 */
public class Menu extends javax.swing.JPanel {
        private Player player;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        createActionListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        playerLogin1 = new overwatchhelpertool.PlayerLogin();
        playerMenu1 = new overwatchhelpertool.PlayerMenu();

        setPreferredSize(new java.awt.Dimension(1000, 500));

        jTabbedPane1.addTab("tab2", playerLogin1);
        jTabbedPane1.addTab("tab1", playerMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createActionListeners(){
        //create a action listener for when botten is clicked
        playerLogin1.loginBot.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            playerLogin1.loginCheck();                                        //check if login was correct
            if(playerLogin1.loginStatus){
            jTabbedPane1.setSelectedIndex(1);                                 //change to player menu
            player = playerLogin1.givePlayer();
            JOptionPane.showMessageDialog(null,"Login succesfull! welcome "+player.giveName());  //message on succesfull login
            
        }}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private overwatchhelpertool.PlayerLogin playerLogin1;
    private overwatchhelpertool.PlayerMenu playerMenu1;
    // End of variables declaration//GEN-END:variables
}
