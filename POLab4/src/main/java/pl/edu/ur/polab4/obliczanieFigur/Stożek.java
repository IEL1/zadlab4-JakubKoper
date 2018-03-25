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
public class Stożek {

    public String nazwa_Figury;
    public int radsto, hsto, twosto;

    public Stożek(int radsto, int hsto, int twosto) {
        this.nazwa_Figury = "Stożek";
        this.radsto = radsto;
        this.hsto = hsto;
        this.twosto = twosto;
    }

    public void pokafigure() {
        double pc = PI * radsto * radsto + PI * radsto * twosto;
        double obj = (PI * radsto * radsto * hsto)/3;
        System.out.println("Nazwa figury:" + " " + nazwa_Figury);
        System.out.println("Pole całkowite: " + pc);
        System.out.println("Objętość: " + obj);
    }

}
