/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author phill
 */
public class CompBuilderMenu extends javax.swing.JPanel {
private CompBuilderMenuHelper helper = new CompBuilderMenuHelper();
    /**
     * Creates new form CompBuilderMenu
     */
    public CompBuilderMenu() {
        try{
        initComponents();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeroS1 = new javax.swing.JComboBox<>();
        HeroS6 = new javax.swing.JComboBox<>();
        HeroS2 = new javax.swing.JComboBox<>();
        HeroS3 = new javax.swing.JComboBox<>();
        HeroS4 = new javax.swing.JComboBox<>();
        HeroS5 = new javax.swing.JComboBox<>();
        HeroPort1 = new javax.swing.JLabel();
        HeroPort2 = new javax.swing.JLabel();
        HeroPort3 = new javax.swing.JLabel();
        HeroPort4 = new javax.swing.JLabel();
        HeroPort5 = new javax.swing.JLabel();
        HeroPort6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(1000, 500));

        HeroS1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hero", "Ana", "Ashe", "Baptiste", "Bastion", "Brigitte", "Doomfist", "Dva", "Genji", "Hanzo", "Junkrat", "Lucio", "Mei", "Mercy", "Moira", "Orisa", "Pharah", "Reaper", "Reinhardt", "Soldier76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker", "Wreckingball", "Zarya", "Zenyatta" }));
        HeroS1.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS1ActionPerformed(evt);
            }
        });

        HeroS6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hero", "Ana", "Ashe", "Baptiste", "Bastion", "Brigitte", "Doomfist", "Dva", "Genji", "Hanzo", "Junkrat", "Lucio", "Mei", "Mercy", "Moira", "Orisa", "Pharah", "Reaper", "Reinhardt", "Soldier76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker", "Wreckingball", "Zarya", "Zenyatta" }));
        HeroS6.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS6ActionPerformed(evt);
            }
        });

        HeroS2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hero", "Ana", "Ashe", "Baptiste", "Bastion", "Brigitte", "Doomfist", "Dva", "Genji", "Hanzo", "Junkrat", "Lucio", "Mei", "Mercy", "Moira", "Orisa", "Pharah", "Reaper", "Reinhardt", "Soldier76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker", "Wreckingball", "Zarya", "Zenyatta" }));
        HeroS2.setMinimumSize(new java.awt.Dimension(100, 20));
        HeroS2.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS2ActionPerformed(evt);
            }
        });

        HeroS3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hero", "Ana", "Ashe", "Baptiste", "Bastion", "Brigitte", "Doomfist", "Dva", "Genji", "Hanzo", "Junkrat", "Lucio", "Mei", "Mercy", "Moira", "Orisa", "Pharah", "Reaper", "Reinhardt", "Soldier76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker", "Wreckingball", "Zarya", "Zenyatta" }));
        HeroS3.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS3ActionPerformed(evt);
            }
        });

        HeroS4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hero", "Ana", "Ashe", "Baptiste", "Bastion", "Brigitte", "Doomfist", "Dva", "Genji", "Hanzo", "Junkrat", "Lucio", "Mei", "Mercy", "Moira", "Orisa", "Pharah", "Reaper", "Reinhardt", "Soldier76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker", "Wreckingball", "Zarya", "Zenyatta" }));
        HeroS4.setMinimumSize(new java.awt.Dimension(100, 20));
        HeroS4.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS4ActionPerformed(evt);
            }
        });

        HeroS5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hero", "Ana", "Ashe", "Baptiste", "Bastion", "Brigitte", "Doomfist", "Dva", "Genji", "Hanzo", "Junkrat", "Lucio", "Mei", "Mercy", "Moira", "Orisa", "Pharah", "Reaper", "Reinhardt", "Soldier76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker", "Wreckingball", "Zarya", "Zenyatta" }));
        HeroS5.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS5ActionPerformed(evt);
            }
        });

        HeroPort1.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort1.setText("Error in import");
        HeroPort1.setPreferredSize(new java.awt.Dimension(100, 100));

        HeroPort2.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort2.setText("Error in import");
        HeroPort2.setPreferredSize(new java.awt.Dimension(100, 100));

        HeroPort3.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort3.setText("Error in import");
        HeroPort3.setPreferredSize(new java.awt.Dimension(100, 100));

        HeroPort4.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort4.setText("Error in import");
        HeroPort4.setPreferredSize(new java.awt.Dimension(100, 100));

        HeroPort5.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort5.setText("Error in import");
        HeroPort5.setPreferredSize(new java.awt.Dimension(100, 100));

        HeroPort6.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort6.setText("Error in import");
        HeroPort6.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeroS1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeroS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeroS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeroS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeroS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeroPort6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroS6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeroS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroS6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeroPort2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeroPort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(347, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HeroS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS3ActionPerformed
         String s = HeroS3.getSelectedItem().toString();
            try{
            HeroPort3.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS3ActionPerformed

    private void HeroS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS5ActionPerformed
         String s = HeroS5.getSelectedItem().toString();
            try{
            HeroPort5.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS5ActionPerformed

    private void HeroS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS4ActionPerformed
        String s = HeroS4.getSelectedItem().toString();
            try{
            HeroPort4.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS4ActionPerformed

    private void HeroS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS2ActionPerformed
         String s = HeroS2.getSelectedItem().toString();
            try{
            HeroPort2.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS2ActionPerformed

    private void HeroS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS1ActionPerformed
        String s = HeroS1.getSelectedItem().toString();
            try{
            HeroPort1.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }

        
    }//GEN-LAST:event_HeroS1ActionPerformed

    private void HeroS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS6ActionPerformed
         String s = HeroS6.getSelectedItem().toString();
            try{
            HeroPort6.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeroPort1;
    private javax.swing.JLabel HeroPort2;
    private javax.swing.JLabel HeroPort3;
    private javax.swing.JLabel HeroPort4;
    private javax.swing.JLabel HeroPort5;
    private javax.swing.JLabel HeroPort6;
    private javax.swing.JComboBox<String> HeroS1;
    private javax.swing.JComboBox<String> HeroS2;
    private javax.swing.JComboBox<String> HeroS3;
    private javax.swing.JComboBox<String> HeroS4;
    private javax.swing.JComboBox<String> HeroS5;
    private javax.swing.JComboBox<String> HeroS6;
    // End of variables declaration//GEN-END:variables
}
