class FootWear{

	public static void main(String[] footWear ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	 
	 System.out.println("getFeatures method started");
	 
	 String brand="Puma";
	 String colour="Black";
	 int size=6;
	 String materialType="Leather";
	 String type="Party Wear";
	 String heelType="High heel";
	 int price=1200;
	 
	 System.out.println("The Brand Name "+brand);
	 System.out.println("The Colour is"+colour);
	 System.out.println("The Size is "+size);
	 System.out.println("The Material Type "+materialType);
	 System.out.println("The Type "+type);
	 System.out.println("The Heel Type "+heelType);
	 System.out.println("The Price is "+price);
	 
	 System.out.println("getFeatures method ended");
	 return;
	 }
}