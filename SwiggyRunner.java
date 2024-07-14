class SwiggyRunner{

	public static void main(String swiggy[]){
	
		System.out.println("Main Started");
			
			String anything="Panner Masala";
			
			double price=Swiggy.search(anything);
			
			System.out.println("The price for:"+anything+ " is " + price);
			
		System.out.println("Main Ended");
	}
}