/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uv1;

import clavier.Lire;

/**
 *
 * @author btssio
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int longueur;   // longueur du rectangle
        int largeur;    // largueur du rectangle
        int surface;    // surface du rectangle

        // Corps du programme
         // Corps du programme
        System.out.println("Donnez la longueur : ");
        longueur = Lire.i();
        System.out.println("Donnez la largeur : ");
        largeur = Lire.i();
        surface = longueur * largeur;
        System.out.println("La surface du rectangle est : " + surface);
    }
    
}
