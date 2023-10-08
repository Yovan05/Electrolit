/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.electrolit.ui;

import mx.itson.electrolit.entities.BirthDate;
import mx.itson.electrolit.entities.Person;
import mx.itson.electrolit.enums.Month;

/**
 *
 * @author alexi
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        BirthDate b1 = new BirthDate();
        b1.setDay(29);
        b1.setMonth(Month.DECEMBER);
        b1.setYear(2004);
        
        Person p1 = new Person();
        
        p1.setLastName("Rodriguez Vallejo");
        p1.setFirstName("Yovan Alexis");
        p1.setGender(true);
        p1.setBirthdate(b1);
        p1.setState(25);
        
        String avance = p1.curp();
        System.out.println(avance);
    }
    
}
