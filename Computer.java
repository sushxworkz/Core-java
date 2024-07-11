class Computer{

	static boolean isConnected = false;
	static int maxVolume=7;
	static int currentVolume;
	static int minVolume=0;
	
	public static boolean onOrOff(){
	
		System.out.println("Start of onOrOff");
			if(!isConnected) isConnected =true;
			else if(isConnected == true) isConnected = false;
		System.out.println("End of onOrOff");
		return isConnected;
	}
  
	public static void increaseVolume(){
		
		System.out.println("Start of increaseVolume");
			if(isConnected=true){
				if(currentVolume<=maxVolume){
					currentVolume=currentVolume+1;
					System.out.println("The current volume:"+currentVolume);
					}
			}else System.out.println("Turn on compter");
			System.out.println("end of increaseVolume");
		return;
	}
	
	public static void decreaseVolume(){
		
			System.out.println("Start of decreaseVolume");
				if(isConnected=true){
					if(currentVolume>minVolume){
						currentVolume=currentVolume-1;
						System.out.println("The current volume:"+currentVolume);
					}
			
				} else System.out.println("Turn on computer");
			System.out.println("End of decreaseVolume");
			return;
	}
}
			
									