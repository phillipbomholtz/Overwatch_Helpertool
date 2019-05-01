/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overwatchhelpertool;

/**
 *
 * @author phill
 */
public class Scheduler {
    
    
    private class player{
        private double[] timeStretches;
        private String name;
        
        public player(String name, int streches){
            this.timeStretches = new double[streches];
            this.name = name;
        }
    }
    
    private player playerOne;
    
    public Scheduler(String name, int streches, double[] arr){
        this.playerOne = new player(name,streches);
        playerOne.timeStretches = arr;
    }
    
    
}
