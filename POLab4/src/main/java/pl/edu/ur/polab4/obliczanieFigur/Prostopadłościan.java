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
public class Prostopadłościan {

    public String nazwa_Figury;
    public int bok1, bok2, bok3;

    public Prostopadłościan(int bok1, int bok2, int bok3) {
        this.nazwa_Figury = "Prostopadłościan";
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }
    
    public void pokafigure(){
        int pc = 2*bok1*bok2 + 2*bok1*bok3 + 2*bok2*bok3;
        System.out.println("Nazwa figury:"+" "+nazwa_Figury);
        System.out.println("Pole całkowite:"+ pc);
        System.out.println("Objętość:"+ bok1*bok2*bok3);
    }
    
}
