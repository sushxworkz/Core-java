class GrinderRunner{

	public static void main(String[] premier){
	
		System.out.println("Main started");
			boolean connect=Grinder.onOrOff();
			System.out.println("The grinder is conneted:"+connect);
			
				Grinder.increaseSpeed();
				Grinder.increaseSpeed();
				Grinder.increaseSpeed();
				Grinder.increaseSpeed();
				
				Grinder.decreaseSpeed();
				Grinder.decreaseSpeed();
				Grinder.decreaseSpeed();
				Grinder.decreaseSpeed();
				
				
			
				connect=Grinder.onOrOff();
			System.out.println("The grinder is conneted:"+connect);
		System.out.println("Main ended");
	
	
	}
}