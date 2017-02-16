/*This class creates two methods used to get information from the program user*/

import java.util.Scanner;

public class VehicleUtil 
{
	static Scanner input = new Scanner(System.in) ;

	static String queryString (String getUserString) 
	{
		String entry ;
		
		System.out.print (getUserString);
		entry = input.nextLine().trim() ;

		return entry ;
	}

	static int queryInt (String getUserInt) 
	{
		String entry ;
		int entryInt ;
		System.out.print (getUserInt) ;
		entry = input.nextLine().trim() ;
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
}





