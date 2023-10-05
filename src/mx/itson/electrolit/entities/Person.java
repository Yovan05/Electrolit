
package mx.itson.electrolit.entities;

import mx.itson.electrolit.enums.State;

/**
 *
 * @author alexi
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String birthDate;
    private boolean gender;
    private State state;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }
    
    public String curp(){
    
        String [] surnames =this.lastName.toUpperCase().split(" ");
        char[] letters = surnames[0].toCharArray();
        String firstPart = "";
        for(char i : letters){
            if(i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U'){
                firstPart = String.valueOf(letters[0])+String.valueOf(i);
                break;
            }
        }
        char[] lettersTwo = surnames[1].toCharArray();
        char[] lettersName = this.firstName.toUpperCase().toCharArray();
        String firstQuadrant = firstPart+lettersTwo[0]+lettersName[0];
        
        String curp="";
        return firstQuadrant;
    }
    
    
    
    
}
