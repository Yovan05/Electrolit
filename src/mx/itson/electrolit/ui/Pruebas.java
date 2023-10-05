/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.electrolit.ui;

import mx.itson.electrolit.entities.Person;

/**
 *
 * @author alexi
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Person p1 = new Person();
        
        p1.setLastName("Rodriguez Vallejo");
        p1.setFirstName("Yovan Alexis");
        p1.setGender(true);
        
        String avance = p1.curp();
        System.out.println(avance);
    }
    
}
