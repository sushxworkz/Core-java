class Swiggy{

	public static double search(String foodName){
	
			double foodPrice=0.0;
			
			if(foodName=="Masala Dosa")return foodPrice=70.60;
				
			if(foodName=="Rava Idli")return foodPrice=50.40;

			if(foodName=="Chole buttre")return foodPrice=90.00;
				
			if(foodName=="Puri")return foodPrice=70.50;
				
			if(foodName=="Benne Dosa")return foodPrice=60.00;
				
			if(foodName=="Carraot Halwa")return foodPrice =70.40;
				
			if(foodName=="Mysore Dosa")return foodPrice=90.30;
				
			if(foodName=="Mysore Masala Dosa")return foodPrice=100.00;
				
			if(foodName=="Pav Baji")return foodPrice=70.60;
				
			if(foodName=="misala")return foodPrice=60.50;
				
			if(foodName=="Rava Dosa")return foodPrice=80.90;
				
			if(foodName=="Butter Naan")return foodPrice=40.00;
				
			if(foodName=="Garlic naan")return foodPrice=50.70;
				
			if(foodName=="Butter Roti")return foodPrice=30.90;

			if(foodName=="Gobi")return foodPrice=80.70;
				
			if(foodName=="Dry Gobi")return foodPrice=90.00;
				
			if(foodName=="Gobi 65")return foodPrice=100.60;
				
			if(foodName=="Kaju masala")return foodPrice=120.70;
				
			if(foodName=="Panner Masala")return foodPrice=140.80;
				
			if(foodName=="Bisibele Bath")return 	foodPrice=67.00;
				
			if(foodName=="Ghee Rice")return 	foodPrice=300.80;
				
			
			else {
				System.out.println(foodName + " not found ");
			}
		
		
		return foodPrice;
	}
	
	public static double search(String foodName,int qty){
	
			double foodPrice=0.0;
			
			if(foodName=="Masala Dosa")return foodPrice=70.60*qty;
				
			if(foodName=="Rava Idli")return foodPrice=50.40*qty;
				
			if(foodName=="Chole buttre")return foodPrice=90.00*qty;
				
			if(foodName=="Puri")return foodPrice=70.50*qty;
				
			if(foodName=="Benne Dosa")return foodPrice=60.00*qty;
				
			if(foodName=="Carraot Halwa")return foodPrice =70.40*qty;
				
			if(foodName=="Mysore Dosa")return foodPrice=90.30*qty;
				
			if(foodName=="Mysore Masala Dosa")return foodPrice=100.00*qty;
				
			if(foodName=="Pav Baji")return foodPrice=70.60*qty;
			
			if(foodName=="misala")return foodPrice=60.50*qty;
				
			if(foodName=="Rava Dosa")return foodPrice=80.90*qty;
				
			if(foodName=="Butter Naan")return foodPrice=40.00*qty;
				
			if(foodName=="Garlic naan")return foodPrice=50.70*qty;
				
			if(foodName=="Butter Roti")return foodPrice=30.90*qty;
				
			if(foodName=="Gobi")return foodPrice=80.70*qty;
				
			if(foodName=="Dry Gobi")return foodPrice=90.00*qty;
				
			if(foodName=="Gobi 65")return foodPrice=100.60*qty;
				
			if(foodName=="Kaju masala")return foodPrice=120.70*qty;

			if(foodName=="Panner Masala")return foodPrice=140.80*qty;
				
			if(foodName=="Bisibele Bath")return 	foodPrice=67.00*qty;
				
			if(foodName=="Ghee Rice")return 	foodPrice=300.80*qty;
				
			
			else {
				System.out.println(foodName + " not found ");
			}
		
		
		return foodPrice;
	}
	
	
}
			
			