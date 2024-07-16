class PVRRunner{

	public static void main(String movie[]){
	
		System.out.println("Main Started");
			 
			String name="udhan";
			double price=PVR.getMoviePricebyName(name);
			int numberOfTicket=5;
			System.out.println("The movie name: "+name);
			System.out.println("The movie price: "+price);
			System.out.println("The number of movie ticket: "+numberOfTicket);
			System.out.println("The total ticket price : "+numberOfTicket*price);
		System.out.println("Main Ended");
	}
}
