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

/**
 *
 * @author Phillip
 */
public class PlayerScheduleMenuSunday extends javax.swing.JPanel {

    /**
     * Creates new form temp
     */
    public PlayerScheduleMenuSunday() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Date date = new Date();
        SpinnerDateModel DATE1 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday1 = new javax.swing.JSpinner(DATE1);
        jLabel1 = new javax.swing.JLabel();
        SpinnerDateModel DATE2 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday2 = new javax.swing.JSpinner(DATE2);
        jLabel6 = new javax.swing.JLabel();
        stretchOneSundaySelect = new javax.swing.JRadioButton();
        SpinnerDateModel DATE3 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday3 = new javax.swing.JSpinner(DATE3);
        jLabel2 = new javax.swing.JLabel();
        SpinnerDateModel DATE4 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday4 = new javax.swing.JSpinner(DATE4);
        SpinnerDateModel DATE5 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday5 = new javax.swing.JSpinner(DATE5);
        jLabel3 = new javax.swing.JLabel();
        SpinnerDateModel DATE6 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday6 = new javax.swing.JSpinner(DATE6);
        SpinnerDateModel DATE7 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday7 = new javax.swing.JSpinner(DATE7);
        jLabel4 = new javax.swing.JLabel();
        SpinnerDateModel DATE8 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSunday8 = new javax.swing.JSpinner(DATE8);
        stretchTwoSundaySelect = new javax.swing.JRadioButton();
        stretchThreeSundaySelect = new javax.swing.JRadioButton();
        stretchFourSundaySelect = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1000, 472));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tuesday");

        jLabel5.setText("Here are the start and stop time");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("How do i use this menu?\n\nIn this menu you can setup the\nschedule of when you are going to be\navailable.\n\nSimple select the start and stop times\nof when you are available.\n\nIt is assumed that you \nmight be available at multiple \ndifferent stretches of time in one \nday.\n\nIf this is the case, simply select\nMore than one box and the time\nIn which you are available. \n\nIf you are not available at all this\nday, don't select any.");
        jScrollPane2.setViewportView(jTextArea1);

        JSpinner.DateEditor spin1 = new JSpinner.DateEditor(TimeSpinSunday1, "HH:mm");
        TimeSpinSunday1.setEditor(spin1);

        jLabel1.setText("to");

        JSpinner.DateEditor spin2 = new JSpinner.DateEditor(TimeSpinSunday2, "HH:mm");
        TimeSpinSunday2.setEditor(spin2);

        jLabel6.setText("Select the stretches of time you are available for this day.");

        stretchOneSundaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchOneSundaySelect.setText("1st Stretch");
        

        JSpinner.DateEditor spin3 = new JSpinner.DateEditor(TimeSpinSunday3, "HH:mm");
        TimeSpinSunday3.setEditor(spin3);

        jLabel2.setText("to");

        JSpinner.DateEditor spin4 = new JSpinner.DateEditor(TimeSpinSunday4, "HH:mm");
        TimeSpinSunday4.setEditor(spin4);

        JSpinner.DateEditor spin5 = new JSpinner.DateEditor(TimeSpinSunday5, "HH:mm");
        TimeSpinSunday5.setEditor(spin5);

        jLabel3.setText("to");

        JSpinner.DateEditor spin6 = new JSpinner.DateEditor(TimeSpinSunday6, "HH:mm");
        TimeSpinSunday6.setEditor(spin6);

        JSpinner.DateEditor spin7 = new JSpinner.DateEditor(TimeSpinSunday7, "HH:mm");
        TimeSpinSunday7.setEditor(spin7);

        jLabel4.setText("to");

        JSpinner.DateEditor spin8 = new JSpinner.DateEditor(TimeSpinSunday8, "HH:mm");
        TimeSpinSunday8.setEditor(spin8);

        stretchTwoSundaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchTwoSundaySelect.setText("2nd Stretch");

        stretchThreeSundaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchThreeSundaySelect.setText("3rd Stretch");

        stretchFourSundaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchFourSundaySelect.setText("4th Stretch");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimeSpinSunday3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeSpinSunday4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimeSpinSunday5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeSpinSunday6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimeSpinSunday7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeSpinSunday8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stretchThreeSundaySelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stretchTwoSundaySelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(stretchFourSundaySelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TimeSpinSunday1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeSpinSunday2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stretchOneSundaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSunday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(TimeSpinSunday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchOneSundaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSunday3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(TimeSpinSunday4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchTwoSundaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSunday5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(TimeSpinSunday6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchThreeSundaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSunday7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TimeSpinSunday8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchFourSundaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    
    private javax.swing.JSpinner TimeSpinSunday1;
    private javax.swing.JSpinner TimeSpinSunday2;
    private javax.swing.JSpinner TimeSpinSunday3;
    private javax.swing.JSpinner TimeSpinSunday4;
    private javax.swing.JSpinner TimeSpinSunday5;
    private javax.swing.JSpinner TimeSpinSunday6;
    private javax.swing.JSpinner TimeSpinSunday7;
    private javax.swing.JSpinner TimeSpinSunday8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton stretchFourSundaySelect;
    private javax.swing.JRadioButton stretchOneSundaySelect;
    private javax.swing.JRadioButton stretchThreeSundaySelect;
    private javax.swing.JRadioButton stretchTwoSundaySelect;
    // End of variables declaration                   
}
