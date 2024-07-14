class Airtel{

	public static double getPriceByPlan(String planName){
	
		double planPrice=0.0;
		
		if(planName=="2GB per day for 28 days"){
			planPrice=349;
			return planPrice;
		}
		if(planName=="15.0 GB package"){
			planPrice=181;
			return planPrice;
		}
		if(planName=="2.5 GB per day for 28 days"){
			planPrice=409;
			return planPrice;
		}
		if(planName=="2.0GBper day for 84 days"){
			planPrice=979;
			return planPrice;
		}
		if(planName=="2.0GB per day for 365 days"){
			planPrice=3599;
			return planPrice;
		}
		if(planName=="2.5 GB per day for 365 days"){
			planPrice=3999;
			return planPrice;
		}
		if(planName=="12.00 GB package"){
			planPrice=161;
			return planPrice;
		}
		if(planName=="Unlimited data for 1 day"){
			planPrice=49;
			return planPrice;
		}
		if(planName=="Unlimited data for 2 day"){
			planPrice=99;
			return planPrice;
		}
		if(planName=="2.0GB data for 1 day"){
			planPrice=33;
			return planPrice;
		}
		if(planName=="1.0 GB per day for 30 days"){
			planPrice=211;
			return planPrice;
		}
		if(planName=="4.0GB data for 1 days"){
			planPrice=77;
			return planPrice;
		}
		if(planName=="1.00GB data  for 1 day"){
			planPrice=22;
			return planPrice;
		}
		if(planName=="1.5 GB per day for 90 days"){
			planPrice=929;
			return planPrice;
		}
		if(planName=="3.0 Gb per day for 56 days"){
			planPrice=838;
			return planPrice;
		}
		else {
			System.out.println(planName+"not found");
		}
		return planPrice;
	}
}