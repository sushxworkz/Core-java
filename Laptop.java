class Laptop{

	static boolean isConnected = false;
	static int maxVolume=10;
	static int currentVolume;
	static int minVolume=0;
	
	
	public static boolean onOrOff(){
	
		System.out.println("start of onOrOff");
			if(!isConnected)isConnected=true;
			else if(isConnected)isConnected=false;
		System.out.println("End of onOrOff");
		return isConnected;
	}
	
	public static void increaseVolume(){
		System.out.println("Start of increaseVolume");
			if(isConnected==true){
				if(currentVolume<=maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The current volume:"+currentVolume);
				}
			}
			else
			System.out.println("Turn on laptop");
		System.out.println("End of increaseVolume");
		return;
	}
	
	
	public static void decreaseVolume(){
	
		System.out.println("Start of decreaseVolume");
			if(isConnected==true){
				if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The current volume:"+currentVolume);
				}
			}
			else 
			System.out.println("Turn on laptop");
		System.out.println("End of decreaseVolume");
		return;
	}
}
		
				
	