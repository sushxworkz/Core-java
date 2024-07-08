class SmartWatch{

	public static void main(String[] watch){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Amazfit Huami AMOLED";
			String colour="Gold";
			int size=23;
			String operatingSystem="IOS & Android";
			String specialFeature	="Heart Rate Monito";
			String  connectivityTechnology	="Wireless";
			String batteryCellComposition="Lithium Ion";
			int price=4499;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Colour "+colour);
			System.out.println("The Size"+size);
			System.out.println("The operating System"+operatingSystem);
			System.out.println("The special Feature "+ specialFeature);
			System.out.println("The connectivity Technology"+ connectivityTechnology);
			System.out.println("The  battery Cell Composition  "+ batteryCellComposition);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
 