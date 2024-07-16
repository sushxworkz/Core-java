class NandiniParlourRunner{

	public static void main(String nandini[]){
	
		System.out.println("Main Started");
			 
			String name="Nandini Ghee 200 ml ";
			double price=NandiniParlour.getProductPriceByName(name);
			int numberOfProduct=4;
			System.out.println("The product name: "+name);
			System.out.println("The product price: "+price);
			System.out.println("The product number: "+numberOfProduct);
			System.out.println("The total product price:" +numberOfProduct*price);
		System.out.println("Main Ended");
	}
}
