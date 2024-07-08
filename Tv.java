class Tv{

	public static void main(String[] tv){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Uv";
			int resolution=4;
			String displayTechnology	="LED";
			String screenSize="43 Inches";
			String refreshRate	="	60 Hz";
			String aspectRatio	="16:9k";
			String includedComponent="1-TV Unit";
			int price=27000;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Resolution"+resolution);
			System.out.println("The  Display Technology"+ displayTechnology);
			System.out.println("The  Screen Size "+ screenSize);
			System.out.println("The   Refresh Rate	 "+ refreshRate	);
			System.out.println("The includedComponent "+includedComponent);
			System.out.println("The aspectRatio "+aspectRatio);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}