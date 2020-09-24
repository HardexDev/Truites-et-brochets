/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ar826955
 */
public class Matrice {
    private int sizeX;
    private int sizeY;
    
    private int[][] tab = new int[sizeX][sizeY];
    
    public Matrice(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    
    public void setTab(int[][] tab){
        this.tab = tab;
    }
    
    public int[][] getTab(){
        return this.tab;
    }
    
    public int[][] multiply(Matrice m){
        int[][] res = new int[this.sizeX][this.sizeY];
        for (int i = 0 ; i<this.sizeX ; i++){
            for (int j = 0 ; j<this.sizeY ; j++){
                res[i][j] = 0;
                for (int k=0 ; k<sizeX ; k++){
                    res[i][j] += this.tab[i][k]*m.getTab()[k][j];
                }
            }
        }
        
        return res;
        
    }
    
    public void printMatrix(){
        for (int i=0 ; i<2 ; i++){
            for (int j =0 ; j<2 ; j++){
                System.out.print(tab[i][j]);
            }
            
            System.out.println();
        }
    }
    
}
