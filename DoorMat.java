class DoorMat{

	public static void main(String[] mat){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="LUXE HOME INTERNATIONAL";
			String size="40x60 Cm";
			String material	="Microfiber";
			String 	weaveType="	Tufted";
			String pileHeight	="	4 Cm";
			String constructionType	="Machine Made";
			String colour="Aqua";
			int price=549;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Size"+size);
			System.out.println("The material"+material);
			System.out.println("The weave Type "+weaveType);
			System.out.println("The  Pile Heigh	 "+pileHeight	);
			System.out.println("The Construction Type "+constructionType);
			System.out.println("The colour  is "+colour);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
