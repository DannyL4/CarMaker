/*This class creates two methods used to get information from the program user*/

import java.util.*;

public class ListingUtil 
{
	public enum ListingType {CAR, SPORTSCAR, TRUCK, MOTORCYCLE, BOAT, JETSKI} ;
    static Scanner scanIn = new Scanner(System.in) ;

    static String queryString (String prompt)
    {
        // Returns null for no response
        String entry ;
        System.out.print (prompt) ;
        entry = scanIn.nextLine() ;
        if (entry.length() == 0) 
        {
        	entry = null ;
        }
        
        return entry ;
    }
    
    static int queryInt (String prompt)
    {
        // Return 0 (zero) for no response
        String entry ;
        int entryInt ;
        System.out.print (prompt) ;
        entry = scanIn.nextLine() ;
        if (entry.length() == 0)
        {
            entryInt = 0 ;
        }
        else
        {
            entryInt = Integer.parseInt (entry) ;
        }
        
        return entryInt ;
    }
    
    static float queryFloat (String prompt)
    {
        // Returns 0f for no response
        String entry ;
        float entryFloat ;
        System.out.print (prompt) ;
        entry = scanIn.nextLine() ;
        if (entry.length() == 0)
        {
            entryFloat = 0f ;
        }
        else
        {
            entryFloat = Float.parseFloat (entry) ;
        }
        
        return entryFloat ;
    }
}





