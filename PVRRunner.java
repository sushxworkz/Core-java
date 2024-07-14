class PVRRunner{

	public static void main(String movie[]){
	
		System.out.println("Main Started");
			 
			String name="udhan";
			double price=PVR.getMoviePricebyName(name);
			System.out.println("The price for:"+name+" is "+price);
		System.out.println("Main Ended");
	}
}
