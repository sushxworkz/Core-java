class Laptop{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		System.out.println("Start of turnOn");
		if(isConnected == false){
			isConnected = true;
			System.out.println("Laptop is Tunerd On");
			return;
		}
		System.out.println("End on turnOn");
	}
	
	public static void turnOff(){
	
		System.out.println("Start of turnOff");
		if(isConnected == true){
			isConnected = false;
			System.out.println("Laptop is Turned Off");
		}
		System.out.println("End of turnOff");
		return;
	}
}
			