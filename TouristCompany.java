class TouristCompany{

	static String touristPlaceNames[]={null,null,null,null,null,null,null,null,null,null};
	static int start;
	
	public static boolean addTouristPlaceName(String touristPlaceName){
	
		boolean isTouristPlaceNameAdded=false;
		
			if(start<touristPlaceNames.length){
			
				if(touristPlaceName!=null){
				touristPlaceNames[start++]=touristPlaceName;
				
				isTouristPlaceNameAdded=true;
				}
				else
				System.out.println("Tourist place name Invalid");
			}
			else
			System.out.println("Sorry...tourist place names are full");
		return isTouristPlaceNameAdded;
	}
	
	public static void showTouristPlaceNames(){
	
		System.out.println("Available Tourist Place Names");
		
		for(String touristPlaceName:touristPlaceNames){
		System.out.println(touristPlaceName);
		}
	}
}

				