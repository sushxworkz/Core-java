class SwiggyRunner{

	public static void main(String swiggy[]){
	
		System.out.println("Main Started");
			
			String name="Panner Masala";
			int qty=2;
		
			double price=Swiggy.search(name);
			
			System.out.println("The food name is:"+name);
			System.out.println("The food price is:"+price);
			System.out.println("The food quantity  is:"+qty);
			System.out.println("The tota  food price is:"+qty*price);
			
		System.out.println("Main Ended");
	}
}