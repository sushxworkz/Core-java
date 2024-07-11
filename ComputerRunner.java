class ComputerRunner{

	public static void main(String[] computer){
	
		System.out.println("Main started");
			boolean connect=Computer.onOrOff();
			System.out.println("The computer connected:"+connect);
			
			
			
				Computer.increaseVolume();
				Computer.increaseVolume();
				Computer.increaseVolume();
				Computer.increaseVolume();
				Computer.increaseVolume();
				Computer.increaseVolume();
				Computer.increaseVolume();
				
				Computer.decreaseVolume();
				Computer.decreaseVolume();
				Computer.decreaseVolume();
				Computer.decreaseVolume();
				Computer.decreaseVolume();
				Computer.decreaseVolume();
				Computer.decreaseVolume();
				
				
				
				connect=Computer.onOrOff();
			System.out.println("The computer connected:"+connect);
		System.out.println("Main ended");
	}

}