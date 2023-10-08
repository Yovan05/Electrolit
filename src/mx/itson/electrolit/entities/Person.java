
package mx.itson.electrolit.entities;

import mx.itson.electrolit.enums.State;

/**
 *
 * @author alexi
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private BirthDate birthDate;
    private boolean gender;
    private int state;

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
    public BirthDate getBirthdate() {
        return birthDate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(BirthDate birthdate) {
        this.birthDate = birthdate;
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
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }
    /**
     * Indicates the curp of a person
     * @return the String that indicates the person's curp
     */
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
        
        String gender = "";
        if(this.gender){
            gender = "H";
        }else{gender = "M";}
        
        String firstInternalConsonant = "";
        for(int i = 1 ; i < letters.length-1 ; i++){
            char character = letters[i];
            if(!(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')){
                firstInternalConsonant = String.valueOf(character);
                break;
            }
        }
        
        
        String firstSecondInternalConsonant = "";
        for(int i = 1 ; i < lettersTwo.length-1 ; i++){
            char character = lettersTwo[i];
            if(!(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')){
                firstSecondInternalConsonant = String.valueOf(character);
                break;
             }
        }
        
        String firstInternalConsonantName = "";
        for(int i = 1 ; i < lettersName.length-1 ; i++){
            char character = lettersName[i];
            if(!(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')){
                firstInternalConsonantName = String.valueOf(character);
                break;
             }
        }
        
        String quadrantConsonants = firstInternalConsonant+firstSecondInternalConsonant+firstInternalConsonantName;
        
        String century ="";
        if(birthDate.getYear()<2000){
            century = "0";
        }else{
            century = "A";
        }
        
 
        String curp=firstQuadrant+this.birthDate.birthDay()+gender+State.values()[state]+quadrantConsonants+century+1;
        return curp;
    }
    
    
    
    
}
