/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author guifa
 */
public class TruitesEtBrochets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Truites truites1 = new Truites(0,0,200);
        
        
        truites1.anneeSuivante();
        
        truites1.ToString();
        
        truites1.anneeSuivante();
        
        truites1.ToString();
        
        truites1.anneeSuivante();
        
        truites1.ToString();

        
        Crevettes crevette1 = new Crevettes(0,1000);
        crevette1.toString();
        
        for (int i=0; i<=5; i++){
            crevette1.anneeSuivante();
            crevette1.toString();

        }
        
    }
    
}
