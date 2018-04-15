/* 
*    AUTHOR : Maclyn Afonso
*/
package qacinema;

public class Booking extends PricePolicy
{
   private int no_std;
   private int no_oap;
   private int no_student;
   private int no_child;
   
   public Booking()
   {
       initPricePolicy(); //Call to method in PrivacyPolicy
   }
   public void setValues(int s,int o,int st,int c)
   {
       this.no_std=s;
       this.no_oap=o;
       this.no_student=st;
       this.no_child=c;
   }
   public int calcAmount()
   {
       //Using methods inherited from parent class -----EXAMPLE OF INHERITANCE
       int amt=(getStd()*this.no_std)+(getOap()*this.no_oap)+(getStudent()*this.no_student)+(getChild()*this.no_child)-(getDiscount());
       return amt;
   }   
}
