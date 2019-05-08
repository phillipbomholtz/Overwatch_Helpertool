/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

/**
 *
 * @author Phillip
 */
public class Map {
    protected String Name;
    protected boolean enableFlag = false;
    
    public Map(String name){
        this.Name = name;
    }
    
    public void setMapTrue(){
        enableFlag = true;
    }
    
    public void setMapFalse(){
        enableFlag = false;
    }
}
