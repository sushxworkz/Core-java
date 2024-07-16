class NandiniParlour{

	public static double getProductPriceByName(String productName){
	
		double productPrice=0.0;
		
		System.out.println("Start of getProductPriceByName");
		
		if(productName=="Nandini Milk 1 liter")return productPrice=50.00;
			
		if(productName=="Nandini Ghee 200 ml ")return productPrice=500.00;
			
		if(productName=="Nandini MilkPowder 1 packet")return productPrice=400.00;
			
		if(productName=="Nandini Curd 500ml")return productPrice=80.00;
			
		if(productName=="Panner 1 pack")return productPrice=200.00; 
			
		if(productName=="ButterMilk 200ml")return productPrice=60.00;
			
		if(productName=="Nandini Sweet Lassi 500ml")return productPrice=80.00;
			
		if(productName=="Nandini peda 250grams")return productPrice=3000.00;
			
		if(productName=="Mysore Pak 25grams")return productPrice=350.00;
			
		if(productName=="Nandinishubam  Milk 500ml")return productPrice=68.00;
			
		else {
			System.out.println(productName+"not found");
		}
		
		System.out.println("End of getProductPriceByName");
		return productPrice;
	}
	
	
	public static double getProductPriceByName(String productName,int numberOfProduct){
	
		double productPrice=0.0;
		
		System.out.println("Start of getProductPriceByName");
		
		if(productName=="Nandini Milk 1 liter")return productPrice=50.008*numberOfProduct;
			
		if(productName=="Nandini Ghee 200 ml ")return productPrice=500.00*numberOfProduct;
			
		if(productName=="Nandini MilkPowder 1 packet")return productPrice=400.00*numberOfProduct;
			
		if(productName=="Nandini Curd 500ml")return productPrice=80.00*numberOfProduct;
			
		if(productName=="Panner 1 pack")return productPrice=200.00*numberOfProduct; 
			
		if(productName=="ButterMilk 200ml")return productPrice=60.00*numberOfProduct;
			
		if(productName=="Nandini Sweet Lassi 500ml")return productPrice=80.00*numberOfProduct;
			
		if(productName=="Nandini peda 250grams")return productPrice=3000.00*numberOfProduct;
			
		if(productName=="Mysore Pak 25grams")return productPrice=350.00*numberOfProduct;
			
		if(productName=="Nandinishubam  Milk 500ml")return productPrice=68.00*numberOfProduct;
			
		else {
			System.out.println(productName+"not found");
		}
		
		System.out.println("End of getProductPriceByName");
		return productPrice;
	}
}	
	