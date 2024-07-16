class Airtel{

	public static double getPriceByPlan(String planName){
	
		double planPrice=0.0;
		
		System.out.println("Start of getPriceByPlan");
		
		if(planName=="2GB per day for 28 days")return planPrice=349;
			
		if(planName=="15.0 GB package") return planPrice=314;
			
		if(planName=="2.5 GB per day for 28 days")	return planPrice=409;
			
		if(planName=="2.0GBper day for 84 days")return planPrice=979;
		
		if(planName=="2.0GB per day for 365 days")return planPrice=3599;
		
		if(planName=="2.5 GB per day for 365 days")return planPrice=3999;
			
		if(planName=="12.00 GB package")return planPrice=161;
			
		if(planName=="Unlimited data for 1 day")return planPrice=49;
			
		if(planName=="Unlimited data for 2 day")return planPrice=99;
			
		if(planName=="2.0GB data for 1 day")return planPrice=33;
			
		if(planName=="1.0 GB per day for 30 days")return planPrice=211;
			
		if(planName=="4.0GB data for 1 days")return planPrice=77;
			
		if(planName=="1.00GB data  for 1 day")return planPrice=22;
			
		if(planName=="1.5 GB per day for 90 days")return planPrice=929;
			
		if(planName=="3.0 Gb per day for 56 days")return planPrice=838;
			
		else {
			System.out.println(planName+"not found");
		}
		System.out.println("End of getPriceByPlan");
		return planPrice;
	}
	
	public static double getPriceByPlan(String planName,int numberOfPack){
	
		double planPrice=0.0;
		
		System.out.println("Start of getPriceByPlan");
		
		if(planName=="2GB per day for 28 days")return planPrice=349* numberOfPack;
			
		if(planName=="15.0 GB package") return planPrice=314* numberOfPack;
			
		if(planName=="2.5 GB per day for 28 days")	return planPrice=409* numberOfPack;
			
		if(planName=="2.0GBper day for 84 days")return planPrice=979* numberOfPack;
		
		if(planName=="2.0GB per day for 365 days")return planPrice=3599* numberOfPack;
		
		if(planName=="2.5 GB per day for 365 days")return planPrice=3999* numberOfPack;
			
		if(planName=="12.00 GB package")return planPrice=161* numberOfPack;
			
		if(planName=="Unlimited data for 1 day")return planPrice=49* numberOfPack;
			
		if(planName=="Unlimited data for 2 day")return planPrice=99* numberOfPack;
			
		if(planName=="2.0GB data for 1 day")return planPrice=33* numberOfPack;
			
		if(planName=="1.0 GB per day for 30 days")return planPrice=211* numberOfPack;
			
		if(planName=="4.0GB data for 1 days")return planPrice=77* numberOfPack;
			
		if(planName=="1.00GB data  for 1 day")return planPrice=22* numberOfPack;
			
		if(planName=="1.5 GB per day for 90 days")return planPrice=929* numberOfPack;
			
		if(planName=="3.0 Gb per day for 56 days")return planPrice=838* numberOfPack;
			
		else {
			System.out.println(planName+"not found");
		}
		System.out.println("End of getPriceByPlan");
		return planPrice;
	}
}