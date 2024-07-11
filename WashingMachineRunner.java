class WashingMachineRunner{

	public static void main(String[] sony){
	
		System.out.println("Main started");
			boolean connect=WashingMachine.onOrOff();
			System.out.println("The washing machine connected:"+connect);
			
				WashingMachine.increaseSpeed();
				WashingMachine.increaseSpeed();
				WashingMachine.increaseSpeed();
				WashingMachine.increaseSpeed();
				
				WashingMachine.decreaseSpeed();
				WashingMachine.decreaseSpeed();
				WashingMachine.decreaseSpeed();
				
				connect=WashingMachine.onOrOff();
			System.out.println("The washing machine connected:"+connect);
		System.out.println("Main ended");
	}
}