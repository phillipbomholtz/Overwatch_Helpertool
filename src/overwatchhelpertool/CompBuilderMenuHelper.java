/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;
import java.io.FileWriter;        //needed for file coms (outgoing)
import java.io.IOException;       //exceptions for when something goes wrong
import java.io.File;              //for creating file
import javax.swing.JOptionPane;
import java.lang.StringBuilder;

/**
 *
 * @author Phillip bomholtz
 */
public class CompBuilderMenuHelper {
    
    public boolean doneSaving;
    public CompBuilderMenuHelper(){
        
    }
    //retun image file name as string
    public String imagePathGiver(String name){
        if(name.equals("Select hero")){
            return "Inv.png";
        }else{
            System.out.println(name.toUpperCase());
       return "hero-select-portrait-"+name.toUpperCase()+".png";
        }
        }
    
    //method for building , separeted files and saving to a file
    public void compSave(TeamComp t){
        String name = t.getName();
        String note = t.getNote();
        if(name != null){
        File temp = new File("Team_Comps\\"+name+".txt");
        
        String heroes = t.Hero1+","+t.Hero2+","+t.Hero3+","+t.Hero4
                +","+t.Hero5+","+t.Hero6+","+note+"\r\n";

        StringBuilder toWrite = new StringBuilder();
        toWrite.append(heroes);
        for(int i = 0; i < t.getMapListSize(); i++){
            if(t.getMapAtIndexFlag(i)){
                toWrite.append(t.getMapAtIndexName(i));
                toWrite.append(",");
            }
        }
        
        if(temp.exists()){
            int result = JOptionPane.showConfirmDialog(null,"File already exists! wish to overwrite?");
            if(result == JOptionPane.YES_OPTION){
               compSaveWrite(name,toWrite.toString());
               doneSaving = true;
            }else if(result == JOptionPane.NO_OPTION){
                doneSaving = false;
            }else{
                doneSaving = true;
            }
        }else{
            compSaveWrite(name,toWrite.toString());
            doneSaving = true;
        }
        }
    
    }
    
    //the actual writing part of the saver
    private void compSaveWrite(String name, String s){
         try(FileWriter comp = new FileWriter(new File("Team_Comps\\"+name+".txt").getAbsolutePath(),false)){
             comp.write(s);
             comp.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }
    
}
