class Fan{

	public static void main(String[] Bajaj){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Bajaj";
			String colour="Brown";
			String electricfandesign="	Ceiling Fan";
			String powerSource="Power Source";
			String style	 	="Star Rated";
			String  roomType="Bedroom, Living Room, Dining Room";
			String speciality	="high velocity";
			int price=278;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Colour "+colour);
			System.out.println("The electric fan design"+electricfandesign);
			System.out.println("The  Power Source"+powerSource);
			System.out.println("The Style	 "+style	);
			System.out.println("The   Room Type"+roomType);
			System.out.println("The  speciality is "+ speciality);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
}
