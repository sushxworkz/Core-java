class SangeetaMobileRunner{

	public static void main(String flight[]){
	
		System.out.println("Main Started");
			 
			String name="Redami 5";
			double price=SangeetaMobile.getMobilePriceByBrand(name);
			int numberOfMobiles=2;
			System.out.println("The mobile name: "+name);
			System.out.println("The mobile price: "+price);
			System.out.println("The number of mobile : "+numberOfMobiles);
			System.out.println("The total price of mobile" +numberOfMobiles*price);
		System.out.println("Main Ended");
	}
}
