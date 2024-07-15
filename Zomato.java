class Zomato{

	public static double search(String foodName){
	
			double foodPrice=0.0;
			
			if(foodName=="Vada")return foodPrice=60.90;

			if(foodName=="Veg Biryani")return foodPrice=200.90;
				
			if(foodName=="Chicken Biryani")return foodPrice=300.60;
				
			if(foodName=="Jeera Rice")return foodPrice=250.50;
				
			if(foodName=="Poha")return foodPrice=50.00;
				
			if(foodName=="Fried Rice")return foodPrice=150.90;
				
			if(foodName=="Sweet Pongal")return foodPrice=170.90;
				
			if(foodName=="Parata")return foodPrice=150.70;
				
			if(foodName=="Tea")return foodPrice=20.00;
				
			if(foodName=="coffe")return foodPrice=30.00;
				
			if(foodName=="Slada")return foodPrice=250.00;
				
			if(foodName=="Upama")return foodPrice=70.80;
				
			if(foodName=="chicken 65")return foodPrice=200.00;
				
			if(foodName=="Onion Paoda")return foodPrice=100.70;
				
			if(foodName=="Palak Pakoda")return foodPrice=120;
				
			if(foodName=="Mirchi Bajji")return foodPrice=100.40;
			
			if(foodName=="Panipuri")return foodPrice=70.40;
				
			if(foodName=="Sevpuri")return foodPrice=80.40;
				
			if(foodName=="Golgappe")return foodPrice=40.50;
				
			if(foodName=="Masala chat")return foodPrice=60.80;
				
			if(foodName=="Lemon Tea")return foodPrice=25.00;

			if(foodName=="Badam Milk")return foodPrice=50.00;
				
			else {
				System.out.println(foodName +"not found");
			}
		
		return foodPrice;
	}
	
		public static double search(String foodName,int qty){
	
			double foodPrice=0.0;
			
			if(foodName=="Vada")return foodPrice=60.90*qty;

			if(foodName=="Veg Biryani")return foodPrice=200.90*qty;
				
			if(foodName=="Chicken Biryani")return foodPrice=300.60*qty;
				
			if(foodName=="Jeera Rice")return foodPrice=250.50*qty;
				
			if(foodName=="Poha")return foodPrice=50.00*qty;
				
			if(foodName=="Fried Rice")return foodPrice=150.90*qty;
				
			if(foodName=="Sweet Pongal")return foodPrice=170.90*qty;
				
			if(foodName=="Parata")return foodPrice=150.70*qty;
				
			if(foodName=="Tea")return foodPrice=20.00*qty;
				
			if(foodName=="coffe")return foodPrice=30.00*qty;
				
			if(foodName=="Slada")return foodPrice=250.00*qty;
				
			if(foodName=="Upama")return foodPrice=70.80*qty;
				
			if(foodName=="chicken 65")return foodPrice=200.00*qty;
				
			if(foodName=="Onion Paoda")return foodPrice=100.70*qty;
				
			if(foodName=="Palak Pakoda")return foodPrice=120*qty;
				
			if(foodName=="Mirchi Bajji")return foodPrice=100.40*qty;
			
			if(foodName=="Panipuri")return foodPrice=70.40*qty;
				
			if(foodName=="Sevpuri")return foodPrice=80.40*qty;
				
			if(foodName=="Golgappe")return foodPrice=40.50*qty;
				
			if(foodName=="Masala chat")return foodPrice=60.80*qty;
				
			if(foodName=="Lemon Tea")return foodPrice=25.00*qty;

			if(foodName=="Badam Milk")return foodPrice=50.00*qty;
				
			else {
				System.out.println(foodName +"not found");
			}
		
		return foodPrice;
	}
}