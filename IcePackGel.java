class IcePackGel{

	public static void main(String[] gel){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="VIFITKIT";
			int numberofItems=1;
			String ageRange	="Adult";
			String 	specialFeature	="Portable, Reusable";
			String usefor	="Eyes, Back, Neck";
			String material	="Plastic";
			String colour="Blue";
			int price=151;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Number of Items"+numberofItems);
			System.out.println("The Age Range "+ageRange);
			System.out.println("The SpeciaFeature  "+specialFeature);
			System.out.println("The  Use for	 "+usefor	);
			System.out.println("The  material "+material);
			System.out.println("The  Colour"+ colour);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}

