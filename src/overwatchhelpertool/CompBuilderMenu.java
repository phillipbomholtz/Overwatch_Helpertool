/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import java.io.File;
import java.io.FileReader;        //needed for reading file
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author phill
 */
public class CompBuilderMenu extends javax.swing.JPanel {
private CompBuilderMenuHelper helper = new CompBuilderMenuHelper();
private String[] heroString;
private TeamComp comp = new TeamComp();

    /**
     * Creates new form CompBuilderMenu
     */
    public CompBuilderMenu() {
        heroString = heroStringRead();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        noteBox = new javax.swing.JTextPane();
        hanamura = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        horizonLunaColony = new javax.swing.JCheckBox();
        paris = new javax.swing.JCheckBox();
        templeOfAnubis = new javax.swing.JCheckBox();
        volskayaIndustries = new javax.swing.JCheckBox();
        eichenwalde = new javax.swing.JCheckBox();
        hollywood = new javax.swing.JCheckBox();
        kingsRow = new javax.swing.JCheckBox();
        numbani = new javax.swing.JCheckBox();
        busan = new javax.swing.JCheckBox();
        ilios = new javax.swing.JCheckBox();
        lijiangTower = new javax.swing.JCheckBox();
        nepal = new javax.swing.JCheckBox();
        oasis = new javax.swing.JCheckBox();
        dorado = new javax.swing.JCheckBox();
        junkertown = new javax.swing.JCheckBox();
        rialto = new javax.swing.JCheckBox();
        route66 = new javax.swing.JCheckBox();
        blizzardWorld = new javax.swing.JCheckBox();
        watchpointGibraltar = new javax.swing.JCheckBox();
        save = new javax.swing.JButton();
        discard = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(1000, 500));

        HeroS1.setModel(new javax.swing.DefaultComboBoxModel<>(heroString));
        HeroS1.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS1ActionPerformed(evt);
            }
        });

        HeroS6.setModel(new javax.swing.DefaultComboBoxModel<>(heroString));
        HeroS6.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS6ActionPerformed(evt);
            }
        });

        HeroS2.setModel(new javax.swing.DefaultComboBoxModel<>(heroString));
        HeroS2.setMinimumSize(new java.awt.Dimension(100, 20));
        HeroS2.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS2ActionPerformed(evt);
            }
        });

        HeroS3.setModel(new javax.swing.DefaultComboBoxModel<>(heroString));
        HeroS3.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS3ActionPerformed(evt);
            }
        });

        HeroS4.setModel(new javax.swing.DefaultComboBoxModel<>(heroString));
        HeroS4.setMinimumSize(new java.awt.Dimension(100, 20));
        HeroS4.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS4ActionPerformed(evt);
            }
        });

        HeroS5.setModel(new javax.swing.DefaultComboBoxModel<>(heroString));
        HeroS5.setPreferredSize(new java.awt.Dimension(100, 20));
        HeroS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroS5ActionPerformed(evt);
            }
        });

        HeroPort1.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort1.setText("Error in import");
        HeroPort1.setPreferredSize(new java.awt.Dimension(100, 172));

        HeroPort2.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort2.setText("Error in import");
        HeroPort2.setPreferredSize(new java.awt.Dimension(100, 172));
        HeroPort2.setRequestFocusEnabled(false);

        HeroPort3.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort3.setText("Error in import");
        HeroPort3.setPreferredSize(new java.awt.Dimension(100, 172));

        HeroPort4.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort4.setText("Error in import");
        HeroPort4.setPreferredSize(new java.awt.Dimension(100, 172));

        HeroPort5.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort5.setText("Error in import");
        HeroPort5.setPreferredSize(new java.awt.Dimension(100, 172));

        HeroPort6.setIcon(new javax.swing.ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\Inv.png").getAbsolutePath()));
        HeroPort6.setText("Error in import");
        HeroPort6.setPreferredSize(new java.awt.Dimension(100, 172));

        noteBox.setText("Enter notes for this team comp here");
        noteBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noteBoxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(noteBox);

        hanamura.setText("Hanamura");

        jLabel1.setText("Intended maps:");

        horizonLunaColony.setText("Horizon_Luna_Colony");

        paris.setText("Paris");

        templeOfAnubis.setText("Temple_Of_Anubis");

        volskayaIndustries.setText("Volskaya_Industries");
        volskayaIndustries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volskayaIndustriesActionPerformed(evt);
            }
        });

        eichenwalde.setText("Eichenwalde");

        hollywood.setText("Hollywood");

        kingsRow.setText("Kings_Row");

        numbani.setText("Numbani");

        busan.setText("Busan");

        ilios.setText("Ilios");

        lijiangTower.setText("Lijiang_Tower");

        nepal.setText("Nepal");

        oasis.setText("Oasis");

        dorado.setText("Dorado");
        dorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doradoActionPerformed(evt);
            }
        });

        junkertown.setText("Junkertown");

        rialto.setText("Rialto");

        route66.setText("Route 66");

        blizzardWorld.setText("Blizzard_World");

        watchpointGibraltar.setText("Watchpoint_Gibraltar");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        discard.setText("Discard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(HeroPort3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(HeroS6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hanamura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horizonLunaColony, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(templeOfAnubis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(volskayaIndustries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eichenwalde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hollywood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kingsRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numbani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(busan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lijiangTower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nepal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(oasis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dorado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(watchpointGibraltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(blizzardWorld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(route66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rialto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(junkertown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(discard, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hanamura)
                            .addComponent(eichenwalde)
                            .addComponent(ilios)
                            .addComponent(junkertown))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horizonLunaColony)
                            .addComponent(hollywood)
                            .addComponent(lijiangTower)
                            .addComponent(rialto))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paris)
                            .addComponent(kingsRow)
                            .addComponent(nepal)
                            .addComponent(route66))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(templeOfAnubis)
                            .addComponent(numbani)
                            .addComponent(oasis)
                            .addComponent(blizzardWorld))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volskayaIndustries)
                            .addComponent(busan)
                            .addComponent(dorado)
                            .addComponent(watchpointGibraltar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save)
                            .addComponent(discard)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HeroS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS3ActionPerformed
         String s = HeroS3.getSelectedItem().toString();
         comp.Hero3 = s;
            try{
                System.out.println("hello");
            HeroPort3.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS3ActionPerformed

    private void HeroS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS5ActionPerformed
         String s = HeroS5.getSelectedItem().toString();
         comp.Hero5 = s;
            try{
            HeroPort5.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS5ActionPerformed

    private void HeroS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS4ActionPerformed
        String s = HeroS4.getSelectedItem().toString();
        comp.Hero4 = s;
            try{
            HeroPort4.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS4ActionPerformed

    private void HeroS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS2ActionPerformed
         String s = HeroS2.getSelectedItem().toString();
         comp.Hero2 = s;
            try{
            HeroPort2.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS2ActionPerformed

    private void HeroS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS1ActionPerformed
        String s = HeroS1.getSelectedItem().toString();
        comp.Hero1 = s;
            try{
            HeroPort1.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }

        
    }//GEN-LAST:event_HeroS1ActionPerformed

    private void HeroS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroS6ActionPerformed
         String s = HeroS6.getSelectedItem().toString();
         comp.Hero6 = s;
            try{
            HeroPort6.setIcon(new ImageIcon(new File("src\\overwatchhelpertool\\Hero_portrait\\"+helper.imagePathGiver(s)).getAbsolutePath()));
            }catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_HeroS6ActionPerformed

    private void noteBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteBoxMouseClicked
        noteBox.setText("");
    }//GEN-LAST:event_noteBoxMouseClicked

    private void doradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doradoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        helper.doneSaving = false;
        mapCheck();
        String s="helloThere";
        do{
            s = JOptionPane.showInputDialog("name this team composition");
            System.out.println(s);
            comp.setName(s);
            comp.setNote(noteBox.getText());
            for(int i = 0;i < comp.getMapListSize();i++){
            System.out.println(comp.getMapAtIndexName(i));
            }
            helper.compSave(comp);
            
        }while(!helper.doneSaving && s != null);
    }//GEN-LAST:event_saveActionPerformed
    //check what maps are enabled
    private void mapCheck(){
            if(busan.isSelected()){
                comp.setMapFlagTrue("Busan");
            }else{
                comp.setMapFlagFalse("Busan");
            }
        
            if(blizzardWorld.isSelected()){
                comp.setMapFlagTrue("Blizzard_world");
            }else{
                comp.setMapFlagFalse("Blizzard_world");
            }
            
            if(dorado.isSelected()){
                comp.setMapFlagTrue("Dorado");
            }else{
                comp.setMapFlagFalse("Dorado");
            }
            
            if(eichenwalde.isSelected()){
                comp.setMapFlagTrue("Eichenwalde");
            }else{
                comp.setMapFlagFalse("Eichenwalde");
            }
            
            if(hanamura.isSelected()){
                comp.setMapFlagTrue("Hanamura");
            }else{
                comp.setMapFlagFalse("Hanamura");
            }
            
            if(hollywood.isSelected()){
                comp.setMapFlagTrue("Hollywood");
            }else{
                comp.setMapFlagFalse("Hollywood");
            }
            
            if(horizonLunaColony.isSelected()){
                comp.setMapFlagTrue("Horizon_luna_colony");
            }else{
                comp.setMapFlagFalse("Horizon_luna_colony");
            }
            
            if(ilios.isSelected()){
                comp.setMapFlagTrue("Ilios");
            }else{
                comp.setMapFlagFalse("Ilios");
            }
            
            if(junkertown.isSelected()){
                comp.setMapFlagTrue("Junkertown");
            }else{
                comp.setMapFlagFalse("Junkertown");
            }
            
            if(kingsRow.isSelected()){
                comp.setMapFlagTrue("Kings_row");
            }else{
                comp.setMapFlagFalse("Kings_row");
            }
            
            if(lijiangTower.isSelected()){
                comp.setMapFlagTrue("Lijiang_tower");
            }else{
                comp.setMapFlagFalse("Lijiang_tower");
            }
            
            if(nepal.isSelected()){
                comp.setMapFlagTrue("Nepal");
            }else{
                comp.setMapFlagFalse("Nepal");
            }
            
            if(numbani.isSelected()){
                comp.setMapFlagTrue("Numbani");
            }else{
                comp.setMapFlagFalse("Numbani");
            }
            
            if(oasis.isSelected()){
                comp.setMapFlagTrue("Oasis");
            }else{
                comp.setMapFlagFalse("Oasis");
            }
            
            if(paris.isSelected()){
                comp.setMapFlagTrue("Paris");
            }else{
                comp.setMapFlagFalse("Paris");
            }
            
            if(rialto.isSelected()){
                comp.setMapFlagTrue("Rialto");
            }else{
                comp.setMapFlagFalse("Rialto");
            }
            
            if(route66.isSelected()){
                comp.setMapFlagTrue("Route66");
            }else{
                comp.setMapFlagFalse("Route66");
            }
            
            if(templeOfAnubis.isSelected()){
                comp.setMapFlagTrue("Temple_of_anubis");
            }else{
                comp.setMapFlagFalse("Temple_of_anubis");
            }
            
            if(volskayaIndustries.isSelected()){
                comp.setMapFlagTrue("Volskaya_industries");
            }else{
                comp.setMapFlagFalse("Volskaya_industries");
            }
            
            if(watchpointGibraltar.isSelected()){
                comp.setMapFlagTrue("Watchpoint_gibraltar");
            }else{
                comp.setMapFlagFalse("Watchpoint_gibraltar");
            }
    }
    private void volskayaIndustriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volskayaIndustriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volskayaIndustriesActionPerformed

    //read the hero file and return the string
    private String[] heroStringRead(){
        try{
        FileReader heroReader = new FileReader(new File("src\\overwatchhelpertool\\hero_list.txt").getAbsolutePath());
        BufferedReader heroFileReader = new BufferedReader(heroReader);  
        
        String s = heroFileReader.readLine();
        StringTokenizer st = new StringTokenizer(s, "(,)");
        List<String> arrList = new ArrayList<>();
        
        //while there is more in the string
        while(st.hasMoreElements()){
            arrList.add(st.nextToken());
        }
        String[] arr = new String[arrList.size()];
        arr = arrList.toArray(arr);
        return arr;
        }catch(IOException e){
            e.printStackTrace();
        }
       return new String[] {"missing hero file"};
    }
    
    
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
    private javax.swing.JCheckBox blizzardWorld;
    private javax.swing.JCheckBox busan;
    private javax.swing.ButtonGroup buttonGroup1;
    protected javax.swing.JButton discard;
    private javax.swing.JCheckBox dorado;
    private javax.swing.JCheckBox eichenwalde;
    private javax.swing.JCheckBox hanamura;
    private javax.swing.JCheckBox hollywood;
    private javax.swing.JCheckBox horizonLunaColony;
    private javax.swing.JCheckBox ilios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox junkertown;
    private javax.swing.JCheckBox kingsRow;
    private javax.swing.JCheckBox lijiangTower;
    private javax.swing.JCheckBox nepal;
    private javax.swing.JTextPane noteBox;
    private javax.swing.JCheckBox numbani;
    private javax.swing.JCheckBox oasis;
    private javax.swing.JCheckBox paris;
    private javax.swing.JCheckBox rialto;
    private javax.swing.JCheckBox route66;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox templeOfAnubis;
    private javax.swing.JCheckBox volskayaIndustries;
    private javax.swing.JCheckBox watchpointGibraltar;
    // End of variables declaration//GEN-END:variables
}
