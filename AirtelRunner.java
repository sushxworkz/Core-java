class AirtelRunner{
	public static void main(String airtel[]){
	
		System.out.println("Main Started");
		
			String plan="15.0 GB package";
			double price=Airtel.getPriceByPlan(plan);
			System.out.println("The price for:"+plan+ " is " +price);
			
		System.out.println("Main Ended");
	}
}
			