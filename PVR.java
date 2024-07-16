class PVR{

	public static double getMoviePricebyName(String movieName){
		double moviePrice=0.0;
		  
		 if(movieName=="kgf")return moviePrice=230.00;

		 if(movieName=="kgf 2")return moviePrice=300;
		 
		 if(movieName=="koti")return moviePrice=300.00;
		 
		 if(movieName=="vivah")return moviePrice=200.00;
		 
		 if(movieName=="katera")return moviePrice=209.00;
		 
		 if(movieName=="kantara")return moviePrice=389.00;
		 
		 if(movieName=="Ham saat saat")return moviePrice=430.00;
		 
		 if(movieName=="Ramachari")return  moviePrice=666.00;
		 
		 if(movieName=="Manjhara")return moviePrice=333.00;
		
		 if(movieName=="Darani Mandala")return  moviePrice=430.00;
		 
		 if(movieName=="Jessie")return moviePrice=220.00;
		 
		 if(movieName=="Hosa Dinachari")return moviePrice=360.00;
		 
		 if(movieName=="Jab hai jaan")return moviePrice=120.00;
		 
		 if(movieName=="lagan")return  moviePrice=380.00;
		 
		 if(movieName=="rang de basanti")return moviePrice=370.00;
		 
		 if(movieName=="koshish")return  moviePrice=500.00;
		 
		 if(movieName=="3 idiots")return moviePrice=430.00;
		 
		 if(movieName=="udhan")return moviePrice=220.00;
		 
		 if(movieName=="Bahubali")return  moviePrice=392.00;
		 
		 if(movieName=="bahubali 2")return moviePrice=223.00;
		 
		else {
					System.out.println(movieName +"not found");
				}
				return moviePrice;
	}
	
	public static double getMoviePricebyName(String movieName,int numberOfTicket){
		double moviePrice=0.0;
		  
		 if(movieName=="kgf")return moviePrice=230.00 *numberOfTicket;

		 if(movieName=="kgf 2")return moviePrice=300*numberOfTicket;
		 
		 if(movieName=="koti")return moviePrice=300.00*numberOfTicket;
		 
		 if(movieName=="vivah")return moviePrice=200.00*numberOfTicket;
		 
		 if(movieName=="katera")return moviePrice=209.00*numberOfTicket;
		 
		 if(movieName=="kantara")return moviePrice=389.00*numberOfTicket;
		 
		 if(movieName=="Ham saat saat")return moviePrice=430.00*numberOfTicket;
		 
		 if(movieName=="Ramachari")return  moviePrice=666.00*numberOfTicket;
		 
		 if(movieName=="Manjhara")return moviePrice=333.00*numberOfTicket;
		
		 if(movieName=="Darani Mandala")return  moviePrice=430.00*numberOfTicket;
		 
		 if(movieName=="Jessie")return moviePrice=220.00*numberOfTicket;
		 
		 if(movieName=="Hosa Dinachari")return moviePrice=360.00*numberOfTicket;
		 
		 if(movieName=="Jab hai jaan")return moviePrice=120.00*numberOfTicket;
		 
		 if(movieName=="lagan")return  moviePrice=380.00*numberOfTicket;
		 
		 if(movieName=="rang de basanti")return moviePrice=370.00*numberOfTicket;
		 
		 if(movieName=="koshish")return  moviePrice=500.00*numberOfTicket;
		 
		 if(movieName=="3 idiots")return moviePrice=430.00*numberOfTicket;
		 
		 if(movieName=="udhan")return moviePrice=220.00*numberOfTicket;
		 
		 if(movieName=="Bahubali")return  moviePrice=392.00*numberOfTicket;
		 
		 if(movieName=="bahubali 2")return moviePrice=223.00*numberOfTicket;
		 
		else {
					System.out.println(movieName +"not found");
				}
				return moviePrice;
	}
}	
	