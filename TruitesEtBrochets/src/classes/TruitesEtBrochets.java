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
        Truites truites2 = new Truites(0,0,200);
        Truites truites3 = new Truites(0,0,200);
        
        
        truites1.anneeSuivante();
        truites2.anneeSuivante();
        truites2.anneeSuivante();
        truites3.anneeSuivante();
        truites3.anneeSuivante();
        truites3.anneeSuivante();
        
        
        truites1.ToString();
        truites2.ToString();
        truites3.ToString();
    }
    
}
