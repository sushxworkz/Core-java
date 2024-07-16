class FlightInfo{

	public static double getFlightPriceByDestination(String flightDestinationName){
		double flightPrice=0.0;
		
			System.out.println("Start of getFlightPriceByDestination");
			if(flightDestinationName=="pune")return flightPrice=4000.00;
		 
			if(flightDestinationName=="Mumbai")return flightPrice=5000.00;
		
			if(flightDestinationName=="belagavi")return   flightPrice=7000.00;
		 
			if(flightDestinationName=="Benglore")return flightPrice=7800.00;
		 
			if(flightDestinationName=="japan")return flightPrice=100000.00;
		 
			if(flightDestinationName=="jaipur")return flightPrice=78000.00;
		 
			if(flightDestinationName=="patna")return flightPrice=7800.00;
		  
			if(flightDestinationName=="kolkata")return flightPrice=7890.00;
		  
			if(flightDestinationName=="laknow")return  flightPrice=9000.00;
		  
			if(flightDestinationName=="USA")return  flightPrice=59000.00;
		 
			if(flightDestinationName=="Kerala")return flightPrice=34000.00;
		  
			if(flightDestinationName=="Chennai")return  flightPrice=68000.00;
		  
			if(flightDestinationName=="Manglore")return flightPrice=9876.00;
		 
			if(flightDestinationName=="hubli")return   flightPrice=7000.00;
		  
			if(flightDestinationName=="south koria")return flightPrice=679900.00;
		  
			if(flightDestinationName=="japan")return  flightPrice=99999.00;
		  
			if(flightDestinationName=="paries")return   flightPrice=98675.00;
		  
			if(flightDestinationName=="Shivmogga")return flightPrice=56990.00;
		 
			if(flightDestinationName=="Kolkatta")return flightPrice=76543.00;
		  
			if(flightDestinationName=="America")return flightPrice=56900.00;
		  
		  else {
					System.out.println(flightDestinationName +"not found");
				}
			System.out.println("End  of getFlightPriceByDestination");
				return flightPrice;
	}
	
	
	public static double getFlightPriceByDestination(String flightDestinationName,int numberOfTicket ){
		double flightPrice=0.0;
		
			System.out.println("Start of getFlightPriceByDestination");
			if(flightDestinationName=="pune")return flightPrice=4000.00*numberOfTicket;
		 
			if(flightDestinationName=="Mumbai")return flightPrice=5000.00*numberOfTicket;
		
			if(flightDestinationName=="belagavi")return   flightPrice=7000.00*numberOfTicket;
		 
			if(flightDestinationName=="Benglore")return flightPrice=7800.00*numberOfTicket;
		 
			if(flightDestinationName=="japan")return flightPrice=100000.00*numberOfTicket;
		 
			if(flightDestinationName=="jaipur")return flightPrice=78000.00*numberOfTicket;
		 
			if(flightDestinationName=="patna")return flightPrice=7800.00*numberOfTicket;
		  
			if(flightDestinationName=="kolkata")return flightPrice=7890.00*numberOfTicket;
		  
			if(flightDestinationName=="laknow")return  flightPrice=9000.00*numberOfTicket;
		  
			if(flightDestinationName=="USA")return  flightPrice=59000.00*numberOfTicket;
		 
			if(flightDestinationName=="Kerala")return flightPrice=34000.00*numberOfTicket;
		  
			if(flightDestinationName=="Chennai")return  flightPrice=68000.00*numberOfTicket;
		  
			if(flightDestinationName=="Manglore")return flightPrice=9876.00*numberOfTicket;
		 
			if(flightDestinationName=="hubli")return   flightPrice=7000.00*numberOfTicket;
		  
			if(flightDestinationName=="south koria")return flightPrice=679900.00*numberOfTicket;
		  
			if(flightDestinationName=="japan")return  flightPrice=99999.00*numberOfTicket;
		  
			if(flightDestinationName=="paries")return   flightPrice=98675.00*numberOfTicket;
		  
			if(flightDestinationName=="Shivmogga")return flightPrice=56990.00*numberOfTicket;
		 
			if(flightDestinationName=="Kolkatta")return flightPrice=76543.00*numberOfTicket;
		  
			if(flightDestinationName=="America")return flightPrice=56900.00*numberOfTicket;
		  
		  else {
					System.out.println(flightDestinationName +"not found");
				}
			System.out.println("End  of getFlightPriceByDestination");
				return flightPrice;
	}
}	
	



 


