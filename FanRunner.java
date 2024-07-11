class FanRunner{

	public static void main(String[] usha){
	
		System.out.println("Main Started");
		
			boolean connect=Fan.onOrOff();
			System.out.println("The fan connected:"+connect);
			
				Fan.increaseSpeed();
				Fan.increaseSpeed();
				Fan.increaseSpeed();
				
				Fan.decreaseSpeed();
				Fan.decreaseSpeed();
				Fan.decreaseSpeed();
			
				connect=Fan.onOrOff();
			System.out.println("The fan connected"+connect);
		System.out.println("Main Ended");
	}
}