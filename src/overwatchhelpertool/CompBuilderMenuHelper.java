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
 * @author Phillip
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
       return "hero-select-portrait-"+name.toUpperCase()+".png";
        }
        }
    
    //method for building , separeted files and saving to a file
    public void compSave(String name, String hero1, String hero2, String hero3, 
                         String hero4, String hero5, String hero6, String note){
        
        if(name != null){
        File temp = new File("src\\overwatchhelpertool\\Team_Comps\\"+name+".txt");
        
        String toWrite = hero1+","+hero2+","+hero3+","+hero4+","+hero5+","+hero6+","+note;

        if(temp.exists()){
            int result = JOptionPane.showConfirmDialog(null,"File already exists! wish to overwrite?");
            if(result == JOptionPane.YES_OPTION){
               compSaveWrite(name,toWrite);
               doneSaving = true;
            }else if(result == JOptionPane.NO_OPTION){
                doneSaving = false;
            }else{
                doneSaving = true;
            }
        }else{
            compSaveWrite(name,toWrite);
            doneSaving = true;
        }
        }
    
    }
    
    public void saveMaps(String name, boolean[] maps){
        StringBuilder toWrite = new StringBuilder();
      
    }
    //the actual writing part of the saver
    private void compSaveWrite(String name, String s){
         try(FileWriter comp = new FileWriter(new File("src\\overwatchhelpertool\\Team_Comps\\"+name+".txt").getAbsolutePath(),false)){
             comp.write(s);
             comp.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
