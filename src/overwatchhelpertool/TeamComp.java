/*
 * the base structure of a teamcomp
 */
package overwatchhelpertool;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Phillip Bomholtz
 */
public class TeamComp {
   private String name;          //the name of the comp
   private String note;          //the entered note
   private List<Map> maps;       //a list of maps of map struct
   private String Hero1;         //name of hero
   private String Hero2;         //name of hero
   private String Hero3;         //name of hero
   private String Hero4;         //name of hero
   private String Hero5;         //name of hero
   private String Hero6;         //name of hero

   
   public TeamComp(){
       
   }
   
   public TeamComp(String compName,String Note){
       name = compName;
   }
} 
