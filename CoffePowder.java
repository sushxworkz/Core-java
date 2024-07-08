class CoffePowder{

	public static void main(String[] coffePowder){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Noritake";
			int numberofItems=1;
			String pattern="Solid";
			String 	specialFeature="Microwave Safe";
			String theme	="Winter";
			String shape	="Cup";
			String colour="WINTER SONATA";
			int price=1549;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Number of Items"+numberofItems);
			System.out.println("The Pattern	"+pattern	);
			System.out.println("The SpeciaFeature  "+specialFeature);
			System.out.println("The  Theme	 "+theme	);
			System.out.println("The  Shape  "+ shape);
			System.out.println("The  Colour"+ colour);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}

