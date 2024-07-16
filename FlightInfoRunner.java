class FlightInfoRunner{

	public static void main(String flight[]){
	
		System.out.println("Main Started");
			 
			String name="Mumbai";
			int numberOfTicket=7;
			double price=FlightInfo.getFlightPriceByDestination(name);
			System.out.println("The destination name:"+name);
			System.out.println("The ticket price:"+price);
			System.out.println("The number of ticket: "+numberOfTicket);
			System.out.println("The total ticket price:" +numberOfTicket*price);
		System.out.println("Main Ended");
	}
}
