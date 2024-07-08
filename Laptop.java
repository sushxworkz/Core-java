class Laptop{

	public static void main(String [] laptop){
		System.out.println("Main Staretd");
		//invoke a method
		//call a method
		getFeatures();
			
		System.out.println("Main Ended");
	}
	
	public static void getFeatures(){
	
		System.out.println("getFeatures method started");
		//local variable
		
		String brand="Dell";
		String modelName="Vostro";
		String screenSize="15.6 Inches";
		String colour="Black";
		String ramMemoryInstalledSize="8 GB";
		String specialFeature="Thin";
		int hardDiskSizeInGB=512;
		int price=40599;
		
		System.out.println("The Brand Name is "+brand);
		System.out.println("The Model Name is  "+modelName);
		System.out.println("The Screen Size is "+screenSize);
		System.out.println("The Colour "+colour);
		System.out.println("The RAM Memory Installed Size is "+ramMemoryInstalledSize);
		System.out.println("The  Special feature is "+specialFeature);
		System.out.println("The Hard Disk Size In GB is "+hardDiskSizeInGB);
		System.out.println("The Price is "+price);
		System.out.println("getFeatures method started");
		return;
	}
}
