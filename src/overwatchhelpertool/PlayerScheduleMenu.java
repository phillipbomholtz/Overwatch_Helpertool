/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Phillip
 */
public class PlayerScheduleMenu extends javax.swing.JPanel {

    /**
     * Creates new form PlayerScheduleMenu
     */
    public PlayerScheduleMenu() {
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

        jRadioButton4 = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        playerScheduleMenuMonday1 = new overwatchhelpertool.PlayerScheduleMenuMonday();
        playerScheduleMenuTuesday1 = new overwatchhelpertool.PlayerScheduleMenuTuesday();
        playerScheduleMenuWednesday1 = new overwatchhelpertool.PlayerScheduleMenuWednesday();
        playerScheduleMenuThursday1 = new overwatchhelpertool.PlayerScheduleMenuThursday();
        playerScheduleMenuFriday1 = new overwatchhelpertool.PlayerScheduleMenuFriday();
        playerScheduleMenuSaturday1 = new overwatchhelpertool.PlayerScheduleMenuSaturday();
        playerScheduleMenuSunday1 = new overwatchhelpertool.PlayerScheduleMenuSunday();
        finishBotten = new javax.swing.JButton();

        jRadioButton4.setText("jRadioButton1");

        setBackground(new java.awt.Color(204, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jTabbedPane1.addTab("Monday", playerScheduleMenuMonday1);
        jTabbedPane1.addTab("Tuesday", playerScheduleMenuTuesday1);
        jTabbedPane1.addTab("Wednesday", playerScheduleMenuWednesday1);
        jTabbedPane1.addTab("Thursday", playerScheduleMenuThursday1);
        jTabbedPane1.addTab("Friday", playerScheduleMenuFriday1);
        jTabbedPane1.addTab("Saturday", playerScheduleMenuSaturday1);
        jTabbedPane1.addTab("Sunday", playerScheduleMenuSunday1);

        finishBotten.setText("Click anywhere to finalize");
        finishBotten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishBottenMouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("tab8", finishBotten);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void finishBottenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishBottenMouseClicked
        System.out.println(playerScheduleMenuThursday1.GiveTimeStreches());
    }//GEN-LAST:event_finishBottenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finishBotten;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private overwatchhelpertool.PlayerScheduleMenuFriday playerScheduleMenuFriday1;
    private overwatchhelpertool.PlayerScheduleMenuMonday playerScheduleMenuMonday1;
    private overwatchhelpertool.PlayerScheduleMenuSaturday playerScheduleMenuSaturday1;
    private overwatchhelpertool.PlayerScheduleMenuSunday playerScheduleMenuSunday1;
    private overwatchhelpertool.PlayerScheduleMenuThursday playerScheduleMenuThursday1;
    private overwatchhelpertool.PlayerScheduleMenuTuesday playerScheduleMenuTuesday1;
    private overwatchhelpertool.PlayerScheduleMenuWednesday playerScheduleMenuWednesday1;
    // End of variables declaration//GEN-END:variables
}
