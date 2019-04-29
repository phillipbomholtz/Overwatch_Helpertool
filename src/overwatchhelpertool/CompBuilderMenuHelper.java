/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;
import java.io.FileWriter;        //needed for file coms (outgoing)
import java.io.BufferedWriter;    //for writing to file
import java.io.IOException;       //exceptions for when something goes wrong
import java.io.BufferedReader;    //for reading file
import java.io.FileReader;        //needed for file coms (ingoing)
import java.io.File;              //for creating file
import java.util.StringTokenizer; //for reading , seperated files
import javax.swing.JOptionPane;
/**
 *
 * @author Phillip
 */
public class CompBuilderMenuHelper {
    public CompBuilderMenuHelper(){
        
    }
    public String imagePathGiver(String name){
       return "hero-select-portrait-"+name.toUpperCase()+".png";
        }
    
    public void compSave(String name, 
                         String hero1, 
                         String hero2, 
                         String hero3, 
                         String hero4, 
                         String hero5, 
                         String hero6, 
                         String note){
        File temp = new File("src\\overwatchhelpertool\\Team_Comps\\"+name+".txt");
        
        String toWrite = hero1+","+hero2+","+hero3+","+hero4+","+hero5+","+hero6+","+note;
        
        if(temp.exists()){
            int result = JOptionPane.showConfirmDialog(null,"File already exists! wish to overwrite?");
            if(result == JOptionPane.YES_OPTION){
               compSaveWrite(name,toWrite);
            }
        }else{
            compSaveWrite(name,toWrite);
        }
       
       
        
    }
    private void compSaveWrite(String name, String s){
         try(FileWriter comp = new FileWriter(new File("src\\overwatchhelpertool\\Team_Comps\\"+name+".txt").getAbsolutePath(),false)){
             comp.write(s);
             comp.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
