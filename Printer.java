class Printer{

	static boolean isConnected = false;

	public static void turnOn(){
	
		System.out.println("Start of turnOn");
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Printer is turned on");
		}
		System.out.println("End of turnOn");
		return;
	}
	
	public static void turnOff(){
	
		System.out.println("Start of turnOff");
		
		if(isConnected == true){
			isConnected = false;
			System.out.println("The printer is turned off");
		}
		System.out.println("Ene of turnOff");
		return;
	}
}