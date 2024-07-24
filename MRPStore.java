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
}
	
	
	
	