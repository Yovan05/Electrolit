
package mx.itson.electrolit.entities;



import java.util.List;
import mx.itson.electrolit.enums.Month;

/**
 * 
 * @author alexi
 */
public class BirthDate {
 
    private int day;
    private Month month;
    private int year;
    
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public Month getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(Month month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * Converts the BirthDate class to a String with AA/MM/DD format
     * @return String with the day of birth in AA/MM/DD format
     */
   public String birthDay(){
       
       String day="";
       if(this.day<10){
           day ="0"+this.day;
       }else{
           day =this.day+"";
       }
       
       String mounth="";
       
       if(1+this.month.ordinal()<10){
        mounth = "0"+(1+this.month.ordinal())+"";
       }else{
           mounth = 1+this.month.ordinal()+"";
       }
       
       String year = this.year+"";
       String lastDigits = "";
       char [] position = year.toCharArray();
       for(int i = 0; i<year.length(); i++){
           if(i>1){
               String digitYear = String.valueOf(position[i]);
               lastDigits += digitYear;
           }
       }
       String birthDay = lastDigits+mounth+day;
       return birthDay;
   }



    

    }
    
    
    
    
    
    
    
    
    
    
   
