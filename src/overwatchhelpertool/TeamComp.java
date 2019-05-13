/*
 * the base structure of a teamcomp
 */
package overwatchhelpertool;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 *
 * @author Phillip Bomholtz
 */
public class TeamComp {
   private String name;                              //the name of the comp
   private String note;                              //the entered note
   private List<Map> maps = new ArrayList<>();       //a list of maps of map struct
   protected String Hero1;                           //name of hero
   protected String Hero2;                           //name of hero
   protected String Hero3;                           //name of hero
   protected String Hero4;                           //name of hero
   protected String Hero5;                           //name of hero
   protected String Hero6;                           //name of hero
   private int winrate;                              //winrate of teamcomp

   
   public TeamComp(){
       loadMaps();
   }
   
   public TeamComp(String compName,String Note){
       name = compName;
       note = Note;
       loadMaps();
   }
   
   private void loadMaps(){
       String s = "";
       
       try{
       FileReader mapReader = new FileReader(new File("src\\overwatchhelpertool\\map_list.txt").getAbsolutePath());
       BufferedReader mapFileReader = new BufferedReader(mapReader);
       s = mapFileReader.readLine();
       }catch(IOException e){
          e.printStackTrace();
       }
       
       StringTokenizer st = new StringTokenizer(s, "(,)");
       while(st.hasMoreElements()){
        Map temp = new Map(st.nextToken());
        System.out.println(temp.Name);
        maps.add(temp);  
       }
       
   }
   
   public void setName(String s){
       name = s;
   }
   public void setNote(String s){
       note = s;
   }
   public String getName(){
       return name;
   }
   public String getNote(){
       return note;
   }
   public void setMapFlagTrue(String s){
       for(int i = 0; i <maps.size(); i++){
           if(maps.get(i).Name.equals(s)){
               Map temp = maps.get(i);
               temp.setMapTrue();
               maps.set(i,temp);
               break;
           }
       }
   }
   
   
   public void setMapFlagFalse(String s){
       for(int i = 0; i <maps.size(); i++){
           if(maps.get(i).Name.equals(s)){
               Map temp = maps.get(i);
               temp.setMapFalse();
               maps.set(i,temp);
               break;
           }
       }
   }
} 
