class SmartWatchRunner{

	public static void main(String[] boAt){
	
		System.out.println("Main Started");
		 boolean connect=SmartWatch.onOrOff();
		 System.out.println("The Smart Watch Connected:"+connect);
		 
			connect=SmartWatch.onOrOff();
			System.out.println("The Smart watch Connected:"+connect);
		System.out.println("Main Ended");
	}
}