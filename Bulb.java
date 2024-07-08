class Bulb{

	public static void main(String[] bulb ){
			System.out.println("Main Started");
			//invoke a method
			//call a method
			getFeatures();
			
			System.out.println("Main Ended");
	}

	public static void getFeatures(){
	
		System.out.println("getFeatures method started ");

			String brand="Eveready";
			String lightType="LED";
			String specialFeature="Energy Efficient";
			String bulbBase="B22D";
			int wattageInWatts	=40;
			int voltageInVolts=4;
			String netQuantity="1 count";
			int price=389;
			
			System.out.println("The Brand Name is "+brand);
			System.out.println("The Light Type is "+lightType);
			System.out.println("The Special Feature  is "+specialFeature);
			System.out.println("The Bulb Base is "+bulbBase);
			System.out.println("The Wattage In Watts  "+wattageInWatts);
			System.out.println("The Voltage In Volts"+voltageInVolts);
			System.out.println("The Net Qty  is "+ netQuantity);
			System.out.println("The Price is "+price);
			
			System.out.println("getFeatures method ended");
			return;
		}
	}





