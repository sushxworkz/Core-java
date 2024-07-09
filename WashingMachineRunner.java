class WashingMachineRunner{

	public static void main(String[] sony){
	
		System.out.println("Main Started");
			boolean connect=WashingMachine.onOrOff();
			System.out.println("The washing machine is connected:"+connect);
				connect=WashingMachine.onOrOff();
			System.out.println("The washing machine is connected:"+connect);
		System.out.println("Main Ended");	
	}
}