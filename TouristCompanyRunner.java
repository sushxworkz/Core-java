class TouristCompanyRunner{

	public static void main(String[] tourist){
	
		System.out.println("Main Started");
		
		boolean addTouristPlace=TouristCompany.addTouristPlaceName("Coorg");
		System.out.println("Tourist Place name added:"+addTouristPlace);
		
			addTouristPlace=TouristCompany.addTouristPlaceName("Goa");
			System.out.println("Tourist Place name added:"+addTouristPlace);
		
			addTouristPlace=TouristCompany.addTouristPlaceName("Mysore");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			addTouristPlace=TouristCompany.addTouristPlaceName("Ooty");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			addTouristPlace=TouristCompany.addTouristPlaceName("Hampi");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			addTouristPlace=TouristCompany.addTouristPlaceName("Nandi Hills");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			addTouristPlace=TouristCompany.addTouristPlaceName("Pandichery");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			addTouristPlace=TouristCompany.addTouristPlaceName("Srinagar");
			System.out.println("Tourist Place name added:"+addTouristPlace);
		
			addTouristPlace=TouristCompany.addTouristPlaceName("Manali");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			addTouristPlace=TouristCompany.addTouristPlaceName("Shimla");
			System.out.println("Tourist Place name added:"+addTouristPlace);
			
			
			
			TouristCompany.showTouristPlaceNames();
			
			boolean updateTouristPlace=TouristCompany.updateTouristPlaceName("Goa","Varanashi");
			System.out.println("The tourist place name updated:"+updateTouristPlace);
			
			TouristCompany.showTouristPlaceNames();
			
			boolean deleteTouristPlaceName=TouristCompany.deleteTouristPlaceName("Pandichery");
			System.out.println("The tourist place name deleted:"+deleteTouristPlaceName);
			
			TouristCompany.showTouristPlaceNames();
			
		System.out.println("Main Ended");
	}
}