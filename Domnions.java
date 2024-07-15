class Domnions{

	public static double search(String foodName){
	
			
		double foodPrice=0.0;
		
		if(foodName=="Golden Corn Pizza")return  foodPrice =90.00;
		
		if(foodName=="classic pizza")return foodPrice=50.00;
		
		if(foodName=="Veg Parcel")return foodPrice=49.00;
		
		if(foodName=="Garlic Breadstick")return  foodPrice=109.00;
			
		if(foodName=="Cheesy Dip")return foodPrice=30.00;
			
		if(foodName=="Panner Tikka stuffed Garlic Bread")return foodPrice=169.00;
			
		if(foodName=="barger pizza-classic")return 	foodPrice=159.00;
			
		if(foodName=="Taco Mexcano Veg")return foodPrice=139.00;
			
		if(foodName=="Chicken Parcel")return 	foodPrice=59.90;
			
		if(foodName=="pepsi")return foodPrice=149.00;
			
		if(foodName=="Hariss Dip")return 	foodPrice=49.00;
			
		if(foodName=="Basil pesto dip")return foodPrice=49.00;
			
		if(foodName=="Tomato Ketchup")return 	foodPrice=1.00;
			
		if(foodName=="Choco Lava Cake")return foodPrice=109.00;
			
		if(foodName=="Butterscotch Mousse Cake")return foodPrice=109.00;
			
		if(foodName=="Red Valvet Lava Cake")return foodPrice=139.00;
			
		if(foodName=="Indi Tandoori Panner Pizza")return     foodPrice=299.00;
		  
		if(foodName=="Mexican Green wave Pizza")return foodPrice=259.00;
			
		if(foodName=="Margherita Pizza")return foodPrice=109.00;
		
		if(foodName=="Peppy Panner Pizza")return foodPrice=259.00;
			
		if(foodName=="Blazing Chicken & Paprilka Pizza")return foodPrice=249.00;
			
	
		
		else
			System.out.println(foodName+"not found");
		return foodPrice;
	}
	
	public static double search(String foodName,int qty){
	
		double foodPrice=0.0;
		
		if(foodName=="Golden Corn Pizza")return  foodPrice =90.00*qty;
		
		if(foodName=="classic pizza")return foodPrice=50.00*qty;
		
		if(foodName=="Veg Parcel")return foodPrice=49.00*qty;
		
		if(foodName=="Garlic Breadstick")return  foodPrice=109.00*qty;
			
		if(foodName=="Cheesy Dip")return foodPrice=30.00*qty;
			
		if(foodName=="Panner Tikka stuffed Garlic Bread")return foodPrice=169.00*qty;
			
		if(foodName=="barger pizza-classic")return 	foodPrice=159.00*qty;
			
		if(foodName=="Taco Mexcano Veg")return foodPrice=139.00*qty;
			
		if(foodName=="Chicken Parcel")return 	foodPrice=59.90*qty;
			
		if(foodName=="pepsi")return foodPrice=149.00*qty;
			
		if(foodName=="Hariss Dip")return 	foodPrice=49.00*qty;
			
		if(foodName=="Basil pesto dip")return foodPrice=49.00*qty;
			
		if(foodName=="Tomato Ketchup")return 	foodPrice=1.00*qty;
			
		if(foodName=="Choco Lava Cake")return foodPrice=109.00*qty;
			
		if(foodName=="Butterscotch Mousse Cake")return foodPrice=109.00*qty;
			
		if(foodName=="Red Valvet Lava Cake")return foodPrice=139.00*qty;
			
		if(foodName=="Indi Tandoori Panner Pizza")return     foodPrice=299.00*qty;
		  
		if(foodName=="Mexican Green wave Pizza")return foodPrice=259.00*qty;
			
		if(foodName=="Margherita Pizza")return foodPrice=109.00*qty;
		
		if(foodName=="Peppy Panner Pizza")return foodPrice=259.00;
			
		if(foodName=="Blazing Chicken & Paprilka Pizza")return foodPrice=249.00;
			
	
		
		else
			System.out.println(foodName+"not found");
		return foodPrice;
	}
}
		
		
		

