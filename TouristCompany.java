import java.util.Arrays;
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
	
	public static boolean updateTouristPlaceName(String oldTouristPlaceName,String newTouristPlaceName){
		
		boolean isTouristPlaceNameUpdated=false;
		for(int position=0; position<touristPlaceNames.length;position++){
			if(touristPlaceNames[position]==oldTouristPlaceName){
				touristPlaceNames[position]=newTouristPlaceName;
				isTouristPlaceNameUpdated=true;
			}
		}
		if(isTouristPlaceNameUpdated==false)
			System.out.println(oldTouristPlaceName+" not found");
			
		return isTouristPlaceNameUpdated;
		}
		
	public static boolean deleteTouristPlaceName(String touristPlaceName){
		boolean isTouristPlaceNameDeleted=false;
		int position,newPosition;
		for(position=0,newPosition=0;position<touristPlaceNames.length;position++){
			if(touristPlaceNames[position]!=touristPlaceName){
				touristPlaceNames[newPosition]=touristPlaceNames[position];
				newPosition++;
				
			}
			else
				isTouristPlaceNameDeleted=true;
		}
		int newLength=newPosition;
		touristPlaceNames=Arrays.copyOf(touristPlaceNames,newLength);
		
		if(isTouristPlaceNameDeleted==false){
			System.out.println(touristPlaceName+"not found");
		}
		
		return isTouristPlaceNameDeleted;
	}
}

				