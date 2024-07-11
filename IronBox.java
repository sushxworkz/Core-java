class  IronBox{

	static boolean isConnected=false;
	static int maxSpeed=5;
	static  int currentSpeed;
	static int minSpeed=0;
	
	public static boolean onOrOff(){
	
		System.out.println("Start of onOrOff");
			if(!isConnected)isConnected=true;
			else if(isConnected)isConnected=false;
		System.out.println("End of onOrOff");
		return isConnected;
		
	}
	
	//increase speed
	
	public static void increaseSpeed(){
	
		System.out.println("Start of increaseSpeed");
			if(isConnected==true){
				if(currentSpeed<=maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("the current speed:"+currentSpeed);
				}
			}
			else System.out.println("Turn on iron box");
		System.out.println("End of increaseSpeed");
		return;
	}
	
	//decrease speed
	
	public static void decreaseSpeed(){
	
		System.out.println("Start of decreaseSpeed");
			if(isConnected==true){
				if(currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("The current speed:"+currentSpeed);
				}
			}
			else 
			System.out.println("Turn on iron box");
		System.out.println("End of decreaseSpeed");
		return;
	}
}

