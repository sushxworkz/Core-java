class RedBus{

	static String busNames[]={"SRS","VRL","Rjahansa","Gajanan","Sea Bird","sugma"};
	static String founderNames[]={"Panindr","Sudhakar","Chaan"};
	
	public static void main(String busName[]){
	
	System.out.println("Main Started");
	System.out.println("WELCOME TO RED BUS");
	
	for(String bus:busNames){
		System.out.println(bus);
		}
	for(String founder:founderNames){
		System.out.println(founder);
		}
	System.out.println("Main Ended");
	}
}