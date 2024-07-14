class Swiggy{

	public static double search(String foodName){
	
		System.out.println("start of search");
		
			double foodPrice=0.0;
			
			if(foodName=="Masala Dosa"){
				foodPrice=70.60;
				return foodPrice;
			}
			if(foodName=="Rava Idli"){
				foodPrice=50.40;
				return foodPrice;
			}
			if(foodName=="Chole buttre"){
				foodPrice=90.00;
				return foodPrice;
			}
			if(foodName=="Puri"){
				foodPrice=70.50;
				return foodPrice;
			}
			if(foodName=="Benne Dosa"){
				foodPrice=60.00;
				return foodPrice;
			}
			if(foodName=="Carraot Halwa"){
				foodPrice =70.40;
				return foodPrice;
			}
			if(foodName=="Mysore Dosa"){
				foodPrice=90.30;
				return foodPrice;
			}
			if(foodName=="Mysore Masala Dosa"){
				foodPrice=100.00;
				return foodPrice;
			}
			if(foodName=="Pav Baji"){
				foodPrice=70.60;
				return foodPrice;
			}
			if(foodName=="misala"){
				foodPrice=60.50;
				return foodPrice;
			}
			if(foodName=="Rava Dosa"){
				foodPrice=80.90;
				return foodPrice;
			}
			if(foodName=="Butter Naan"){
				foodPrice=40.00;
				return foodPrice;
			}
			if(foodName=="Garlic naan"){
				foodPrice=50.70;
				return foodPrice;
			}
			if(foodName=="Butter Roti"){
				foodPrice=30.90;
				return foodPrice;
			}
			if(foodName=="Gobi"){
				foodPrice=80.70;
				return foodPrice;
			}
			if(foodName=="Dry Gobi"){
				foodPrice=90.00;
				return foodPrice;
			}
			if(foodName=="Gobi 65"){
				foodPrice=100.60;
				return foodPrice;
			}
			if(foodName=="Kaju masala"){
				foodPrice=120.70;
				return foodPrice;
			}
			if(foodName=="Panner Masala"){
				foodPrice=140.80;
				return foodPrice;
			}
			if(foodName=="Bisibele Bath"){
				foodPrice=67.00;
				return foodPrice;
			}
			if(foodName=="Ghee Rice"){
				foodPrice=300.80;
				return foodPrice;
			}
			
			else {
				System.out.println(foodName + " not found ");
			}
		
		System.out.println("End of search");
		return foodPrice;
	}
}
			
			