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
public class Sześcian {
    public String nazwa_Figury;
    public int bok;

    public Sześcian(int bok) {
        this.nazwa_Figury = "Sześcian";
        this.bok = bok;
    }

    public void pokafigure() {
        System.out.println("Nazwa figury:" + " " + nazwa_Figury);
        System.out.println("Pole całkowite: " + bok*bok*6);
        System.out.println("Objętość: " + bok*bok*bok);

    }
}

