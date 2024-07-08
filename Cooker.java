class Cooker{

	public static void main(String[] pretty){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="SUNFLAME";
			int capacityInliter=3;
			String colour="Black";
			double itemWeightInKg=2.5;
			String 	finishType="Hard Anodised";
			String controlMethod	="Touch";
			String controllerType	="Hand Control";
			int price=1699;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Capacity Inliter"+capacityInliter);
			System.out.println("The Colour"+colour);
			System.out.println("The Item Weight InKg "+itemWeightInKg);
			System.out.println("The  Finish Type "+finishType);
			System.out.println("The Control Method"+controlMethod);
			System.out.println("The controller Type  is "+controllerType);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
