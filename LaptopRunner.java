class LaptopRunner{

	public static void main(String[] hp){

		System.out.println("Main Started");
		
			boolean connect=Laptop.onOrOff();
			System.out.println("The laptop connected:"+connect);
			
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				Laptop.increaseVolume();
				
				
				Laptop.decreaseVolume();
				Laptop.decreaseVolume();
				Laptop.decreaseVolume();
				Laptop.decreaseVolume();
				
			
				connect =Laptop.onOrOff();
			System.out.println("The laptop connected:"+connect);
			
		System.out.println("Main Ended");
	}
}
				
			