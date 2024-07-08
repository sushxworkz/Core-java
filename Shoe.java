class Shoe{

	public static void main(String[] shoe ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	 
	 System.out.println("getFeatures method started");
	 
	 String brand="Nike";
	 String colour="Grey";
	 int size=7;
	 String materialType="Mesh";
	 String style="Running Shoes";
	 String heelType="Flat";
	 int price=704;
	 
	 System.out.println("The Brand Name "+brand);
	 System.out.println("The Colour is"+colour);
	 System.out.println("The Size is "+size);
	 System.out.println("The Material Type "+materialType);
	 System.out.println("The Style "+style);
	 System.out.println("The Heel Type "+heelType);
	 System.out.println("The Price is "+price);
	 
	 System.out.println("getFeatures method ended");
	 return;
	 }
}