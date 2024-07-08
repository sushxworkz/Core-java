class Sofa{

	public static void main(String[] sofa ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Wakefit";
			int itemWeightInKg=118;
			String specialFeature="Lightweight";
			String roomType="Room Type";
			String upholsteryFabricType	="Polyester";
			String  armStyle="Ruched";
			String pattern	="Soil";
			int price=57000;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Item Weight In Kg"+itemWeightInKg);
			System.out.println("The Special Feature  is "+specialFeature);
			System.out.println("The RoomType is "+roomType);
			System.out.println("The  Upholstery Fabric Type "+upholsteryFabricType);
			System.out.println("The  Arm Style"+armStyle);
			System.out.println("The Pattern is "+ pattern);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
	}
	
