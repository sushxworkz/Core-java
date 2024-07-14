class FlightInfoRunner{

	public static void main(String flight[]){
	
		System.out.println("Main Started");
			 
			String name="Mumbai";
			double price=FlightInfo.getFlightPriceByDestination(name);
			System.out.println("The price for:"+name+" is "+price);
		System.out.println("Main Ended");
	}
}
