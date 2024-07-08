class HeadPhone{

	public static void main(String[] headPhone){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="HP";
			String colour="Black";
			String earPlacement="	Over Ear";
			String formFactor="Over Ear";
			String impedance	="32ohm";
			String  size	="Large";
			int price=970;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Colour "+colour);
			System.out.println("The Ear Placement"+earPlacement);
			System.out.println("The Form Factor "+formFactor);
			System.out.println("The Impedance	 "+ impedance);
			System.out.println("The Size"+ size);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
