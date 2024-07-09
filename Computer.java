class Computer{

	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	
		System.out.println("Start of onOrOff");
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Computer is Turned On");
		} else if(isConnected == true){
			isConnected = false;
			System.out.println("The Computer is Turned Off");
		}
		System.out.println("End of onOrOff");
		return isConnected;
	}
}
		