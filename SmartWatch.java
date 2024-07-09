class SmartWatch{

	static boolean isConnected =  false;
	
	public static boolean onOrOff(){
	
		System.out.println("Start of  onOrOff");
			if(isConnected == false){
				isConnected = true;
				System.out.println("SmartWatch is Turned On");
			} else if(isConnected == true){
				isConnected = false;
				System.out.println("SmartWatch is Turned Off");
			}
		System.out.println("End of onOrOff");
		return isConnected;
	}
}