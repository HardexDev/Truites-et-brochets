package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guifa
 */
public class Crevettes {
    private int adultes;
    private int larves;
    private int annee;
    
    public Crevettes(int larves, int adultes)
    {
        this.adultes = adultes;
        this.larves = larves;
        this.annee = 0;
    }
    
    public void anneeSuivante(){
        //Création de nouvelle variable pour stocker les nouvelles valeurs
        float larve = larves;
        float adulte = adultes;
        
        //Changement des valeurs à l'année n+1
        larve = adultes * 40000;
        adulte = adultes * 0.1f + larves * 0.0001f;
        
        //Renvoie des valeurs changé
        this.larves = (int)larve;
        this.adultes = (int)adulte;  
        
        annee += 1;
        
    }
    
    public void ToString()
    {
        System.out.println("Annee : "+annee);
        System.out.println("Nombre de larves : "+larves);
        System.out.println("Nombre d'adultes : "+adultes);
        
    }
    
}