class EatSureRunner{

	public static void main(String eatSure[]){
	
		System.out.println("Main Started");
		
			String name="Pineapple Jar Cake";
			int qty=6;
			double price=EatSure.search(name);
			
			System.out.println("The food name:"+name);
			System.out.println("The food price is:"+price);
			System.out.println("The food quantity is:"+qty);
			System.out.println("The  total food price of:" +qty*price);
		
		System.out.println("Main Ended");
	}
}
		