class ZomatoRunner{

	public static void main(String zomato[]){
	
		System.out.println("Main Started");
		
			String name="Parata";
			int qty=3;
			double price=Zomato.search(name);
			
			System.out.println("The food name:"+name);
			System.out.println("The food price:"+price);
			System.out.println("The food quantity is:"+qty);
			System.out.println("The  total food price of:" +qty*price);
		
		System.out.println("Main Ended");
	}
}
		