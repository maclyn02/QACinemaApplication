/* 
*    AUTHOR : Maclyn Afonso
*/
package qacinema;

public interface Ticket
{
    public String TICKET_OFFSET="TKT";
    
    public int TICKET_BOOKING_ID=1000;
    
    //Same method names with multiple argument lists ----EXAMPLE OF POLYMORPHISM
    public void setTicketTotal(int t);
    public void setTicketTotal(String t);
    public void setNumberOfTickets(int t); 
    public void setNumberOfTickets(String t);
    public int getTicketTotal();
    public int getNumberOfTickets();
    public String generateTicketID();
    public void updateTicketBookingId();    
}
