class EatSure{

	public static double search(String foodName){
	
			double foodPrice=0.0;
			
			if(foodName=="Mango Cheesecake")return foodPrice=179.00;

			if(foodName=="New York Cheesecake")return foodPrice=129.00;
				
			if(foodName=="Pineapple Jar Cake")return foodPrice=99.00;
				
			if(foodName=="Chocolate Truffle pastry")return foodPrice=199.00;
				
			if(foodName=="Chocolate Mocha Jar")return foodPrice=99.00;
				
			if(foodName=="Red Valvet Dessert Jar")return foodPrice=99.90;
				
			if(foodName=="Hazelnut Brownie")return foodPrice=89.90;
				
			if(foodName=="Chocolate Indulgence Brownie")return foodPrice=89.00;
				
			if(foodName=="Choco Lava Cake")return foodPrice=79.00;
				
			if(foodName=="BOGO-2 Cheesecake")return foodPrice=270.00;
				
			if(foodName=="BOGO-2 Brownie")return foodPrice=152.00;
				
			if(foodName=="BOGO-2 Pastries")return foodPrice=199.80;
				
			if(foodName=="Vanilla Ice Cream")return foodPrice=99.00;
				
			if(foodName=="Straberry Ice Cream")return foodPrice=99.70;
				
			if(foodName=="Dry Fruit Kulfi Ice Cream")return foodPrice=99.00;
				
			if(foodName=="Salted Caramel Ice Cream")return foodPrice=100.00;
			
			if(foodName=="Mango Ice Cream")return foodPrice=170.00;
				
			if(foodName=="Chocolate Ice Cream(pack 2)")return foodPrice=179.40;
				
			if(foodName=="Blueberry Cheesecake")return foodPrice=749.50;
				
			if(foodName=="Dutch Chocolate")return foodPrice=499.00;
				
			if(foodName=="Fresh Pineapple Cake")return foodPrice=499.00;

			if(foodName=="Chocolate Chip Cake")return foodPrice=500.00;
				
			else {
				System.out.println(foodName +"not found");
			}
		
		return foodPrice;
	}
	
	public static double search(String foodName,int qty){
		
		double foodPrice=0.0;
			
			if(foodName=="Mango Cheesecake")return foodPrice=179.00*qty;

			if(foodName=="New York Cheesecake")return foodPrice=129.00*qty;
				
			if(foodName=="Pineapple Jar Cake")return foodPrice=99.00*qty;
				
			if(foodName=="Chocolate Truffle pastry")return foodPrice=199.00*qty;
				
			if(foodName=="Chocolate Mocha Jar")return foodPrice=99.00*qty;
				
			if(foodName=="Red Valvet Dessert Jar")return foodPrice=99.90*qty;
				
			if(foodName=="Hazelnut Brownie")return foodPrice=89.90*qty;
				
			if(foodName=="Chocolate Indulgence Brownie")return foodPrice=89.00*qty;
				
			if(foodName=="Choco Lava Cake")return foodPrice=79.00*qty;
				
			if(foodName=="BOGO-2 Cheesecake")return foodPrice=270.00*qty;
				
			if(foodName=="BOGO-2 Brownie")return foodPrice=152.00*qty;
				
			if(foodName=="BOGO-2 Pastries")return foodPrice=199.80*qty;
				
			if(foodName=="Vanilla Ice Cream")return foodPrice=99.00*qty;
				
			if(foodName=="Straberry Ice Cream")return foodPrice=99.70*qty;
				
			if(foodName=="Dry Fruit Kulfi Ice Cream")return foodPrice=99.00*qty;
				
			if(foodName=="Salted Caramel Ice Cream")return foodPrice=100.00*qty;
			
			if(foodName=="Mango Ice Cream")return foodPrice=170.00*qty;
				
			if(foodName=="Chocolate Ice Cream(pack 2)")return foodPrice=179.40*qty;
				
			if(foodName=="Blueberry Cheesecake")return foodPrice=749.50*qty;
				
			if(foodName=="Dutch Chocolate")return foodPrice=499.00*qty;
				
			if(foodName=="Fresh Pineapple Cake")return foodPrice=499.00*qty;

			if(foodName=="Chocolate Chip Cake")return foodPrice=500.00*qty;
				
			else {
				System.out.println(foodName +"not found");
			}
		
		return foodPrice;
	}	
	
			
}