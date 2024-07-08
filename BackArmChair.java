class BackArmChair{

	public static void main(String[] chair ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
		System.out.println("getFeatures method started");
		//local variable
		String brand="FURNITURE STREET";
		String colour="Orange";
		String size="Standard";
		String material="Teak";
		String backStyle="Wing Back";
		String seatMaterialType="Foam";
		double quantityInCount=1.0;
		
		System.out.println("The Brand Name is "+brand);
		System.out.println("The Colour is "+colour);
		System.out.println("The size is "+size);
		System.out.println("The material type is "+material);
		System.out.println("The Back Style is "+backStyle);
		System.out.println("The Seat Material Type is "+seatMaterialType);
		System.out.println("The Quantity in Count "+quantityInCount);
		
		System.out.println("getFeatures method Ended");
		return;
	}
}
		
		
		