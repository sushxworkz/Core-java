class Charger{

	public static void main(String[] charger){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Ambrane";
			String colour="White";
			String connectivityTechnology="	USB";
			String connectorType="USB";
			String inputVoltage="230 Volts";
			String  mountingType	="Wall Mount";
			int price=349;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Colour "+colour);
			System.out.println("The Connectivity Technology"+connectivityTechnology);
			System.out.println("The Connector Type"+connectorType);
			System.out.println("The Input Voltage	 "+inputVoltage);
			System.out.println("The Mounting Type"+ mountingType);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
