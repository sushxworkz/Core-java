class Speaker{

	static boolean isConnected = false;
	static int maxVolume=12;
	static int currentVolume;
	static int minVolume=0;
	
	
	public static boolean onOrOff(){
	
		System.out.println("start of onOrOff");
			if(!isConnected)isConnected=true;
			else if(isConnected)isConnected=false;
		System.out.println("End of onOrOff");
		return isConnected;
	}
	
	//increase volume
	public static void increaseVolume(){
		System.out.println("Start of increaseVolume");
			if(isConnected==true){
				if(currentVolume<=maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The current volume:"+currentVolume);
				}
			}
			else
			System.out.println("Turn on speaker");
		System.out.println("End of increaseVolume");
		return;
	}
	
	//decrease volume
	public static void decreaseVolume(){
	
		System.out.println("Start of decreaseVolume");
			if(isConnected==true){
				if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The current volume:"+currentVolume);
				}
			}
			else 
			System.out.println("Turn on speaker");
		System.out.println("End of decreaseVolume");
		return;
	}
}
		
				
	