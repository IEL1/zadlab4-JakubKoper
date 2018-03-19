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
public class DaneStudenta {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski");
        student1.pokazDane();
        
        System.out.println("---------------------");
        Student student2 = new Student("Anna", "Wiśniewska", 201203, "Informatyk");
        student2.pokazDane();
}
}
