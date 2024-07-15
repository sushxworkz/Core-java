class FoodPandaRunner{

	public static void main(String foodPanda[]){
	
		System.out.println("Main Started");
		
		 String name="Peda";
		 int qty=6;
		 double price=FoodPanda.find(name);
		 System.out.println("The food name is:"+name);
		 System.out.println("The food price is:"+price);
		 System.out.println("The food quantity is:"+qty);
		 System.out.println("The total  food price is:"+qty*price);
		System.out.println("Main Ended");
	}
}
