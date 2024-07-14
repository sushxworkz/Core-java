class NandiniParlour{

	public static double getProductPriceByName(String productName){
	
		double productPrice=0.0;
		
		if(productName=="Nandini Milk 1 liter"){
			productPrice=50.00;
			return productPrice;
		}
		if(productName=="Nandini Ghee 200 ml "){
			productPrice=500.00;
			return productPrice;
		}
		if(productName=="Nandini MilkPowder 1 packet"){
			productPrice=400.00;
			return productPrice;
		}
		if(productName=="Nandini Curd 500ml"){
			productPrice=80.00;
			return productPrice;
		}
		if(productName=="Panner 1 pack"){
			productPrice=200.00;
			return productPrice;
		}
		if(productName=="ButterMilk 200ml"){
			productPrice=60.00;
			return productPrice;
		}
		if(productName=="Nandini Sweet Lassi 500ml"){
			productPrice=80.00;
			return productPrice;
		}
		if(productName=="Nandini peda 250grams"){
			productPrice=3000.00;
			return productPrice;
		}
		if(productName=="Mysore Pak 25grams"){
			productPrice=350.00;
			return productPrice;
		}
		if(productName=="Nandinishubam  Milk 500ml"){
			productPrice=68.00;
			return productPrice;
		
		else {
			System.out.println(productName+"not found");
		}
		return productPrice;
	}
}	
	