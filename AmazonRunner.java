class AmazonRunner{

	public static void main(String[] amazon){
	
		System.out.println("Main Startd");
		
			boolean addProduct=Amazon.addProductName("Laptop");
			System.out.println("The product name added:"+addProduct);
			
				addProduct=Amazon.addProductName("Charger");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Mobile");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Bag");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Facewash");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Air cooler");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Table");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Shoe");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Fan");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Bulb");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Chair");
				System.out.println("The product name added:"+addProduct);
				
				addProduct=Amazon.addProductName("Iron Box");
				System.out.println("The product name added:"+addProduct);
			
			Amazon.showProductNames();
		System.out.println("Main Eneded");
	}
}