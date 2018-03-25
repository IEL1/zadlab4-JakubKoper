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
public class Prostokąt {

    public String nazwa_Figury;
    public float bok1, bok2;

    public Prostokąt(float bok1,float bok2) {
        this.nazwa_Figury = "Kwadrat";
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public void pokafigure() {
        float obw = 2*bok1 + 2*bok2;
        System.out.println("Nazwa figury:" + " " + nazwa_Figury);
        System.out.println("Pole: " + bok1 * bok2);
        System.out.println("Obwod: " +obw);

    }
}
