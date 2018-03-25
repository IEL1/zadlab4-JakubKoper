/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Kuba
 */
public class Kwadrat {
    public String nazwa_Figury;
    public float bok;
    
    public Kwadrat(float bok) {
        this.nazwa_Figury = "Kwadrat";
        this.bok = bok;
    }

    public void pokafigure() {
        System.out.println("Nazwa figury:" + " " + nazwa_Figury);
        System.out.println("Pole: " + bok * bok);
        System.out.println("Obwod: " + 4*bok);

    }
}
