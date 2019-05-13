/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Phillip
 */
public class PlayerScheduleMenuSaturday extends javax.swing.JPanel {

    /**
     * Creates new form temp
     */
    public PlayerScheduleMenuSaturday() {
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
        TimeSpinSaturday1 = new javax.swing.JSpinner(DATE1);
        jLabel1 = new javax.swing.JLabel();
        SpinnerDateModel DATE2 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday2 = new javax.swing.JSpinner(DATE2);
        jLabel6 = new javax.swing.JLabel();
        stretchOneSaturdaySelect = new javax.swing.JRadioButton();
        SpinnerDateModel DATE3 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday3 = new javax.swing.JSpinner(DATE3);
        jLabel2 = new javax.swing.JLabel();
        SpinnerDateModel DATE4 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday4 = new javax.swing.JSpinner(DATE4);
        SpinnerDateModel DATE5 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday5 = new javax.swing.JSpinner(DATE5);
        jLabel3 = new javax.swing.JLabel();
        SpinnerDateModel DATE6 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday6 = new javax.swing.JSpinner(DATE6);
        SpinnerDateModel DATE7 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday7 = new javax.swing.JSpinner(DATE7);
        jLabel4 = new javax.swing.JLabel();
        SpinnerDateModel DATE8 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinSaturday8 = new javax.swing.JSpinner(DATE8);
        stretchTwoSaturdaySelect = new javax.swing.JRadioButton();
        stretchThreeSaturdaySelect = new javax.swing.JRadioButton();
        stretchFourSaturdaySelect = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1000, 472));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Saturday");

        jLabel5.setText("Here are the start and stop time");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("How do i use this menu?\n\nIn this menu you can setup the\nschedule of when you are going to be\navailable.\n\nSimple select the start and stop times\nof when you are available.\n\nIt is assumed that you \nmight be available at multiple \ndifferent stretches of time in one \nday.\n\nIf this is the case, simply select\nMore than one box and the time\nIn which you are available. \n\nIf you are not available at all this\nday, don't select any.");
        jScrollPane2.setViewportView(jTextArea1);

        JSpinner.DateEditor spin1 = new JSpinner.DateEditor(TimeSpinSaturday1, "HH:mm");
        TimeSpinSaturday1.setEditor(spin1);

        jLabel1.setText("to");

        JSpinner.DateEditor spin2 = new JSpinner.DateEditor(TimeSpinSaturday2, "HH:mm");
        TimeSpinSaturday2.setEditor(spin2);

        jLabel6.setText("Select the stretches of time you are available for this day.");

        stretchOneSaturdaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchOneSaturdaySelect.setText("1st Stretch");
        

        JSpinner.DateEditor spin3 = new JSpinner.DateEditor(TimeSpinSaturday3, "HH:mm");
        TimeSpinSaturday3.setEditor(spin3);

        jLabel2.setText("to");

        JSpinner.DateEditor spin4 = new JSpinner.DateEditor(TimeSpinSaturday4, "HH:mm");
        TimeSpinSaturday4.setEditor(spin4);

        JSpinner.DateEditor spin5 = new JSpinner.DateEditor(TimeSpinSaturday5, "HH:mm");
        TimeSpinSaturday5.setEditor(spin5);

        jLabel3.setText("to");

        JSpinner.DateEditor spin6 = new JSpinner.DateEditor(TimeSpinSaturday6, "HH:mm");
        TimeSpinSaturday6.setEditor(spin6);

        JSpinner.DateEditor spin7 = new JSpinner.DateEditor(TimeSpinSaturday7, "HH:mm");
        TimeSpinSaturday7.setEditor(spin7);

        jLabel4.setText("to");

        JSpinner.DateEditor spin8 = new JSpinner.DateEditor(TimeSpinSaturday8, "HH:mm");
        TimeSpinSaturday8.setEditor(spin8);

        stretchTwoSaturdaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchTwoSaturdaySelect.setText("2nd Stretch");

        stretchThreeSaturdaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchThreeSaturdaySelect.setText("3rd Stretch");

        stretchFourSaturdaySelect.setBackground(new java.awt.Color(204, 204, 204));
        stretchFourSaturdaySelect.setText("4th Stretch");
        

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
                                .addComponent(TimeSpinSaturday3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeSpinSaturday4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimeSpinSaturday5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeSpinSaturday6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimeSpinSaturday7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeSpinSaturday8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stretchThreeSaturdaySelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stretchTwoSaturdaySelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(stretchFourSaturdaySelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TimeSpinSaturday1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeSpinSaturday2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stretchOneSaturdaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(TimeSpinSaturday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(TimeSpinSaturday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchOneSaturdaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSaturday3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(TimeSpinSaturday4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchTwoSaturdaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSaturday5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(TimeSpinSaturday6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchThreeSaturdaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeSpinSaturday7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TimeSpinSaturday8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stretchFourSaturdaySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>                        


    public List<TimeStretch> GiveTimeStreches(){
        List<TimeStretch> tempList = new ArrayList<>();
        
        //for first stretch
        if(stretchOneSaturdaySelect.isSelected()){
            //get hours an minuts of start
            String startTime=getValueString(TimeSpinSaturday1.getValue().toString());
            StringTokenizer startReader = new StringTokenizer(startTime,"(:)");
            int startHour = Integer.parseInt(startReader.nextToken());
            int startMminut = Integer.parseInt(startReader.nextToken());
            
            
            //get hours an minuts of end
            String endTime = getValueString(TimeSpinSaturday2.getValue().toString());
            StringTokenizer endReader = new StringTokenizer(endTime,"(:)");
            int endHour = Integer.parseInt(endReader.nextToken());
            int endMinute = Integer.parseInt(endReader.nextToken());

            int startInSeconds = getInSeconds(startHour,startMminut);
            int endInSeconds = getInSeconds(endHour,endMinute);
            
            //collect and put in a timestretch and save to list if start is smaller than end
            if(startInSeconds < endInSeconds){
                tempList.add(new TimeStretch(startInSeconds,endInSeconds));
            }else{
                JOptionPane.showMessageDialog(null,"Error in "+jLabel7.getText()+". one start time is bigger or equal to end time");  //message for error
            }
        }
        
        //for seconds stretch
        if(stretchTwoSaturdaySelect.isSelected()){
            //get hours an minuts of start
            String startTime=getValueString(TimeSpinSaturday3.getValue().toString());
            StringTokenizer startReader = new StringTokenizer(startTime,"(:)");
            int startHour = Integer.parseInt(startReader.nextToken());
            int startMminut = Integer.parseInt(startReader.nextToken());
            
            
            //get hours an minuts of end
            String endTime = getValueString(TimeSpinSaturday4.getValue().toString());
            StringTokenizer endReader = new StringTokenizer(endTime,"(:)");
            int endHour = Integer.parseInt(endReader.nextToken());
            int endMinute = Integer.parseInt(endReader.nextToken());

            int startInSeconds = getInSeconds(startHour,startMminut);
            int endInSeconds = getInSeconds(endHour,endMinute);
            
            //collect and put in a timestretch and save to list if start is smaller than end
            if(startInSeconds < endInSeconds){
                tempList.add(new TimeStretch(startInSeconds,endInSeconds));
            }else{
                JOptionPane.showMessageDialog(null,"Error in "+jLabel7.getText()+". one start time is bigger or equal to end time");  //message for error
            }
        }
        
        //for third stretch
        if(stretchThreeSaturdaySelect.isSelected()){
            //get hours an minuts of start
            String startTime=getValueString(TimeSpinSaturday5.getValue().toString());
            StringTokenizer startReader = new StringTokenizer(startTime,"(:)");
            int startHour = Integer.parseInt(startReader.nextToken());
            int startMminut = Integer.parseInt(startReader.nextToken());
            
            
            //get hours an minuts of end
            String endTime = getValueString(TimeSpinSaturday6.getValue().toString());
            StringTokenizer endReader = new StringTokenizer(endTime,"(:)");
            int endHour = Integer.parseInt(endReader.nextToken());
            int endMinute = Integer.parseInt(endReader.nextToken());

            int startInSeconds = getInSeconds(startHour,startMminut);
            int endInSeconds = getInSeconds(endHour,endMinute);
            
            //collect and put in a timestretch and save to list if start is smaller than end
            if(startInSeconds < endInSeconds){
                tempList.add(new TimeStretch(startInSeconds,endInSeconds));
            }else{
                JOptionPane.showMessageDialog(null,"Error in "+jLabel7.getText()+". one start time is bigger or equal to end time");  //message for error
            }
        }
        
        //for fourth stretch
        if(stretchFourSaturdaySelect.isSelected()){
            //get hours an minuts of start
            String startTime=getValueString(TimeSpinSaturday7.getValue().toString());
            StringTokenizer startReader = new StringTokenizer(startTime,"(:)");
            int startHour = Integer.parseInt(startReader.nextToken());
            int startMminut = Integer.parseInt(startReader.nextToken());
            
            
            //get hours an minuts of end
            String endTime = getValueString(TimeSpinSaturday8.getValue().toString());
            StringTokenizer endReader = new StringTokenizer(endTime,"(:)");
            int endHour = Integer.parseInt(endReader.nextToken());
            int endMinute = Integer.parseInt(endReader.nextToken());

            int startInSeconds = getInSeconds(startHour,startMminut);
            int endInSeconds = getInSeconds(endHour,endMinute);
            
            //collect and put in a timestretch and save to list if start is smaller than end
            if(startInSeconds < endInSeconds){
                tempList.add(new TimeStretch(startInSeconds,endInSeconds));
            }else{
                JOptionPane.showMessageDialog(null,"Error in "+jLabel7.getText()+". one start time is bigger or equal to end time");  //message for error
            }
        }
        return tempList;
    }  
    
    //get the string with the time value in hh:mm format
    private String getValueString(String value){
        StringTokenizer reader = new StringTokenizer(value,"( )");   
        reader.nextToken();reader.nextToken();reader.nextToken();    //read and discard junk
        return reader.nextToken();                                   //get wanted ino
    }
    
    private int getInSeconds(int hour,int min){
        return (hour*3600)+(min*60);            //return total in seconds
    }
                   
    private javax.swing.JSpinner TimeSpinSaturday1;
    private javax.swing.JSpinner TimeSpinSaturday2;
    private javax.swing.JSpinner TimeSpinSaturday3;
    private javax.swing.JSpinner TimeSpinSaturday4;
    private javax.swing.JSpinner TimeSpinSaturday5;
    private javax.swing.JSpinner TimeSpinSaturday6;
    private javax.swing.JSpinner TimeSpinSaturday7;
    private javax.swing.JSpinner TimeSpinSaturday8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton stretchFourSaturdaySelect;
    private javax.swing.JRadioButton stretchOneSaturdaySelect;
    private javax.swing.JRadioButton stretchThreeSaturdaySelect;
    private javax.swing.JRadioButton stretchTwoSaturdaySelect;                
}
