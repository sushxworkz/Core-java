class  FoodPanda{

	 public static double find(String foodName){
	 
			double foodPrice=0.0;
		
		 if(foodName=="Masroom biryani")return foodPrice=220.00;
			
		 if(foodName=="Egg Biryani")return foodPrice=250;
			
		 if(foodName=="Aloo Matara")return  foodPrice=50.00;
			
		 if(foodName=="Brinjal Bharta")return foodPrice=70.00;
			
		 if(foodName=="Dahi Brinjal")return foodPrice=80.00;
			
		 if(foodName=="dal Plain")return foodPrice=70.00;
			
		 if(foodName=="Dal Tadka")return foodPrice=90.00;
			 
		 if(foodName=="Dal Fry")return foodPrice=90.00;
			
		 if(foodName=="Channa Masala")return foodPrice=110.00;
			
		 if(foodName=="Dal Makani")return  foodPrice=100.00;
			 
		 if(foodName=="Veg Makani")return foodPrice=130.00;
			
		 if(foodName=="Egg Burji")return foodPrice=70.00;
			
		 if(foodName=="Egg Curry")return foodPrice=80.00;
			
		 if(foodName=="Egg Masala")return foodPrice=90.00;
			
		 if(foodName=="Kadai Veg")return foodPrice=130.00;
			 
		 if(foodName=="Palak Panner")return  foodPrice=140;
			
		 if(foodName=="Samosa")return foodPrice=50.00;
			
		 if(foodName=="Jalebi")return foodPrice=70.00;
			 
		 if(foodName=="Peda")return foodPrice=200.00;
			
		 if(foodName=="Holige")return foodPrice=70.00;
			
		
		 
		 else {
		  System.out.println(foodName+"not found");
		  }
		  
		 return foodPrice;
	}
	
	public static double search(String foodName,int qty){
	
		double foodPrice=0.0;
		
		 if(foodName=="Masroom biryani")return foodPrice=220.00*qty;
			
		 if(foodName=="Egg Biryani")return foodPrice=250*qty;
			
		 if(foodName=="Aloo Matara")return  foodPrice=50.00*qty;
			
		 if(foodName=="Brinjal Bharta")return foodPrice=70.00*qty;
			
		 if(foodName=="Dahi Brinjal")return foodPrice=80.00*qty;
			
		 if(foodName=="dal Plain")return foodPrice=70.00*qty;
			
		 if(foodName=="Dal Tadka")return foodPrice=90.00*qty;
			 
		 if(foodName=="Dal Fry")return foodPrice=90.00*qty;
			
		 if(foodName=="Channa Masala")return foodPrice=110.00*qty;
			
		 if(foodName=="Dal Makani")return  foodPrice=100.00*qty;
			 
		 if(foodName=="Veg Makani")return foodPrice=130.00*qty;
			
		 if(foodName=="Egg Burji")return foodPrice=70.00*qty;
			
		 if(foodName=="Egg Curry")return foodPrice=80.00*qty;
			
		 if(foodName=="Egg Masala")return foodPrice=90.00*qty;
			
		 if(foodName=="Kadai Veg")return foodPrice=130.00*qty;
			 
		 if(foodName=="Palak Panner")return  foodPrice=140*qty;
			
		 if(foodName=="Samosa")return foodPrice=50.00*qty;
			
		 if(foodName=="Jalebi")return foodPrice=70.00*qty;
			 
		 if(foodName=="Peda")return foodPrice=200.00*qty;
			
		 if(foodName=="Holige")return foodPrice=70.00*qty;
			
		
		 
		 else {
		  System.out.println(foodName+"not found");
		  }
		  
		 return foodPrice;
	}
	
	
	
}