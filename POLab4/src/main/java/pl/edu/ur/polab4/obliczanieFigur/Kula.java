/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import static java.lang.Math.PI;

/**
 *
 * @author Kuba
 */
public class Kula {
    public String nazwa_Figury;
    public int radius;

    public Kula(int radius) {
        this.nazwa_Figury = "Kula";
        this.radius = radius;
    }
    
    public void pokafigure(){
        System.out.println("Nazwa figury:"+" "+nazwa_Figury);
        System.out.println("Pole:"+ 4*PI*radius*radius);
        System.out.println("Objętość:"+ 4/3*PI*radius*radius*radius);
    }
    
}
