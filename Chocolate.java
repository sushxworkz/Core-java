class Chocolate{

	public static void main(String[] dairyMilk){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	 
	 System.out.println("getFeatures method started");
	 
	 String name="Dairy Milk";
	 String colour="Brown";
	 String countryofOrigin="India";
	 String shelfLife="12 months";
	int netQtyInCount=1;
	String coverage="Full";
	 int price=200;
	 
	 System.out.println("The Brand Name "+name);
	 System.out.println("The Colour is"+colour);
	 System.out.println("The Country of Originis "+countryofOrigin);
	 System.out.println("The Shelf Life is "+shelfLife);
	 System.out.println("The Net Qty In Count"+netQtyInCount);
	 System.out.println("The Special Coverge "+coverage);
	 System.out.println("The Price is "+price);
	 
	 System.out.println("getFeatures method ended");
	 return;
	 }
}
