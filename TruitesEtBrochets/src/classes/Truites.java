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
public class Truites {
    private int alevin;
    private int jeune;
    private int adulte;
    private int annee;
    
    public Truites(int alevin, int jeune, int adulte)
    {
        this.alevin=alevin;
        this.jeune=jeune;
        this.adulte=adulte;
        annee=0;
    }
    
    public void anneeSuivante(){
        //"sauvegardes" valeurs année précédente
        int alevins=alevin;
        int jeunes=jeune;
        int adultes=adulte;
        
        //parce que sinon le programme est chiant avec les pourcents et les int
        float jeunet;
        float adultet;
        
        //valeurs n+1
        alevin = adultes * 1500;
        jeunet = alevins * 0.003f;
        adultet = adultes * 0.1f + jeunes * 0.3f;
        
        //attribution pour les 2 valeurs reloues
        jeune = (int)jeunet;
        adulte = (int)adultet;
        
        annee += 1;
    }
    
    //affichage des valeurs pour l'année actuelle
    public void ToString (){
        System.out.println("Annee : "+annee);
        System.out.println("Nombre d'alevins : "+alevin);
        System.out.println("Nombre de jeunes : "+jeune);
        System.out.println("Nombre d'adultes : "+adulte);
    }
    
    public void Reinitialisation (int alevin, int jeune, int adulte){
        this.alevin=alevin;
        this.jeune=jeune;
        this.adulte=adulte;
        annee=0;
    }
}
