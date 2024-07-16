class SangeetaMobile{

	public static double getMobilePriceByBrand(String mobileBrandName){
		double mobilePrice=0.0;
		
		System.out.println("Start of getMobilePriceByBrand");

		if(mobileBrandName=="Redami 5")return mobilePrice=1200.00;
		
		 if(mobileBrandName=="vivo y28 5g")return mobilePrice=19000.00;
		
		 if(mobileBrandName=="Apple iPhone 15 128GB")return mobilePrice=70000.00;
		 
		 if(mobileBrandName=="Samsung A15 5G 6GB")return mobilePrice=120000.00;
		 
		 if(mobileBrandName=="Vivo V29 8GB 128GB")return mobilePrice=320000.00;
		 
		  if(mobileBrandName=="Samsung Galaxy A14")return mobilePrice=12000.00;
		 
		  if(mobileBrandName=="Redmi A3 6GB 128GB")return mobilePrice=67000.00;
		 
		  if(mobileBrandName=="Realme 12X 5G 8GB 128GB")return mobilePrice=14500.00;
		 
		  if(mobileBrandName=="Oppo A78 5G Glowing Blue 8GB ")return  mobilePrice=18999.00;
		 
		  if(mobileBrandName=="Samsung Galaxy S24 Ultra 12GB")return mobilePrice=66689.00;
		
		  if(mobileBrandName=="Redmi Note 11 Starburst")return  mobilePrice=13000.00;
		 
		  if(mobileBrandName=="ITel A60 Verte Menthe 2GB 32GB")return mobilePrice=6000.00;
		 
		  if(mobileBrandName=="Redmi Note 13 Pro 5G 8GB 256GB")return mobilePrice=1200.00;
		 
		  if(mobileBrandName=="Apple iPhone 13 128GB Red")return mobilePrice=98990.00;
		
		  if(mobileBrandName=="jio")return mobilePrice=1200.00;
		
		 else {
					System.out.println(mobileBrandName +"not found");
				}
			System.out.println("End of getMobilePriceByBrand");
				return mobilePrice;
			}
			
			
		public static double getMobilePriceByBrand(String mobileBrandName , int numberOfMobiles){
		double mobilePrice=0.0;
		
		System.out.println("Start of getMobilePriceByBrand");

		if(mobileBrandName=="Redami 5")return mobilePrice=1200.00*numberOfMobiles;
		
		 if(mobileBrandName=="vivo y28 5g")return mobilePrice=19000.00*numberOfMobiles;
		
		 if(mobileBrandName=="Apple iPhone 15 128GB")return mobilePrice=70000.00*numberOfMobiles;
		 
		 if(mobileBrandName=="Samsung A15 5G 6GB")return mobilePrice=120000.00*numberOfMobiles;
		 
		 if(mobileBrandName=="Vivo V29 8GB 128GB")return mobilePrice=320000.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Samsung Galaxy A14")return mobilePrice=12000.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Redmi A3 6GB 128GB")return mobilePrice=67000.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Realme 12X 5G 8GB 128GB")return mobilePrice=14500.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Oppo A78 5G Glowing Blue 8GB ")return  mobilePrice=18999.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Samsung Galaxy S24 Ultra 12GB")return mobilePrice=66689.00*numberOfMobiles;
		
		  if(mobileBrandName=="Redmi Note 11 Starburst")return  mobilePrice=13000.00*numberOfMobiles;
		 
		  if(mobileBrandName=="ITel A60 Verte Menthe 2GB 32GB")return mobilePrice=6000.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Redmi Note 13 Pro 5G 8GB 256GB")return mobilePrice=1200.00*numberOfMobiles;
		 
		  if(mobileBrandName=="Apple iPhone 13 128GB Red")return mobilePrice=98990.00*numberOfMobiles;
		 
		  if(mobileBrandName=="jio")return mobilePrice=1200.00*numberOfMobiles;
		
		 else {
					System.out.println(mobileBrandName +"not found");
				}
			System.out.println("End of getMobilePriceByBrand");
				return mobilePrice;
			}
}	
	
 

