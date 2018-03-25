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
public class Koło {

    public String nazwa_Figury;
    public float radius;

    public Koło(float radius) {
        this.nazwa_Figury = "Koło";
        this.radius = radius;
    }

    public void pokafigure() {
        System.out.println("Nazwa figury:" + " " + nazwa_Figury);
        System.out.println("Pole: " + Math.PI * Math.pow(radius, 2));
        System.out.println("Obwod: " + 2 * Math.PI * radius);

    }
}
