class WashingPowder{

	public static void main(String[] powder){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Surf Excel";
			int numberofItems=1;
			String itemForm	="Liquid";
			String 	netQuantity="4000.0 millilitre";
			String specificUsesForProduct	="All";
			String scent	="Fresh";
			int itemWeightInGrams=4000;
			int price=570;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Number of Items"+numberofItems);
			System.out.println("The itemForm"+itemForm);
			System.out.println("The Net Quantity "+netQuantity);
			System.out.println("The  specific Uses For Product	 "+specificUsesForProduct	);
			System.out.println("The Scent "+scent);
			System.out.println("The Item Weight In Grams  is "+itemWeightInGrams);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}