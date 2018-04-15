/* 
*    AUTHOR : Maclyn Afonso
*/
package qacinema;

import java.util.*;

public class Movie 
{
    private int numTickets=50;
    private Map<String,Integer> map; //String : Movie Name and Integer : Number of Available Seats
    
    public Movie()
    {
        map=new HashMap<String,Integer>();
        map.put("The Incredibles 2 2018",numTickets);  
        map.put("Isle of Dogs (2018)",numTickets);  
        map.put("Peter Rabbit (2018)",numTickets); 
        map.put("Sherlock Gnomes (2018)",numTickets); 
        map.put("Batman Ninja (2018)",numTickets); 
    }
    public Map<String,Integer> getMovieListings()
    {
        return this.map;
    }
    public int getNumberOfTicketsAvailable(String mname) 
    {
        for(Map.Entry m:map.entrySet())
        {  
            if(m.getKey().toString().equalsIgnoreCase(mname))
                return (int)m.getValue();  
        }  
        return 0;
    }
}
