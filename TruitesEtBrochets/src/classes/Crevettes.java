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
    private float adultes;
    private float larves;
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
        larves = adultes * 40000;
        adultes = adultes * 0.1f + larves * 0.0001f;
        
        //Renvoie des valeurs changé
        this.larves = larve;
        this.adultes = adulte;        
        
    }
    
    private void ToString()
    {
        System.out.println("Annee : "+annee);
        System.out.println("Nombre de larves : "+larves);
        System.out.println("Nombre d'adultes : "+adultes);
        
    }
    
}