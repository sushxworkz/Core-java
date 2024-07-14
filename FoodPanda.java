class  FoodPanda{

	 public static double find(String foodName){
	 
		double foodPrice=0.0;
		
		 if(foodName=="Masroom biryani"){
			foodPrice=220.00;
			return foodPrice;
		 }
		 if(foodName=="Egg Biryani"){
			foodPrice=250;
			return foodPrice;
	     }
		 if(foodName=="Aloo Matara"){
			 foodPrice=50.00;
			 return foodPrice;
		 }
		 if(foodName=="Brinjal Bharta"){
			 foodPrice=70.00;
			 return foodPrice;
		 }
		 if(foodName=="Dahi Brinjal"){
			 foodPrice=80.00;
			 return foodPrice;
		 }
		 if(foodName=="dal Plain"){
			 foodPrice=70.00;
			 return foodPrice;
		 }
		 if(foodName=="Dal Tadka"){
			 foodPrice=90.00;
			 return foodPrice;
		 }
		 if(foodName=="Dal Fry"){
			 foodPrice=90.00;
			 return foodPrice;
		 }
		 if(foodName=="Channa Masala"){
			 foodPrice=110.00;
			 return foodPrice;
		 }
		 if(foodName=="Dal Makani"){
			 foodPrice=100.00;
			 return foodPrice;
		 }
		 if(foodName=="Veg Makani"){
			 foodPrice=130.00;
			 return foodPrice;
		 }
		 if(foodName=="Egg Burji"){
			 foodPrice=70.00;
			 return foodPrice;
		 }
		 if(foodName=="Egg Curry"){
			 foodPrice=80.00;
			 return foodPrice;
		 }
		 if(foodName=="Egg Masala"){
			 foodPrice=90.00;
			 return foodPrice;
		 }
		 if(foodName=="Kadai Veg"){
			 foodPrice=13.00;
			 return foodPrice;
		 }
		 if(foodName=="Palak Panner"){
			 foodPrice=140;
			return foodPrice;
		 }
		 if(foodName=="Samosa"){
			 foodPrice=50.00;
			 return foodPrice;
		 }
		 if(foodName=="Jalebi"){
			 foodPrice=70.00;
			 return foodPrice;
		 }
		 if(foodName=="Peda"){
			 foodPrice=200.00;
			 return foodPrice;
		 }
		 if(foodName=="Holige"){
			 foodPrice=70.00;
			 return foodPrice;
		 }
		
		 
		 else {
		  System.out.println(foodName+"not found");
		  }
		  
		 return foodPrice;
	}
}