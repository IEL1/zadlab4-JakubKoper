/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {

    public String imie;      //
    public String nazwisko;  // Pola klasy osoba
    public int nr_indeksu;
    public String nazwa_specjalności;
    public String rok_studiów;

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalności, String rok_studiów) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalności = nazwa_specjalności;
        this.rok_studiów = rok_studiów;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalności) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalności = nazwa_specjalności;
    }

    public Student(String imie, String nazwisko, String nazwa_specjalności, String rok_studiów) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalności = nazwa_specjalności;
        this.rok_studiów = rok_studiów;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Nr. Indeks: " + this.nr_indeksu);
        System.out.println("Nazwa Specjalności: " + this.nazwa_specjalności);
        System.out.println("Rok Studiów: " + this.rok_studiów);
    }
}
