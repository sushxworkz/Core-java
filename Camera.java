class Camera{

	public static void main(String[] sony){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Sony";
			String colour="Black";
			String photoSensorTechnology="	Supported File Forma";
			String supportedFileFormat="RAW";
			String imageStabilisation	 	="Optical";
			String  modelName="ILCE-7M3";
			int price=127000;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Colour "+colour);
			System.out.println("The Photo Sensor Technology"+photoSensorTechnology);
			System.out.println("The  Supported File Format "+supportedFileFormat);
			System.out.println("The imageStabilisation	 "+imageStabilisation	);
			System.out.println("The  Model Name "+ modelName);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
