class JuiceShopRunner{

	public static void main(String[] juice){
	
		System.out.println("Main Started");
		
			boolean addJuice=JuiceShop.addJuiceName("Mango Juice");
			System.out.println("Juice name added:"+addJuice);
			
				addJuice=JuiceShop.addJuiceName("Apple Juice");
				System.out.println("Juice name added:"+addJuice);
				
				addJuice=JuiceShop.addJuiceName("Orange Juice");
				System.out.println("Juice name added:"+addJuice);
				
				addJuice=JuiceShop.addJuiceName("WaterMelon Juice");
				System.out.println("Juice name added:"+addJuice);
				
				addJuice=JuiceShop.addJuiceName("PineApple Juice");
				System.out.println("Juice name added:"+addJuice);
				
				addJuice=JuiceShop.addJuiceName("Papaya Juice");
				System.out.println("Juice name added:"+addJuice);
			
			
			JuiceShop. showJuiceNames();
			
			 
			boolean updateJuiceName=JuiceShop.updateJuiceName("Orange Juice","Lemon Juice");
			System.out.println("Juice name update:"+updateJuiceName);
			
			JuiceShop. showJuiceNames();
			
			boolean deleteJuiceName=JuiceShop.deleteJuiceName("PineApple Juice");
			System.out.println("Juice name deleted:"+deleteJuiceName);
			
			JuiceShop. showJuiceNames();
			
			
		System.out.println("Main Ended");
		
	}
}
		