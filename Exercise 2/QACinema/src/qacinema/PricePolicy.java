/* 
*    AUTHOR : Maclyn Afonso
*/
package qacinema;

import java.time.LocalDate;

//Abstract Class - Object not created
public abstract class PricePolicy 
{    
    //General pricing options
    private int std=8;
    private int oap=6;
    private int student=6;
    private int child=4;
    private String discountDay="wednesday";
    private int discountAmount=2;
    private int custDiscount;
    
    public void initPricePolicy()
    {
        //Set Discount Based on current booking day
        LocalDate localDate = LocalDate.now();
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        if(dayOfWeek.toString().equalsIgnoreCase(discountDay))
            custDiscount=discountAmount;
        else
            custDiscount=0;
    }
    
    //Getter() and Setter() methods to access private variables  -----EXAMPLE OF ENCAPSULATION
    public int getStd()
    {
        return this.std;
    }
    public int getOap()
    {
        return this.oap;
    }
    public int getStudent()
    {
        return this.student;
    }
    public int getChild()
    {
        return this.child;
    }
    public int getDiscount()
    {
        return this.custDiscount;
    }
}
