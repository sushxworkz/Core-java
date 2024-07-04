class Kajal{

	public static void main(String[] kajal ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	 
	 System.out.println("getFeatures method started");
	 
	 String brand="FACESCANADA";
	 String colour="Black";
	 String skinType="All";
	 String finishType="Metallic";
	int netQtyInCount=1;
	String coverage="Full";
	 int price=389;
	 
	 System.out.println("The Brand Name "+brand);
	 System.out.println("The Colour is"+colour);
	 System.out.println("The Skin Type is "+skinType);
	 System.out.println("The Finish Type is "+finishType);
	 System.out.println("The Net Qty In Count"+netQtyInCount);
	 System.out.println("The Special Coverge "+coverage);
	 System.out.println("The Price is "+price);
	 
	 System.out.println("getFeatures method ended");
	 return;
	 }
}
