class AirtelRunner{
	public static void main(String airtel[]){
	
		System.out.println("Main Started");
		
			String plan="15.0 GB package";
			double price=Airtel.getPriceByPlan(plan);
			int numberOfPack=9;
			System.out.println("The airtel plan: "+plan);
			System.out.println("The airtel pack price: "+price);
			System.out.println("The number of pack: "+ numberOfPack);
			System.out.println("The total pack price: "+ numberOfPack*price);
			
			
		System.out.println("Main Ended");
	}
}
			