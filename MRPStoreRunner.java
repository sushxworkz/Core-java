class MRPStoreRunner{

	public static void main(String[] store){
	
		System.out.println("Main Started");
			
			boolean addAlcohol=MRPStore.addAlcoholName("Rum");
			System.out.println("Alcohol name added:"+addAlcohol);
			
				addAlcohol=MRPStore.addAlcoholName("Wine");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Vodka");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Beer");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Port");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Wiskey");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Brand");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Gin");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Cognac");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Champagne");
				System.out.println("Alcohol name added:"+addAlcohol);
				
				addAlcohol=MRPStore.addAlcoholName("Cider");
				System.out.println("Alcohol name added:"+addAlcohol);
			
			
			MRPStore.showAlcoholName();
			
		System.out.println("Main Enede");
	}
}