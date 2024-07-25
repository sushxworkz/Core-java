import java.util.Arrays;
class MRPStore{

	static String alcoholNames[]={null,null,null,null,null,null,null,null,null,null};
	static int start;
	
	public static boolean addAlcoholName(String alcoholName){
		
				boolean isAlcoholNameAdded=false;
				
					if(start<alcoholNames.length){
					
						if(alcoholNames!=null){
						alcoholNames[start++]=alcoholName;
						isAlcoholNameAdded=true;
						}
						else
							System.out.println("Alcohol name is Invalid");
					}
					else 
						System.out.println("Sorry...alcohol name is full");
				return isAlcoholNameAdded;
	}
	
	public static void showAlcoholName(){
	
		System.out.println("Available alcohol names are:");
		
			for(String alcoholName:alcoholNames){
				System.out.println(alcoholName);
			}
	}
	
	public static boolean updatedAlcoholName(String oldAlcoholName,String newAlcoholName){
		
		boolean isAlcoholNameUpdated=false;
		for(int position=0; position<alcoholNames.length;position++){
			if(alcoholNames[position]==oldAlcoholName){
				alcoholNames[position]=newAlcoholName;
				isAlcoholNameUpdated=true;
			}
		}
		if(isAlcoholNameUpdated==false)
			System.out.println(oldAlcoholName+"not found");
		
		return isAlcoholNameUpdated;
		
	}
	
	public static boolean deleteAlcoholName(String alcoholName){
		boolean isAlcoholNameDeleted=false;
		int position,newPosition;
		for(position=0,newPosition=0;position<alcoholNames.length;position++){
			if(alcoholNames[position]!=alcoholName){
				alcoholNames[newPosition]=alcoholNames[position];
				newPosition++;
				
			}
			else
				isAlcoholNameDeleted=true;
		}
		int newLength=newPosition;
		alcoholNames=Arrays.copyOf(alcoholNames,newLength);
		
		if(isAlcoholNameDeleted==false){
			System.out.println(alcoholName+"not found");
		}
	return isAlcoholNameDeleted;
	}
	
				
}
	
	
	
	