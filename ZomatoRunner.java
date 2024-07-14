class ZomatoRunner{

	public static void main(String zomato[]){
	
		System.out.println("Main Started");
		
			String anything="Tea";
			double price=Zomato.search(anything);
			
			System.out.println("The price for:"+ anything+" is " +price);
		
		System.out.println("Main Ended");
	}
}
		