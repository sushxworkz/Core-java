class Tablets{

	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	
		System.out.println("Start of onOrOff");
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Tablets is Turned on");
		} else if(isConnected == true){
			isConnected = false;
			System.out.println("The Tablets is Turned off");
		}
		System.out.println("End od onOrOff");
		return isConnected;
	}
}
		