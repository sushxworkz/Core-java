class IronBoxRunner{

	public static void main(String[] philips){
	
		System.out.println("Main started");
			boolean connect=IronBox.onOrOff();
			System.out.println("The Iron Box is conneted:"+connect);
			
				IronBox.increaseSpeed();
				IronBox.increaseSpeed();
				IronBox.increaseSpeed();
				IronBox.increaseSpeed();
				
				
				IronBox.decreaseSpeed();
				IronBox.decreaseSpeed();
				IronBox.decreaseSpeed();
				
				
			
				connect=IronBox.onOrOff();
			System.out.println("The Iron Box is conneted:"+connect);
		System.out.println("Main ended");
	
	
	}
}