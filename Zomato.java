class Zomato{

	public static double search(String foodName){
	
		System.out.println("Start of Search");
		
			double foodPrice=0.0;
			
			if(foodName=="Vada"){
				foodPrice=60.90;
				return foodPrice;
			}
			if(foodName=="Veg Biryani"){
					foodPrice=200.90;
					return foodPrice;
			}
			if(foodName=="Chicken Biryani"){
				foodPrice=300.60;
				return foodPrice;
			}
			if(foodName=="Jeera Rice"){
				foodPrice=250.50;
				return foodPrice;
			}
			if(foodName=="Poha"){
				foodPrice=50.00;
				return foodPrice;
			}
			if(foodName=="Fried Rice"){
				foodPrice=150.90;
				return foodPrice;
			}
			if(foodName=="Sweet Pongal"){
				foodPrice=170.90;
				return foodPrice;
			}
			if(foodName=="Parata"){
				foodPrice=150.70;
				return foodPrice;
			}
			if(foodName=="Tea"){
				foodPrice=20.00;
				return foodPrice;
			}
			if(foodName=="coffe"){
				foodPrice=30.00;
				return foodPrice;
			}
			if(foodName=="Slada"){
				foodPrice=250.00;
				return foodPrice;
			}
			if(foodName=="Upama"){
				foodPrice=70.80;
				return foodPrice;
			}
			if(foodName=="chicken 65"){
				foodPrice=200.00;
				return foodPrice;
			}
			if(foodName=="Onion Paoda"){
				foodPrice=100.70;
				return foodPrice;
			}
			if(foodName=="Palak Pakoda"){
				foodPrice=120;
				return foodPrice;
			}
			if(foodName=="Mirchi Bajji"){
				foodPrice=100.40;
				return foodPrice;
			}
			if(foodName=="Panipuri"){
				foodPrice=70.40;
				return foodPrice;
			}
			if(foodName=="Sevpuri"){
				foodPrice=80.40;
				return foodPrice;
			}
			if(foodName=="Golgappe"){
				foodPrice=40.50;
				return foodPrice;
			}
			if(foodName=="Masala chat"){
				foodPrice=60.80;
				return foodPrice;
			}
			if(foodName=="Lemon Tea"){
				foodPrice=25.00;
				return foodPrice;
			}
			if(foodName=="Badam Milk"){
				foodPrice=50.00;
				return foodPrice;
			}
			else {
				System.out.println(foodName +"not found");
			}
		System.out.println("End of Search");
		return foodPrice;
	}
}