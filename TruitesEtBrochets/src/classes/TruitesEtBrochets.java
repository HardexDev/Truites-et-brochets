/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author guifa
 */
public class TruitesEtBrochets {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
       
       Crevettes c = new Crevettes();
       Truites t = new Truites();
       Brochets b = new Brochets();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Quelle population voulez vous étudier ? (Crevettes : c | Truites : t | Brochets : b");
       String choix = sc.next();
       
       switch(choix){
           case "c" :
               System.out.println(c.toString());
               break;
           case "t" :
               System.out.println(t.toString());
               break;
           case "b" :
               System.out.println(b.toString());
           default:
               System.out.println("Cette population n'existe pas");
               
       }
       
       
       
        
    }
    
}
