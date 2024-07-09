class Speakers{
	public static boolean isConnected = false;
	
	public static boolean onOrOff(){
	
		System.out.println("Start of onOrOff");
		if(isConnected == false){
			isConnected = true;
			System.out.println("The speaker is tunrnd on");
		} else if(isConnected == true){
			isConnected = false;
			System .out.println("The speaker is turned of");
		}
		System.out.println("End of onOrOff");
		return isConnected;
	}
}