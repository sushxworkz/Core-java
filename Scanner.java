class Scanner{
 
	static boolean isConnected = false;
	
	public static void turnOn(){
	
		System.out.println("Start of turnOn");
		if(isConnected == false){
			isConnected = true;
			System.out.println("Scanner is Turned On");
		}
		System.out.println("End of turnOn");
		return;
	}
	
	public static void turnOff(){
	
		System.out.println("Start of turnOff");
		if(isConnected == true){
			isConnected = false;
			System.out.println("Scanner is Turned Off");
		}
		System.out.println("End of turnOff");
		return;
	}
}