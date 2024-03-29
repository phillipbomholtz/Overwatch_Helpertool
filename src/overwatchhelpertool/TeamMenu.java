/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Phillip
 */
public class TeamMenu extends javax.swing.JPanel {

    
    /**
     * Creates new form TeamMenu
     */
    public TeamMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanes = new javax.swing.JTabbedPane();
        mainTeamMenu = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        teamCompButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        compBuilderMenu1 = new overwatchhelpertool.CompBuilderMenu();

        setBackground(new java.awt.Color(204, 204, 204));

        menuPanes.setBackground(new java.awt.Color(204, 204, 204));

        mainTeamMenu.setBackground(new java.awt.Color(204, 204, 204));

        menuTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuTitle.setText("Main Team menu! Welcome");

        teamCompButton.setText("Make Teamcomposition");
        teamCompButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamCompButtonActionPerformed(evt);
            }
        });

        back.setText("Back");

        javax.swing.GroupLayout mainTeamMenuLayout = new javax.swing.GroupLayout(mainTeamMenu);
        mainTeamMenu.setLayout(mainTeamMenuLayout);
        mainTeamMenuLayout.setHorizontalGroup(
            mainTeamMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTeamMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainTeamMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuTitle)
                    .addComponent(teamCompButton)
                    .addComponent(back))
                .addContainerGap(765, Short.MAX_VALUE))
        );
        mainTeamMenuLayout.setVerticalGroup(
            mainTeamMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTeamMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuTitle)
                .addGap(18, 18, 18)
                .addComponent(teamCompButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        menuPanes.addTab("tab2", mainTeamMenu);
        menuPanes.addTab("tab1", compBuilderMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanes, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanes, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void teamCompButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamCompButtonActionPerformed
        menuPanes.setSelectedIndex(1);  //go to team comp menu
    }//GEN-LAST:event_teamCompButtonActionPerformed

 private void createActionListeners(){
        
        
        //for create schedule botten on player menu
        compBuilderMenu1.discard.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            menuPanes.setSelectedIndex(0);                                  //change back to team menu
        }});
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton back;
    private overwatchhelpertool.CompBuilderMenu compBuilderMenu1;
    private javax.swing.JPanel mainTeamMenu;
    private javax.swing.JTabbedPane menuPanes;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JButton teamCompButton;
    // End of variables declaration//GEN-END:variables
}
