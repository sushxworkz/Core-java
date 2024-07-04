class Guitar{

	public static void main(String[] guitar){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="YAMAHA";
			String colour="	Natural";
			String bodyMaterial	="Rosewood";
			String name="Acoutus";
			String  topMaterialType="Rose";
			int price=7348;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Colour "+colour);
			System.out.println("The body Material"+bodyMaterial);
			System.out.println("The name"+name);
			System.out.println("The  top Material Type "+topMaterialType);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
