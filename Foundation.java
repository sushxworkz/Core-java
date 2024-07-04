class Foundation{

	public static void main(String[] fiundation ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	 
	 System.out.println("getFeatures method started");
	 
	 String brand="Maybelline";
	 String colour="115 Ivory";
	 String skinType="Oily";
	 String finishType="Matte";
	 String itemForm="Lotion";
	 String coverage="medium";
	 int price=389;
	 
	 System.out.println("The Brand Name "+brand);
	 System.out.println("The Colour is"+colour);
	 System.out.println("The Skin Type is "+skinType);
	 System.out.println("The Item Form"+itemForm);
	 System.out.println("The Finish Type is "+finishType);
	 System.out.println("The Special Coverge "+coverage);
	 System.out.println("The Price is "+price);
	 
	 System.out.println("getFeatures method ended");
	 return;
	 }
}
