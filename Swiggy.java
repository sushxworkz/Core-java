class Swiggy{

	static String nonVegStarters[]={"ChaliKabab","Chicken65","Chickenpakoda","MuttonBurra","ChickenKebaba","MuttonKebab","Chickenlollipop","ManchurianChicken","Chickenfry","Chickenpakoda"};
	static String vegStarters[]={"PaniPuri","VegetarianSingrolls","ChilliPaneer","PaneerTikka","MeduVada","HarabarKabab","CorncheeseBalls","DahiVada","KahamanDhokla","RavaDokla"};
	static String nonVegMainCources[]={"ChickenBiryani","ChickenChettinad","MalabarPrawnCurry","ButterChicken","FishCurry","MuttonCurry","TunaCurry","Chickencurry","ChickenFry","ChilliChicken"};
	static String vegMainCources[]={"Gobi","PannerJafrei","AlooParata","AlooPalak","CreamyVegatableKora","DalTadka","TomatoCucumber","palakPaneer","ClintroMintChutney","Roti"};
	
	public static void main(String swiggy[]){
	
	System.out.println("Main Started");
		System.out.println("Welcome to Swiggy ");
		System.out.println("-----------------");
		
		System.out.println("The Non Veg Starters List\n");
		for(String nonVegStarter:nonVegStarters){
		System.out.println(nonVegStarter);
		}
		System.out.println("\n");
		System.out.println("The Veg Starters List\n");
		for(String vegStarter:vegStarters){
		System.out.println(vegStarter);
		}
		System.out.println("\n");
		System.out.println("The Non Veg Main Cources List\n");
		for(String nonVegMainCource:nonVegMainCources){
		System.out.println(nonVegMainCource);
		}
		System.out.println("\n");
		System.out.println("The Veg Main Cources  List\n");
		for(String vegMainCource:vegMainCources){
		System.out.println(vegMainCource);
		}
	System.out.println("Main Ended");
	}
}