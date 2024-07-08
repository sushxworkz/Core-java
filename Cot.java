class Cot{

	public static void main(String[] cot ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	
		System.out.println("getFeatures method started");
		
		String size="King";
		String material="Rose Wood";
		String colour="White Matt";
		String includedComponents="King";
		String brand="Wakefit";
		String assemblyRequired="Yes";
		String manufacturer="Wakefit Innovations Pvt. Ltd., 9883333123";
		int price=28897;
		
		System.out.println("The Size is "+size);
		System.out.println("The Material is "+material);
		System.out.println("The Colour is "+colour);
		System.out.println("The Included Components is "+includedComponents);
		System.out.println("The Brand Name "+size);
		System.out.println("The Assembly Requiredis "+assemblyRequired);
		System.out.println("The manufacturer is "+manufacturer);
		System.out.println("The price is "+price);
		
		System.out.println("getFeatures method ended");
		return;
	}
}