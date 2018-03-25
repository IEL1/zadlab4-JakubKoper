/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Kuba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("ZADANIE NUMER 4!!!");
        System.out.println("Podaj numer figury geometrycznej\n" + "1 - Koło\n" + "2 - Kwadrat\n" + "3 - Prostokąt\n" + "4 - Sześcian\n" + "5 - Prostopadłościan\n" + "6 - Kula\n" + "7 - Stozek\n");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("Podaj promień koła");
                Scanner fig1 = new Scanner(System.in);
                int radius = fig1.nextInt();

                Koło koło1 = new Koło(radius);
                koło1.pokafigure();
                break;
            case 2:
                System.out.println("Podaj bok kwadratu");
                Scanner fig2 = new Scanner(System.in);
                int bok = fig2.nextInt();

                Kwadrat kw1 = new Kwadrat(bok);
                kw1.pokafigure();
                break;
            case 3:
                System.out.println("Podaj pierwszy bok prostokąta");
                Scanner bok1 = new Scanner(System.in);
                int a = bok1.nextInt();

                System.out.println("Podaj drugi bok prostokąta");
                Scanner bok2 = new Scanner(System.in);
                int b = bok2.nextInt();

                Prostokąt prostokat = new Prostokąt(a, b);
                prostokat.pokafigure();
                break;
            case 4:
                System.out.println("Podaj bok sześcianu");
                Scanner bokszes = new Scanner(System.in);
                int c = bokszes.nextInt();

                Sześcian sześcian = new Sześcian(c);
                sześcian.pokafigure();
                break;
            case 5:
                System.out.println("Podaj pierwszy bok prostopadłościanu");
                Scanner bokpros1 = new Scanner(System.in);
                int d = bokpros1.nextInt();

                System.out.println("Podaj drugi bok prostopadłościanu");
                Scanner bokpros2 = new Scanner(System.in);
                int e = bokpros2.nextInt();

                System.out.println("Podaj trzeci bok prostopadłościanu");
                Scanner bokpros3 = new Scanner(System.in);
                int f = bokpros3.nextInt();

                Prostopadłościan prostopadłościan = new Prostopadłościan(d, e, f);
                prostopadłościan.pokafigure();
                break;

            case 6:
                System.out.println("Podaj promień kuli");
                Scanner radiuskula = new Scanner(System.in);
                int radiuskula1 = radiuskula.nextInt();

                Kula kula = new Kula(radiuskula1);
                kula.pokafigure();
                break;

            case 7:
                System.out.println("Podaj promień stożka");
                Scanner radiusstozek = new Scanner(System.in);
                int radiusstozek1 = radiusstozek.nextInt();

                System.out.println("Podaj wysokość stożka");
                Scanner hstozek = new Scanner(System.in);
                int hstozek1 = hstozek.nextInt();

                System.out.println("Podaj tworzącą stożka");
                Scanner tworzacastozek = new Scanner(System.in);
                int tworzacastozek1 = tworzacastozek.nextInt();

                Stożek stożek = new Stożek(radiusstozek1, hstozek1, tworzacastozek1);
                stożek.pokafigure();
                break;
        }
    }
}
