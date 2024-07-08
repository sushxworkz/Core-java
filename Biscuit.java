class Biscuit{

	public static void main(String[] oreo){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Oreo";
			String dietType="Vegetarian";
			String flavour="Vanilla";
			int numberofItems=1;
			String netQuantity		="	300.0 gram";
			int numberofPieces=2;
			String itemForm	="Item Form";
			int price=127;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Diet Type"+dietType);
			System.out.println("The Flavour"+flavour);
			System.out.println("The Number of Items "+numberofItems);
			System.out.println("The  Net Quantity "+netQuantity);
			System.out.println("The Number of Pieces "+numberofPieces);
			System.out.println("The Item Form  is "+itemForm);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
