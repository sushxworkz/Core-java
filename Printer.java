class Printer{

	static boolean isConnected = false;

	public static boolean onOrOff(){
	
		System.out.println("Start of onOrOff");
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Printer is turned on");
		} else if(isConnected == true){
			isConnected = false;
			System.out.println("The printer is turned off");
		}
		System.out.println("Ene of onOrOff");
		return isConnected;
	}
}