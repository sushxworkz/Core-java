class DomnionsRunner{

	public static void main(String domnion[]){
	
		System.out.println("Main Started")	;
			String name= "Golden Corn Pizza";
			int qty=5;
			double price=Domnions.search(name);
			
			System.out.println("The food name:"+name);
			System.out.println("The food price:"+price);
			System.out.println("The food quantity:"+qty);
			System.out.println("The total food price:"+qty*price);
		System.out.println("Main Ended")	;	
	}
}	