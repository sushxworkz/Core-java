class Tablets{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		System.out.println("Start of turnOn");
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Tablets is Turned on");
		}
		System.out.println("End of turnOn");
		return;
	}

	public static void turnOff(){
	
		System.out.println("Start of turnOff");
		if(isConnected == true){
			isConnected = false;
			System.out.println("The Tablets is Turned off");
		}
		System.out.println("End od turnOff");
		return;
	}
}