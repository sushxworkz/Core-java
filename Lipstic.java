class Lipstic{

	public static void main(String[] lipstic ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	 
	 System.out.println("getFeatures method started");
	 
	 String brand="Maybelline";
	 String colour="695 Divine Wine";
	 String skinType="All";
	 String itemForm="Stick";
	 String finishType="finishType";
	 String specialIngredients="Shea Butter";
	 String materialTypeFree="Paraben Free";
	 int price=230;
	 
	 System.out.println("The Brand Name "+brand);
	 System.out.println("The Colour is"+colour);
	 System.out.println("The Skin Type is "+skinType);
	 System.out.println("The Item Form"+itemForm);
	 System.out.println("The Finish Type is "+finishType);
	 System.out.println("The Special Ingredients "+specialIngredients);
	 System.out.println("The  Material Type Free"+materialTypeFree);
	 System.out.println("The Price is "+price);
	 
	 System.out.println("getFeatures method ended");
	 return;
	 }
}